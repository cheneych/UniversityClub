package raymond.TestReserve;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;

import com.vaadin.data.Result;
import com.vaadin.server.VaadinService;

import raymond.TestDB.DataService;
import raymond.TestDB.Pools;
import raymond.TestDB.Pools.Names;
import raymond.dataprovider.filter.StatementHelper;

public class RoomDataService extends DataService<Room> {
	public ArrayList<Room> roomList = new ArrayList<Room>();
	
	public RoomDataService() {
		super(Pools.getConnectionPool(Names.RAYMOND));
	}
	
	public RoomDataService(String st) {
		super(Pools.getConnectionPool(Names.RAYMOND));
		//System.out.println("enter ser");
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement stmt = conn.prepareStatement("SELECT FRNAME, FRSPRID FROM SFRDT")) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						 String str=getString(rs,1);
						 int tmp=getInteger(rs,2);
						 roomList.add(new Room(str,tmp));
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("Unable to fetch results", e);
		}
		
		String sqlStr = "SELECT FUNCTALLROOMNAMES,FUNCTSTARTTIME,FUNCTENDTIME FROM QUERY_OCCUPIEDROOMS  WHERE to_char(FUNCTDATE,'YYYY-MM-DD')='"+st+"'";
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement stmt = conn.prepareStatement(sqlStr)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int i=1;
						System.out.println("Getting row");
						String str=(getString(rs,i++));
						System.out.println(str);
						System.out.println(roomList.size());
						for (int j=0;j<roomList.size();j++)
							if (roomList.get(j).getRoom().equals(str)) {
								LocalTime ts=getLocalTime(rs, i++);
								String s=ts.toString();
								s=s.substring(0,s.indexOf(':'));
								int ks=Integer.parseInt(s);
								
								LocalTime te=getLocalTime(rs, i++);
								String s2=te.toString();
								s2=s2.substring(0,s2.indexOf(':'));
								int ke=Integer.parseInt(s2)+1;
								
								if (1>=ks && 1<ke) roomList.get(j).setA1(true); else roomList.get(j).setA1(false);
								if (2>=ks && 2<ke) roomList.get(j).setA2(true); else roomList.get(j).setA2(false);
								if (3>=ks && 3<ke) roomList.get(j).setA3(true); else roomList.get(j).setA3(false);
								if (4>=ks && 4<ke) roomList.get(j).setA4(true); else roomList.get(j).setA4(false);
								if (5>=ks && 5<ke) roomList.get(j).setA5(true); else roomList.get(j).setA5(false);
								if (6>=ks && 6<ke) roomList.get(j).setA6(true); else roomList.get(j).setA6(false);
								if (7>=ks && 7<ke) roomList.get(j).setA7(true); else roomList.get(j).setA7(false);
								if (8>=ks && 8<ke) roomList.get(j).setA8(true); else roomList.get(j).setA8(false);
								if (9>=ks && 9<ke) roomList.get(j).setA9(true); else roomList.get(j).setA9(false);
								if (10>=ks && 10<ke) roomList.get(j).setA10(true); else roomList.get(j).setA10(false);
								if (11>=ks && 11<ke) roomList.get(j).setA11(true); else roomList.get(j).setA11(false);
								if (12>=ks && 12<ke) roomList.get(j).setA12(true); else roomList.get(j).setA12(false);
								
								if (13>=ks && 13<ke) roomList.get(j).setP1(true); else roomList.get(j).setP1(false);
								if (14>=ks && 14<ke) roomList.get(j).setP2(true); else roomList.get(j).setP2(false);
								if (15>=ks && 15<ke) roomList.get(j).setP3(true); else roomList.get(j).setP3(false);
								if (16>=ks && 16<ke) roomList.get(j).setP4(true); else roomList.get(j).setP4(false);
								if (17>=ks && 17<ke) roomList.get(j).setP5(true); else roomList.get(j).setP5(false);
								if (18>=ks && 18<ke) roomList.get(j).setP6(true); else roomList.get(j).setP6(false);
								if (19>=ks && 19<ke) roomList.get(j).setP7(true); else roomList.get(j).setP7(false);
								if (20>=ks && 20<ke) roomList.get(j).setP8(true); else roomList.get(j).setP8(false);
								if (21>=ks && 21<ke) roomList.get(j).setP9(true); else roomList.get(j).setP9(false);
								if (22>=ks && 22<ke) roomList.get(j).setP10(true); else roomList.get(j).setP10(false);
								if (23>=ks && 23<ke) roomList.get(j).setP11(true); else roomList.get(j).setP11(false);
								roomList.get(j).setP12(false);
							} 
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("Unable to fetch results", e);
		}
		
	}
	

	@Override
	public Room getRow(ResultSet rs) throws SQLException {
		return null;
	}

	protected Result<Room> get(Connection conn, String RoomId) throws SQLException {

		try (PreparedStatement stmt = conn.prepareStatement("select * from EVENT where EVTID = 33600")) {
			setString(stmt, 1, RoomId);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					return Result.ok(getRow(rs));
				}
			}
		}

		return Result.error("Could not get Room record for id " + RoomId);

	}

	public Result<Room> get(String RoomId) {

		try (Connection conn = dataSource.getConnection()) {
			return get(conn, RoomId);
		} catch (SQLException e) {
			logger.error("Could not get record {}", RoomId);
		}

		return Result.error("Could not get Room record for id " + RoomId);

	}

	public Collection<Room> getAll() {

		ArrayList<Room> list = new ArrayList<Room>();
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

	public void storeRow(Connection conn, LocalDateTime starttime, LocalDateTime endtime, int id, LocalDateTime date) throws SQLException {
		int fid = -1;
		int create_or_modify = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("create_or_modify");
		if (create_or_modify == 1)
			fid = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("fid_modify");
		else 
			fid = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("fid_create");
		System.out.println("store:"+fid);
		
		try (CallableStatement call = conn.prepareCall("{call TEST.add_room_start_end_time(?,?,?) }")) {
			int x = 1;
			setString(call, x++, fid);
			setTimestamp(call, x++, starttime);
			setTimestamp(call, x++, endtime);
			call.executeUpdate();
		}
		
		try (CallableStatement call = conn.prepareCall("{call TEST.add_room_occupied(?,?) }")) {
			int x = 1;
			setString(call, x++, id);
			setString(call, x++, fid);
			call.executeUpdate();
		}
		
		try (CallableStatement call = conn.prepareCall("{call TEST.evt_start_end_time(?, ?) }")) {
			int x = 1;
			int eid;
			if (create_or_modify == 0)
			eid = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("evtid_create");
			else eid = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("evtid_modify");
			setTimestamp(call, x++, date);
			setString(call, x++, eid);
			System.out.println("date :" + date + " id : " + eid);
			call.executeUpdate();
		}

	}

	public Result<Room> storeRow(LocalDateTime starttime, LocalDateTime endtime, int id, LocalDateTime date) throws SQLException {
		try (Connection conn = dataSource.getConnection()) {
			 storeRow(conn, starttime, endtime, id, date);
			conn.commit();
			//return get(conn, s);
			return null;
		}
	}
}