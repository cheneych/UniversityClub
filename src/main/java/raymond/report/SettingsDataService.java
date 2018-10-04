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

public class SettingsDataService extends DataService<Settings>{
	public ArrayList<Settings> stylist = new ArrayList<Settings>();
	
	public SettingsDataService() {
		super(Pools.getConnectionPool(Names.RAYMOND));
		sqlQuery = "";
	}
	
	public void getData() {
	}

	public Settings getRow(ResultSet rs) throws SQLException {
		return null;
	}
	
	protected Result<Settings> get(Connection conn, String CustInfoId) throws SQLException {
		return null;
	}

	public Result<Settings> get(String CustInfoId) {
		return null;
	}

	public Collection<Settings> getAll() {
		return null;
	}

	public void storeRow(Connection conn, Settings setting, String flag) throws SQLException {
		if (flag == "room") {
			try (CallableStatement call = conn.prepareCall("{call TEST.add_sysroom_info(?,?) }")) {
				int x = 1;
				setString(call, x++, setting.getRoomname());
				setString(call, x++, setting.getRoomcharge());
				call.executeUpdate();
			}
		} else if (flag == "item") {
			try (CallableStatement call = conn.prepareCall("{call TEST.add_sysitem_info(?,?,?) }")) {
				int x = 1;
				setString(call, x++, setting.getItemname());
				setString(call, x++, setting.getItemcharge());
				setString(call, x++, setting.getServeType());
				call.executeUpdate();
			}
		} else if (flag == "cus") {
			try (CallableStatement call = conn.prepareCall("{call TEST.add_syscus_info(?,?,?,?,?,?,?,?,?,?) }")) {
				int x = 1;
				setString(call, x++, setting.getCustname());
				setString(call, x++, setting.getCusphone());
				setString(call, x++, setting.getCusadd());
				setString(call, x++, setting.getCuscity());
				setString(call, x++, setting.getCusstate());
				setString(call, x++, setting.getCuspost());
				setString(call, x++, setting.getCusbadd());
				setString(call, x++, setting.getCusbcity());
				setString(call, x++, setting.getCusbstate());
				setString(call, x++, setting.getCusbpost());
				call.executeUpdate();
			}
		} else if (flag == "sales") {
			System.out.println("look here : " + setting.getTitleid());
			try (CallableStatement call = conn.prepareCall("{call TEST.add_syssales_info(?,?,?,?,?,?) }")) {
				int x = 1;
				setString(call, x++, setting.getSaleslastname());
				setString(call, x++, setting.getSalesfirstname());
				setString(call, x++, setting.getPassword());
				setString(call, x++, setting.getLoginid());
				setString(call, x++, setting.getTitleid());
				setString(call, x++, setting.getEmail());
				call.executeUpdate();
			}
		}
	}

	public void storeRow(Settings setting, String flag) throws SQLException {
		try (Connection conn = dataSource.getConnection()) {
			 storeRow(conn, setting, flag);
			conn.commit();
		}
	}
	
}

