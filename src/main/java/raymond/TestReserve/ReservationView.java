package raymond.TestReserve;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateTimeField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Grid;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Tree;
import com.vaadin.ui.TreeGrid;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.MenuBar.MenuItem;

import raymond.Test.MyUI;
import raymond.Test.TopBarView;
import raymond.TestHomePage.Order;
import raymond.TestHomePage.OrderDataService;
import raymond.dataprovider.filter.Filter;
import raymond.Test.*;

@SuppressWarnings("serial")
public class ReservationView extends TopBarView implements View {
	//Components
	Label DAT = new Label("Date & Time");

	TextField customer=new TextField("Customer");
	TextField sales=new TextField("Salesperson");
	
	
	TreeGrid<Room> treeGrid=new TreeGrid<>();
	TreeDataProvider<Room> dataProvider = (TreeDataProvider<Room>) treeGrid.getDataProvider();
	TreeData<Room> data = dataProvider.getTreeData();

	DateTimeField sDate = new DateTimeField("Start Time", LocalDateTime.now());
	DateTimeField eDate = new DateTimeField("End Time", LocalDateTime.now());
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	Button button=new Button("Search Rooms");
	Button nStep=new Button("Next Step");
	Button comfirm=new Button("Comfirm");

	FormLayout form1=new FormLayout();
	
	boolean b=false;
	int id=-1;
	
	LocalDateTime startdatetime, enddatetime, date;
	
	public ArrayList<Room> roomList = new ArrayList<Room>();

	public ReservationView() {
		init();
	}

	public void init() {
		dataProcess();
		eventProcess();
		//first layer
		//second layer
		final HorizontalLayout layout1=new HorizontalLayout();
		final VerticalLayout layout4=new VerticalLayout();
		final HorizontalLayout layout2=new HorizontalLayout();
		layout1.addComponents(sDate,eDate);
		layout4.addComponents(DAT,layout1);
		layout2.addComponents(form1,layout4,nStep);
		layout2.setSizeFull();
		layout2.setComponentAlignment(nStep, Alignment.MIDDLE_RIGHT);
		//third layer

		//forth layer
		final VerticalLayout layout3=new VerticalLayout();
		layout3.addComponents(button,treeGrid,comfirm);
		layout3.setComponentAlignment(comfirm, Alignment.BOTTOM_RIGHT);
		layout3.setSizeFull();

		addComponents(layout2,layout3);	

	}

	private void dataProcess() {
		comfirm.setVisible(false);
		//treegrid
		treeGrid.setVisible(false);
		treeGrid.setSizeFull();
		treeGrid.addColumn(Room::getRoom).setCaption("Room").setWidth(300).setStyleGenerator(e->{
			return "room";
		});
		treeGrid.addColumn(Room::getA4).setCaption("4a").setWidth(63).setStyleGenerator(e->{
			if (e.getA4().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getA5).setCaption("5a").setWidth(63).setStyleGenerator(e->{
			if (e.getA5().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getA6).setCaption("6a").setWidth(63).setStyleGenerator(e->{
			if (e.getA6().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getA7).setCaption("7a").setWidth(63).setStyleGenerator(e->{
			if (e.getA7().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getA8).setCaption("8a").setWidth(63).setStyleGenerator(e->{
			if (e.getA8().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getA9).setCaption("9a").setWidth(63).setStyleGenerator(e->{
			if (e.getA9().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getA10).setCaption("10a").setWidth(63).setStyleGenerator(e->{
			if (e.getA10().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getA11).setCaption("11a").setWidth(63).setStyleGenerator(e->{
			if (e.getA11().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getA12).setCaption("12a").setWidth(63).setStyleGenerator(e->{
			if (e.getA12().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getP1).setCaption("1p").setWidth(63).setStyleGenerator(e->{
			if (e.getP1().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getP2).setCaption("2p").setWidth(63).setStyleGenerator(e->{
			if (e.getP2().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getP3).setCaption("3p").setWidth(63).setStyleGenerator(e->{
			if (e.getP3().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getP4).setCaption("4p").setWidth(63).setStyleGenerator(e->{
			if (e.getP4().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getP5).setCaption("5p").setWidth(63).setStyleGenerator(e->{
			if (e.getP5().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getP6).setCaption("6p").setWidth(63).setStyleGenerator(e->{
			if (e.getP6().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getP7).setCaption("7p").setWidth(63).setStyleGenerator(e->{
			if (e.getP7().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getP8).setCaption("8p").setWidth(63).setStyleGenerator(e->{
			if (e.getP8().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getP9).setCaption("9p").setWidth(63).setStyleGenerator(e->{
			if (e.getP9().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getP10).setCaption("10p").setWidth(63).setStyleGenerator(e->{
			if (e.getP10().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getP11).setCaption("11p").setWidth(63).setStyleGenerator(e->{
			if (e.getP11().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getP12).setCaption("12p").setWidth(63).setStyleGenerator(e->{
			if (e.getP12().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getA1).setCaption("1a").setWidth(63).setStyleGenerator(e->{
			if (e.getA1().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getA2).setCaption("2a").setWidth(63).setStyleGenerator(e->{
			if (e.getA2().equals(false))
				return "gray";
			return "red";
		});
		treeGrid.addColumn(Room::getA3).setCaption("3a").setWidth(63).setStyleGenerator(e->{
			if (e.getA3().equals(false))
				return "gray";
			return "red";
		});
		//form1
		form1.addComponents(customer,sales);
	}

	private void eventProcess() {
		//search rooms
		button.addClickListener(e->{
			comfirm.setVisible(true);
			if (sDate.getValue().toLocalDate().equals(eDate.getValue().toLocalDate())) {
				RoomDataService service = new RoomDataService(sDate.getValue().toLocalDate().toString());
				int pre=-1,id=-1;
				data.clear(); //need to be cleared, otherwise room size will add 32 each time
				for (int i=0;i<service.roomList.size();i++) {
					if (service.roomList.get(i).getFrsprid()!=pre) {
						data.addItems(null, service.roomList.get(i));
						pre=service.roomList.get(i).getFrsprid();
						id=i;
					}else {
						data.addItems(service.roomList.get(id), service.roomList.get(i));
					}
				}
				roomList.clear();  //need to be cleared, otherwise room size will add 32 each time
				roomList.addAll(service.roomList); 
				dataProvider.refreshAll();
				treeGrid.setVisible(true);
			}
		});

		nStep.addClickListener(e->{
			MyUI.navigateTo("details","test");
		});
		
		sDate.addValueChangeListener(e->{
			treeGrid.setVisible(false);
		});
		
		eDate.addValueChangeListener(e->{
			treeGrid.setVisible(false);
		});
		
		comfirm.addClickListener(e->{
			if (b) {
				b=false;
				//update datebase
				RoomDataService service = new RoomDataService();
				try {
					System.out.println("comfirm "+"startdatetime:"+startdatetime+"enddatetime:"+enddatetime+"roomid:"+id);
					service.storeRow(startdatetime, enddatetime, id-1, date);
					id=-1;
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			else {
				//implement pop up window
			}
		});
		
		treeGrid.asSingleSelect().addValueChangeListener(e->{
			b=false;
			id=-1;
			for (int j=0;j<roomList.size();j++)
				if (roomList.get(j).getRoom().equals(e.getValue().getRoom())) {
					LocalTime ts=sDate.getValue().toLocalTime();
					String s=ts.toString();
					s=s.substring(0,s.indexOf(':'));
					int ks=Integer.parseInt(s);
					String tmpstarttime=sDate.getValue().toLocalDate().toString()+" "+s+":00:00";
					startdatetime = LocalDateTime.parse(tmpstarttime, formatter);
					String tmpdatetime = sDate.getValue().toLocalDate().toString()+" "+"00:00:00";
					date = LocalDateTime.parse(tmpdatetime, formatter);
					
					LocalTime te=eDate.getValue().toLocalTime();
					String s2=te.toString();
					s2=s2.substring(0,s2.indexOf(':'));
					int ke=Integer.parseInt(s2)+1;
					String tmpendtime=sDate.getValue().toLocalDate().toString()+" "+Integer.toString(ke)+":00:00";
					enddatetime = LocalDateTime.parse(tmpendtime, formatter);
					
					for (int i=ks;i<=ke;i++) {
						if (roomList.get(j).getA1() && ks<=1 && ke>=1) {
							break;
						}
						if (roomList.get(j).getA2() && ks<=2 && ke>=2) {
							break;
						}
						if (roomList.get(j).getA3() && ks<=3 && ke>=3) {
							break;
						}
						if (roomList.get(j).getA4() && ks<=4 && ke>=4) {
							break;
						}
						if (roomList.get(j).getA5() && ks<=5 && ke>=5) {
							break;
						}
						if (roomList.get(j).getA6() && ks<=6 && ke>=6) {
							break;
						}
						if (roomList.get(j).getA7() && ks<=7 && ke>=7) {
							break;
						}
						if (roomList.get(j).getA8() && ks<=8 && ke>=8) {
							break;
						}
						if (roomList.get(j).getA9() && ks<=9 && ke>=9){
							break;
						}
						if (roomList.get(j).getA10() && ks<=10 && ke>=10) {
							break;
						}
						if (roomList.get(j).getA11() && ks<=11 && ke>=11) {
							break;
						}
						
						if (roomList.get(j).getA12() && ks<=12 && ke>=12) {
							break;
						}
						if (roomList.get(j).getP1() && ks<=13 && ke>=13) {
							break;
						}
						if (roomList.get(j).getP2() && ks<=14 && ke>=14) {
							break;
						}
						if (roomList.get(j).getP3() && ks<=15 && ke>=15) {
							break;
						}
						if (roomList.get(j).getP4() && ks<=16 && ke>=16) {
							break;
						}
						if (roomList.get(j).getP5() && ks<=17 && ke>=17) {
							break;
						}
						if (roomList.get(j).getP6() && ks<=18 && ke>=18) {
							break;
						}
						if (roomList.get(j).getP7() && ks<=19 && ke>=19) {
							break;
						}
						if (roomList.get(j).getP8() && ks<=20 && ke>=20) {
							break;
						}
						if (roomList.get(j).getP9() && ks<=21 && ke>=21) {
							break;
						}
						if (roomList.get(j).getP10() && ks<=22 && ke>=22) {
							break;
						}
						if (roomList.get(j).getP11() && ks<=23 && ke>=23) {
							break;
						}
						if (roomList.get(j).getP12() && ks<=0 && ke>=0) {
							break;
						}
						if (i==ke) {
							b=true;
							id=j;
						}
					}
					break;
				}
		});
		
	}

}