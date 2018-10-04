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

public class CustDataService extends DataService<CustInfo>{
	CustInfo u = new CustInfo();
	public CustDataService(int custid) {
		super(Pools.getConnectionPool(Names.RAYMOND));
		sqlQuery = "SELECT CUSTNAME,CUSTPHONE,CUSTFAX,CUSTEMAILADDRESS,\r\n" + 
				   "CUSTADD1,CUSTADD2,CUSTCITY,CUSTSTATE,CUSTPOSTCODE,CUSTCNTRY,\r\n" + 
				   "CUSTBADD1,CUSTBADD2,CUSTBCITY,CUSTBSTATE,CUSTBPOSTCODE,CUSTBCNTRY FROM CUSTT WHERE CUSTID="+custid;
	}
	
	public void getData() {
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int i = 1;
						u.setCustomer(getString(rs, i++)+"");
						u.setPhone(getString(rs,i++)+"");
						u.setFax(getString(rs,i++)+"");
						u.setMail(getString(rs, i++)+"");
						u.setAdd1(getString(rs, i++)+"");
						u.setAdd2(getString(rs,i++)+"");
						u.setCity(getString(rs,i++)+"");
						u.setState(getString(rs, i++)+"");
						u.setZip(getString(rs,i++)+"");
						u.setCountry(getString(rs, i++)+"");
						u.setBadd1(getString(rs, i++)+"");
						u.setBadd2(getString(rs,i++)+"");
						u.setBcity(getString(rs,i++)+"");
						u.setBstate(getString(rs, i++)+"");
						u.setBzip(getString(rs,i++)+"");
						u.setBcountry(getString(rs, i++)+"");
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
