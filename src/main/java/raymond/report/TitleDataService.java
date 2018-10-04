package raymond.report;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import com.vaadin.data.Result;
import com.vaadin.server.VaadinService;

import raymond.TestDB.DataService;
import raymond.TestDB.Pools;
import raymond.TestDB.Pools.Names;
import raymond.TestDetails.Category;
import raymond.TestReserve.Room;
import raymond.dataprovider.filter.StatementHelper;

public class TitleDataService extends DataService<Title>{
	public ArrayList<Title> titList = new ArrayList<Title>();
	
	public TitleDataService() {
		super(Pools.getConnectionPool(Names.RAYMOND));
		sqlQuery = "SELECT GROUPID, GROUPNAME FROM SALESGROUPS";
	}
	
	public void getData() {
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						Title title = new Title();
						int i = 1;
						title.setGroupid(getInteger(rs,i++));
						title.setGroupname(getString(rs, i++));
						titList.add(title);
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("Unable to fetch results", e);
		}
	}

	public Title getRow(ResultSet rs) throws SQLException {
		return null;
	}
	
	protected Result<Title> get(Connection conn, String CustInfoId) throws SQLException {
		return null;
	}

	public Result<Title> get(String CustInfoId) {
		return null;
	}

	public Collection<Title> getAll() {
		return null;
	}

	public void storeRow(Connection conn, Title info) throws SQLException {
		try (CallableStatement call = conn.prepareCall("{call TEST.x(?,?,?) }")) {
			int x = 1;
//			setString(call, x++, title.);
//			setString(call, x++, title.);
//			setString(call ,x++, title.);
			call.executeUpdate();
		}
	}

	public void storeRow(Title title) throws SQLException {
		try (Connection conn = dataSource.getConnection()) {
			 storeRow(conn, title);
			conn.commit();
		}
	}
	
}

