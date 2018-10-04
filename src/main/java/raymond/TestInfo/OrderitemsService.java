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
import com.vaadin.server.VaadinService;

import raymond.TestDB.DataService;
import raymond.TestDB.Pools;
import raymond.TestDB.Pools.Names;
import raymond.TestInfo.CustInfo;
import raymond.TestReserve.Room;
import raymond.dataprovider.filter.StatementHelper;

public class OrderitemsService  extends DataService<CustInfo>{
	public ArrayList<Orderitems> order = new ArrayList<Orderitems>();
	public OrderitemsService (int flag) {
		super(Pools.getConnectionPool(Names.RAYMOND));
		int fid;
		if (flag == 1) fid = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("fid_modify");
		else fid = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("fid_create");
		System.out.println(fid);
		sqlQuery = "SELECT SERVITEMID, HEADERTYPEID, SERVTIMEID, SERVITEMNAME, SERVITEMCHRG, SERVITEMCOST, SERVITEMQTY"
				+ " FROM SERVITEMS WHERE FUNCTID = "+ fid;
		
	}
	
	public void getData() {
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int i = 1;
						int id = getInteger(rs, i++);
						int headerid = getInteger(rs, i++);
						int timeid = getInteger(rs, i++);
						String name = getString (rs, i++);
						double chrg = Double.parseDouble(getString (rs, i++));
						double cost = Double.parseDouble(getString (rs, i++));
						int qty = getInteger(rs, i++);
						order.add(new Orderitems(id, headerid, timeid, name, chrg, cost, qty));
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
