package raymond.TestInfo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import com.vaadin.data.Result;
import com.vaadin.server.VaadinService;

import raymond.TestDB.DataService;
import raymond.TestDB.Pools;
import raymond.TestDB.Pools.Names;
import raymond.TestInfo.CustInfo;
import raymond.TestReserve.Room;
import raymond.dataprovider.filter.StatementHelper;

public class headerService  extends DataService<CustInfo>{
	public HashMap<Integer, String> header = new HashMap<Integer, String>();
	public headerService () {
		super(Pools.getConnectionPool(Names.RAYMOND));
		sqlQuery = "SELECT HEADERTYPEID, HEADERDESC FROM HEADERTYPES";	
	}
	
	public void getHeader() {
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int i = 1;
						int id = getInteger(rs, i++);
						String name = getString (rs, i++);
						header.put(id, name);
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
