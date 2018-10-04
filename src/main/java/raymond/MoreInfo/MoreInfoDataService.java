package raymond.MoreInfo;

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

public class MoreInfoDataService extends DataService<MoreInfo>{
	public ArrayList<MoreInfo> stylist = new ArrayList<MoreInfo>();
	
	public MoreInfoDataService() {
		super(Pools.getConnectionPool(Names.RAYMOND));
		sqlQuery = "SELECT SUTYPE, SUDESC FROM SUTYPES";
	}
	
	public void getData() {
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						MoreInfo more=new MoreInfo();
						int i = 1;
						more.setStyid(getString(rs,i++));
						more.setStsty(getString(rs, i++));
						stylist.add(more);
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("Unable to fetch results", e);
		}
	}

	public MoreInfo getRow(ResultSet rs) throws SQLException {
		return null;
	}
	
	protected Result<MoreInfo> get(Connection conn, String CustInfoId) throws SQLException {
		return null;
	}

	public Result<MoreInfo> get(String CustInfoId) {
		return null;
	}

	public Collection<MoreInfo> getAll() {
		return null;
	}

	public void storeRow(Connection conn, MoreInfo info) throws SQLException {
		int evtid = -1;
		int create_or_modify = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("create_or_modify");
		if (create_or_modify == 1)
			evtid = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("evtid_modify");
		else 
			evtid = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("evtid_create");
		
		try (CallableStatement call = conn.prepareCall("{call TEST.add_info(?,?,?) }")) {
			int x = 1;
			setString(call, x++, info.getBooking());
			setString(call, x++, info.getPostas());
			setString(call ,x++, Integer.toString(evtid));
			call.executeUpdate();
		}
		
		try (CallableStatement call = conn.prepareCall("{? = call TEST.add_func_info(?,?,?,?,?,?,?) }")) {
			int x = 1;
			System.out.println("evtid==="+evtid);
			call.registerOutParameter(x++, Types.NUMERIC);
			setString(call, x++, Integer.toString(evtid));
			setString(call, x++, info.getfName());
			setString(call, x++, info.getFuncpas());
			setString(call, x++, info.getExpected());
			setString(call, x++, info.getGua());
			setString(call, x++, info.getSet());
			setString(call, x++, info.getStyid());
			call.executeUpdate();
			VaadinService.getCurrentRequest().getWrappedSession()
			 .setAttribute("fid_create",call.getInt(1));
			System.out.print("look here" + call.getInt(1));
		}
	}

	public void storeRow(MoreInfo info) throws SQLException {
		try (Connection conn = dataSource.getConnection()) {
			 storeRow(conn, info);
			conn.commit();
		}
	}
	
}

