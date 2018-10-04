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

import com.vaadin.data.Result;

import raymond.TestDB.DataService;
import raymond.TestDB.Pools;
import raymond.TestDB.Pools.Names;
import raymond.TestInfo.CustInfo;
import raymond.TestReserve.Room;
import raymond.dataprovider.filter.StatementHelper;

public class evtDataService extends DataService<CustInfo>{
	evtInfo u = new evtInfo();
	public evtDataService(int id, int flag) {
		super(Pools.getConnectionPool(Names.RAYMOND));
		if (flag == 0)
			sqlQuery = "SELECT EVTNAME, POSTAS, EVTID, EVTSTATUS, CONFDATE2, EVTSTART2 FROM EVENT WHERE EVTID = " + id;
		else 
			sqlQuery = "SELECT FUNCTNAME, POSTFUNCTAS, FUNCTID FROM FUNCT WHERE FUNCTID = " + id;
	}
	
	public void getData() {
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int i = 1;
						u.setEvtname(getString(rs, i++)+"");
						u.setPostas(getString(rs,i++)+"");
						u.setEvtid(getString(rs,i++)+"");
						u.setEvtstatus(getString(rs, i++)+"");
						u.setConfdate(getString(rs, i++)+"");
						u.setEvtstart(getString(rs,i++)+"");
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
						u.setFname(getString(rs, i++)+""); System.out.println(u.getFname());
						u.setFposas(getString(rs,i++)+"");
						u.setFid(getString(rs,i++)+"");
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
