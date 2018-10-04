package raymond.TestDetails;

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

import com.vaadin.data.Result;import com.vaadin.server.VaadinService;

import raymond.TestDB.DataService;
import raymond.TestDB.Pools;
import raymond.TestDB.Pools.Names;
import raymond.TestReserve.Room;

public class CategoryDataService extends DataService<Category> {
	public ArrayList<Category> CateList = new ArrayList<Category>();
	public CategoryDataService() {
		super(Pools.getConnectionPool(Names.RAYMOND));
		//System.out.println("enter ser");
		String sqlStr = "select headertypeid,headerdesc,taxid,servpictkey,webitem from headertypes";
//		CateList.clear();
		
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement stmt = conn.prepareStatement(sqlStr)) {
				try (ResultSet rs = stmt.executeQuery()) {
					int i=0;
					while (rs.next()) {
						i=1;
						Category c=new Category();
						c.setHeadertypeid(getInteger(rs, i++));
						c.setHeaderdesc(getString(rs,i++));
						c.setTaxid(getInteger(rs, i++));
						c.setServpictkey(getString(rs, i++));
						c.setWebitem(getString(rs, i++));
						CateList.add(c);
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("Unable to fetch results", e);
		}
	}

	@Override
	public Category getRow(ResultSet rs) throws SQLException {
		return null;
	}

	protected Result<Category> get(Connection conn, String CategoryId) throws SQLException {

		try (PreparedStatement stmt = conn.prepareStatement("select * from EVENT where EVTID = 33600")) {
			setString(stmt, 1, CategoryId);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					return Result.ok(getRow(rs));
				}
			}
		}

		return Result.error("Could not get Category record for id " + CategoryId);

	}

	public Result<Category> get(String CategoryId) {

		try (Connection conn = dataSource.getConnection()) {
			return get(conn, CategoryId);
		} catch (SQLException e) {
			logger.error("Could not get record {}", CategoryId);
		}

		return Result.error("Could not get Category record for id " + CategoryId);

	}

	public Collection<Category> getAll() {

		ArrayList<Category> list = new ArrayList<Category>();
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

	public int storeRow(Connection conn, int catid, LocalDateTime starttime, LocalDateTime endtime) throws SQLException {
		int timeid = -1;
		try (CallableStatement call = conn.prepareCall("{? =  call test.add_time(?, ?, ?, ?) }")) {
			int x = 1;
			int fid;
			int create_or_modify = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("create_or_modify");
			if (create_or_modify == 0)
				fid = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("fid_create");
			else 
				fid = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("fid_modify");
			call.registerOutParameter(x++, Types.NUMERIC);
			setString(call, x++, fid);
			setString(call, x++, catid);
			setTimestamp(call, x++, starttime);
			setTimestamp(call, x++, endtime);
			call.executeUpdate();
			timeid = call.getInt(1);
		}
		System.out.println(timeid+"\n");
		return timeid;

	}

	public int storeRow(int catid, int subcatid, LocalDateTime starttime, LocalDateTime endtime) throws SQLException {
		try (Connection conn = dataSource.getConnection()) {
			int timeid = storeRow(conn, catid,starttime,endtime);
			conn.commit();
			return timeid;
		}
	}
}

