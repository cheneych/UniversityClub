package raymond.TestHomePage;
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
import raymond.TestReserve.Room;
import raymond.dataprovider.filter.StatementHelper;

public class IsValidCusService extends DataService<Integer>{
	public IsValidCusService(String custid) {
		super(Pools.getConnectionPool(Names.RAYMOND));
		sqlQuery = "SELECT count(*) FROM custt WHERE custid="+custid;
	}
	
	public int getData() {
		int count = 0;
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int i = 1;
						count = getInteger(rs, i++);
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("Unable to fetch results", e);
		}
		return count;
	}

	public Integer getRow(ResultSet rs) throws SQLException {
		return null;
	}
	
	protected Result<Integer> get(Connection conn, String CustInfoId) throws SQLException {
		return null;
	}

	public Result<Integer> get(String CustInfoId) {
		return null;
	}

	public Collection<Integer> getAll() {
		return null;
	}

	public void storeRow(Connection conn, String custid) throws SQLException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); 
		try (CallableStatement call = conn.prepareCall("{? = call TEST.create_res(?,?) }")) {

			int x = 1;
			call.registerOutParameter(x++, Types.NUMERIC);
			setString(call, x++, custid);
			setTimestamp(call, x++, date);
			call.executeUpdate();
			System.out.println(call.getInt(1));
			VaadinService.getCurrentRequest().getWrappedSession()
			 .setAttribute("evtid_create",call.getInt(1));
		}
	}

	public void storeRow(String custid) throws SQLException {
		try (Connection conn = dataSource.getConnection()) {
			 storeRow(conn, custid);
			conn.commit();
			//return get(conn, s);
		}
	}
	
}
