package raymond.TestInfo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

import com.vaadin.data.Result;
import com.vaadin.server.VaadinService;

import raymond.TestDB.DataService;
import raymond.TestDB.Pools;
import raymond.TestDB.Pools.Names;
import raymond.TestInfo.CustInfo;
import raymond.TestReserve.Room;
import raymond.dataprovider.filter.StatementHelper;

public class timeService  extends DataService<CustInfo>{
	public HashMap<Integer, String> stime = new HashMap<Integer, String>();
	public HashMap<Integer, String> etime = new HashMap<Integer, String>();
	public timeService (int flag) {
		super(Pools.getConnectionPool(Names.RAYMOND));
		int fid;
		if (flag == 1) fid = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("fid_modify");
		else fid = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("fid_create");
		sqlQuery = "SELECT SERVTIMEID, SERVTIME2, SERVENDTIME2 FROM SERVTIME WHERE FUNCTID = " + fid;
		
	}
	
	public void getTime() {
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int i = 1;
						int id = getInteger(rs, i++);
						DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
						//starttime
						LocalDateTime startdatetime = getLocalDateTime(rs, i++);
						String starttime = df.format(startdatetime);
						starttime = starttime.substring(starttime.indexOf(" ")+1);
						stime.put(id, starttime);
						//endtime
						LocalDateTime enddatetime = getLocalDateTime(rs,i++);
						String endtime = df.format(enddatetime);
						endtime = endtime.substring(endtime.indexOf(" ")+1);
						etime.put(id, endtime);
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("Unable to fetch results", e);
		}
	}

	public CustInfo getRow(ResultSet rs) throws SQLException {
		return null;
	}
	
	protected Result<CustInfo> get(Connection conn, String CustInfoId) throws SQLException {
		return null;
	}

	public Result<CustInfo> get(String CustInfoId) {
		return null;
	}

	public Collection<CustInfo> getAll() {
		return null;
	}

	public String storeRow(Connection conn, CustInfo row) throws SQLException {
		return null;
	}

	public Result<CustInfo> storeRow(CustInfo row) throws SQLException {
		return null;
	}
}
