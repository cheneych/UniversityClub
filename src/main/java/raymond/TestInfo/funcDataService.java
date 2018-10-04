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

import raymond.TestDB.DataService;
import raymond.TestDB.Pools;
import raymond.TestDB.Pools.Names;
import raymond.TestInfo.CustInfo;
import raymond.TestReserve.Room;
import raymond.dataprovider.filter.StatementHelper;

public class funcDataService extends DataService<CustInfo>{
	funcinfo u = new funcinfo();
	ArrayList<Integer> roomsid = new ArrayList<Integer>();
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	public funcDataService(int id, int flag) {
		super(Pools.getConnectionPool(Names.RAYMOND));
		if (flag == 0)
		sqlQuery = "SELECT STARTTIME2, ENDTIME2, FUNCTEXPNUMPPL, FUNCTACTNUMPPL, FUNCTGTDNUMPPL, "
				+ "SETUPTYPE FROM FUNCT WHERE FUNCTID =" + id;
		else if (flag == 1)
			sqlQuery = "SELECT SUDESC FROM SUTYPES WHERE SUTYPE = " + id;
		else if (flag == 2)
			sqlQuery = "SELECT FRID FROM TSLTT WHERE FUNCTID = " + id;
		else if (flag == 3) 
			sqlQuery = "SELECT FRDID, FRNAME FROM SFRDT";
		else if (flag == 4) 
			sqlQuery = "SELECT FUNCTNOTES FROM FUNCTNOTES WHERE FUNCTID = " + id;
	}
	
	public void getData() {
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int i = 1;
						u.setStarttime(getString(rs, i++)+"");
						u.setEndtime(getString(rs, i++)+"");
						u.setExpected(getString(rs, i++)+"");
						u.setActual(getString(rs, i++)+"");
						u.setGuaranteed(getString(rs, i++)+"");
						u.setStyle(getInteger(rs, i++));
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("Unable to fetch results", e);
		}
	}
	
	public void getData2() {
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int i = 1;
						u.setSetupstyle(getString(rs, i++)+"");
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("Unable to fetch results", e);
		}
	}
	
	public void getData3() {
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int i = 1;
						roomsid.add(getInteger(rs, i++));
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("Unable to fetch results", e);
		}
	}
	
	public void getData4() {
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int i = 1;
						map.put(getInteger(rs, i++), getString(rs, i++));
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("Unable to fetch results", e);
		}
	}
	
	public void getData5() {
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int i = 1;
						u.setNotes(getString(rs, i++));
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
