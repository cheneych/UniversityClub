package raymond.TestHomePage;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;

import com.vaadin.data.Result;

import raymond.TestDB.DataService;
import raymond.TestDB.Pools;
import raymond.TestDB.Pools.Names;

public class OrderDataService extends DataService<Order> {

	public OrderDataService(String s,String attr) {
		super(Pools.getConnectionPool(Names.RAYMOND));
		//System.out.println("enter ser");
		if (attr.equals("date"))
			sqlQuery = "select functid, event.evtid, evtstart2 as day,custname as customer, evtname as name, custt.custid, event.spid from"
					+ "((custt left join event  on custt.custid=event.custid) "
					+ "left join funct on funct.evtid=event.evtid) "
					+ "WHERE (to_char(evtstart2,'YYYY-MM-DD'))='"+s+"'";
		else if (attr.equals("customer")) {
			char c=0;
			if (s.length()>0) {
				c=s.charAt(0);
			if (c>='0' && c<='9')
				sqlQuery = "select functid, event.evtid, evtstart2 as day, custname as customer,evtname as name,custt.custid, event.spid from "
						+ "((custt left join event  on custt.custid=event.custid) "
						+ "left join funct on funct.evtid=event.evtid) "
						+ "WHERE event.CUSTID="+s;
			else
				sqlQuery = "select functid, event.evtid, evtstart2 as day,custname as customer ,evtname as name,custt.custid, event.spid from "
						+ "((custt left join event  on custt.custid=event.custid) "
						+ "left join funct on funct.evtid=event.evtid) "
						+ " WHERE CUSTNAME="+"'"+s+"'";
		}
		}
	}

	@Override
	public Order getRow(ResultSet rs) throws SQLException {
		System.out.println("Getting row");
		Order u = new Order();
		int i = 1;
		u.setFid(getInteger(rs, i++));
		u.setEvtid(getInteger(rs, i++));
		u.setDay(getLocalDate(rs, i++));
		u.setCustName(getString(rs,i++));
//		u.setStartTime(getLocalTime(rs, i++));
//		u.setEndTime(getLocalTime(rs, i++));
		u.setEvtName(getString(rs, i++));
		u.setId(getInteger(rs,i++));
		u.setSpid(getInteger(rs, i++));
		//u.setRoom(getString(rs, i++));
		return u;

	}

	protected Result<Order> get(Connection conn, String OrderId) throws SQLException {

		try (PreparedStatement stmt = conn.prepareStatement("select * from EVENT where EVTID = 33600")) {
			setString(stmt, 1, OrderId);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					return Result.ok(getRow(rs));
				}
			}
		}

		return Result.error("Could not get Order record for id " + OrderId);

	}

	public Result<Order> get(String OrderId) {

		try (Connection conn = dataSource.getConnection()) {
			return get(conn, OrderId);
		} catch (SQLException e) {
			logger.error("Could not get record {}", OrderId);
		}

		return Result.error("Could not get Order record for id " + OrderId);

	}

	public Collection<Order> getAll() {

		ArrayList<Order> list = new ArrayList<Order>();
		try (Connection conn = dataSource.getConnection()) {
			try(PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {
				try(ResultSet rs = stmt.executeQuery()) {
					while(rs.next()) {
						list.add(getRow(rs));
					}
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public String storeRow(Connection conn, Order row) throws SQLException {

		try (CallableStatement call = conn.prepareCall("{ ? = call core.Order(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }")) {

			int x = 1;
			call.registerOutParameter(x++, Types.VARCHAR);

			setTimestamp(call, x++, row.getDay()); System.out.println("day: " + row.getDay());
			setString(call,x++,row.getCustName());
			setString(call, x++, row.getEvtName());

			call.executeUpdate();
			return call.getString(1);
		}

	}

	public Result<Order> storeRow(Order row) throws SQLException {
		try (Connection conn = dataSource.getConnection()) {
			String s = storeRow(conn, row);
			conn.commit();
			return get(conn, s);
		}
	}
}
