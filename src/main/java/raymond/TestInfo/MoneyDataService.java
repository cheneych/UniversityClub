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
import raymond.TestHomePage.Order;
import raymond.TestInfo.CustInfo;
import raymond.TestReserve.Room;
import raymond.dataprovider.filter.StatementHelper;

public class MoneyDataService extends DataService<Money>{
	public MoneyDataService(int fid) {
		super(Pools.getConnectionPool(Names.RAYMOND));
		sqlQuery = "select sum(servitemchrg * servitemqty) as charges,  sum(tax1) as tax1, sum(tax2) as tax2, sum(tax3) as tax3, sum(tax4) as tax4," + 
				"sum(tax5) as tax5, sum(othchg) as other, sum(srvchg) as srvchg, sum(total) as total, headerdesc" + 
				" from webbilling w LEFT JOIN HEADERTYPES h ON w.HEADERTYPEID = h.HEADERTYPEID " + 
				"where functid = " + fid +  " group BY headerdesc";
	}
	
	@Override
	public Money getRow(ResultSet rs) throws SQLException {
		Money m = new Money();
		int i = 1;
		m.setCharges(getString(rs, i++) + "");
		m.setSt_Tax(getString(rs, i++) + "");
		m.setTax2(getString(rs, i++) + "");
		m.setTax3(getString(rs, i++) + "");
		m.setTax4(getString(rs, i++) + "");
		m.setTax5(getString(rs, i++) + "");
		m.setOther(getString(rs, i++) + "");
		m.setSrv_Chg(getString(rs, i++) + "");
		m.setSub_Totals(getString(rs, i++) + "");
		m.setDesc(getString(rs, i++) + "");
		return m;
	}
}
