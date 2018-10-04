package raymond.TestInfo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import com.vaadin.data.Result;
import com.vaadin.server.VaadinService;
import raymond.TestDB.DataService;
import raymond.TestDB.Pools;
import raymond.TestDB.Pools.Names;

public class dropItemService extends DataService<Integer>{
	public dropItemService() {
		super(Pools.getConnectionPool(Names.RAYMOND));
		//sqlQuery = "DELETE FROM servitems WHERE SERVITEMID = "+itemid;
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

	public void storeRow(Connection conn, int itemid, double unitcost, double totalcost, int qty) throws SQLException {
		try (CallableStatement call = conn.prepareCall("{call TEST.updateItems(?,?,?,?) }")) {

			int x = 1;
			//call.registerOutParameter(x++, Types.NUMERIC);
			setString(call, x++, itemid);
			setString(call, x++, unitcost);
			setString(call, x++, totalcost);
			setString(call, x++, qty);
			call.executeUpdate();
		}
	}

	public void storeRow(int itemid, double unitcost, double totalcost, int qty) throws SQLException {
		try (Connection conn = dataSource.getConnection()) {
			storeRow(conn, itemid, unitcost, totalcost, qty);
			conn.commit();
		}
	}
	
	public void dropRow(Connection conn, int id, int flag) throws SQLException {
		try (CallableStatement call = conn.prepareCall("{call TEST.delItems(?,?) }")) {

			int x = 1;
			//call.registerOutParameter(x++, Types.NUMERIC);
			setString(call, x++, id);
			setString(call, x++, flag);
			call.executeUpdate();
		}
	}

	public void dropRow(int id, int flag) throws SQLException {
		try (Connection conn = dataSource.getConnection()) {
			dropRow(conn, id, flag);
			conn.commit();
		}
	}
	
}


