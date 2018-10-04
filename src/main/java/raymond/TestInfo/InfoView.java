package raymond.TestInfo;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;
import com.vaadin.annotations.Theme;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Grid;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.TextField;
import com.vaadin.ui.TreeGrid;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextArea;

import raymond.ui.standardgrid.StandardGridConfigurator;
import raymond.Test.*;
import raymond.TestDetails.Items;
import raymond.TestDetails.ItemsForm;
import raymond.TestHomePage.OrderDataService;
import raymond.TestReserve.RoomDataService;
import raymond.dataprovider.filter.Filter;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.external.org.slf4j.Logger;
import com.vaadin.external.org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
@Theme("mytheme")
public class InfoView extends TopBarView implements View {
	//Components	
	TabSheet tabsheet=new TabSheet();
	//evt info
	Label uc=new Label("University Club");
	TextField bookName=new TextField("Booking Name");
	TextField postAs=new TextField("Post As/Readerboard");
	TextField bookId=new TextField("Booking ID");
	TextField funcName=new TextField("Function Name");
	TextField functPost=new TextField("Function Post As");
	TextField funcId=new TextField("Function ID");
	TextField status=new TextField("Status");
	TextField confirmDt=new TextField("Confirm Date");
	TextField dt=new TextField("Date");	
	Button evt_modify=new Button("Modify");
	//basic info
		//customer
	Label cusInfo=new Label("Basic Info");
	Label cusAdd1=new Label("Site Address");
	Label cusAdd2=new Label("Billing Address");
	Label cusAct=new Label("Custom Activity");
	TextField cname=new TextField("Customer");
	TextField phone=new TextField("Phone");
	TextField fax=new TextField("Fax");
	TextField add1=new TextField("Address 1");
	TextField add2=new TextField("Address 2");
	TextField city=new TextField("City");
	TextField state=new TextField("State");
	TextField zip=new TextField("Zip");
	TextField country=new TextField("Country");
	TextField add1b=new TextField("Address 1");
	TextField add2b=new TextField("Address 2");
	TextField cityb=new TextField("City");
	TextField stateb=new TextField("State");
	TextField zipb=new TextField("Zip");
	TextField countryb=new TextField("Country");
	TextField cmail=new TextField("E-mail");
		//salesperson
	TextField firstname=new TextField("FirstName");
	TextField lastname=new TextField("LastName");
	TextField mail=new TextField("E-mail");
	TextField title=new TextField("Title");
		//room info
	TextField st=new TextField("Start Time");
	TextField et=new TextField("End Time");
	TextField exp=new TextField("#Expected");
	TextField act = new TextField("#Set");
	TextField gua=new TextField("#Guaranteed");
	TextField style=new TextField("Setup Style");
	ComboBox<String> room=new ComboBox<>("Room(s)");
	TextField sec=new TextField("Section(s)");
	TextArea notes=new TextArea("Function Notes");
	Button room_modify=new Button("Modify");
		//item info
	ArrayList<Orderitems> order = new ArrayList<Orderitems>();
	TreeGrid<Orderitems> treeGrid=new TreeGrid<>();
	TreeDataProvider<Orderitems> dataProvider = (TreeDataProvider<Orderitems>) treeGrid.getDataProvider();
	TreeData<Orderitems> data = dataProvider.getTreeData();
	Button items_modify = new Button("Add more items");
	public OrderForm itemsform=new OrderForm(this);
		//Charges
	Label tit = new Label("Summaryof Charges");
	Grid<Money> charges = new Grid<Money>(Money.class);
	
	public InfoView()  {
		init();
	}

	public void init()  {
		eventProcess();
		dataProcess();
		GridLayout grid=new GridLayout(3,7);
		grid.addComponent(uc,0,0);
		grid.addComponent(dt,0,3);
		grid.addComponent(status,0,4);
		grid.addComponent(confirmDt,0,5);
		grid.addComponent(bookName,1,0);
		grid.addComponent(postAs,1,1);
		grid.addComponent(bookId,1,2);
		grid.addComponent(funcName,1,3);
		grid.addComponent(functPost,1,4);
		grid.addComponent(funcId,1,5);
		grid.addComponent(evt_modify,2,6);

		tabsheet.addTab(grid,"Evt Info");
		
		VerticalLayout tab2=new VerticalLayout();
		HorizontalLayout l1=new HorizontalLayout();
		HorizontalLayout l2=new HorizontalLayout();
		HorizontalLayout l3=new HorizontalLayout();
		HorizontalLayout l4=new HorizontalLayout();
		HorizontalLayout l5=new HorizontalLayout();
		l1.addComponents(cname,phone,fax,cmail);
		l2.addComponents(add1,add2,city,state,zip,country);
		l3.addComponents(add1b,add2b,cityb,stateb,zipb,countryb);
//		l2.addComponents(contact,sPhone,mail);
//		l3.addComponents(osContact,sPer,bookMgr);
//		l4.addComponents(st,et);
//		l5.addComponents(exp,gua,style,room, sec);
		tab2.addComponents(cusInfo,l1,cusAdd1,l2,cusAdd2,l3,cusAct,l4);
		tabsheet.addTab(tab2,"Customer Info");
		//sales
		VerticalLayout tab3=new VerticalLayout();
		HorizontalLayout l6 = new HorizontalLayout();
		HorizontalLayout l7 = new HorizontalLayout();
		l6.addComponents(firstname, lastname);
		l7.addComponents(title, mail);
		tab3.addComponents(l6, l7);
		tabsheet.addTab(tab3,"Sales Info");
		//room
		VerticalLayout tab4=new VerticalLayout();
		HorizontalLayout l8 = new HorizontalLayout();
		HorizontalLayout l9 = new HorizontalLayout();
		HorizontalLayout l10 = new HorizontalLayout();
		l8.addComponents(st, et); l9.addComponents(exp, gua, act); l10.addComponents(style, room, sec);
		notes.setSizeFull();
		tab4.addComponents(l8, l9, l10, notes, room_modify);
		tabsheet.addTab(tab4,"Room Info");
		
		VerticalLayout tab5=new VerticalLayout();
		HorizontalLayout l11 = new HorizontalLayout();
		l11.addComponents(itemsform, items_modify);
		tab5.addComponents(treeGrid, l11);
		l11.setSizeFull();
		l11.setComponentAlignment(items_modify, Alignment.TOP_RIGHT);
		tabsheet.addTab(tab5,"Items Info");
		
		VerticalLayout tab6=new VerticalLayout();
		tab6.addComponents(tit, charges);
		tabsheet.addTab(tab6,"Charges");
		addComponent(tabsheet);
	}

	private void eventProcess(){	
		//event
		evt_modify.addClickListener(e->{
			MyUI.navigateTo("newinfo");
		});
		//room
		room_modify.addClickListener(e->{
			MyUI.navigateTo("reservation");
		});
		//items
		items_modify.addClickListener(e-> {
			MyUI.navigateTo("details");
		});
		treeGrid.asSingleSelect().addValueChangeListener(e->{
			if (e.getValue()==null) {
				itemsform.setVisible(false);
			}else {
				itemsform.setItems(e.getValue());
				itemsform.setVisible(true);
			}
		});
	}

	private void dataProcess() {
		//customer info filled
		int custid=(int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("custid");
		System.out.println(custid);
		CustDataService service = new CustDataService(custid);
		service.getData();
		cname.setValue(service.u.getCustomer());
		phone.setValue(service.u.getPhone());
		fax.setValue(service.u.getFax());
		add1.setValue(service.u.getAdd1());
		add2.setValue(service.u.getAdd2());
		city.setValue(service.u.getCity());
		state.setValue(service.u.getState());
		zip.setValue(service.u.getZip());
		country.setValue(service.u.getCountry());
		add1b.setValue(service.u.getBadd1());
		add2b.setValue(service.u.getBadd2());
		cityb.setValue(service.u.getBcity());
		stateb.setValue(service.u.getBstate());
		zipb.setValue(service.u.getBzip());
		countryb.setValue(service.u.getBcountry());
		mail.setValue(service.u.getMail());
		//evt
		int evtid=(int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("evtid_modify");
		System.out.println(evtid);
		evtDataService service2 = new evtDataService(evtid, 0);
		service2.getData();
		bookName.setValue(service2.u.getEvtname());
		postAs.setValue(service2.u.getPostas());
		bookId.setValue(service2.u.getEvtid());
		status.setValue(service2.u.getEvtstatus());
		{
			String tmpstr = service2.u.getConfdate(); 
			if (tmpstr.length() >= 10) confirmDt.setValue(tmpstr.substring(0, 10));
			else confirmDt.setValue(tmpstr);
		}
		{
			String tmpstr = service2.u.getEvtstart(); 
		    if (tmpstr.length() >= 10) dt.setValue(tmpstr.substring(0, 10)); 
		    else dt.setValue(tmpstr);
		}
		int fid=(int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("fid_modify");
		System.out.println("fid: " + fid);
		service2 = new evtDataService(fid, 1);
		service2.getData2();
		if (service2.u.getFname() != null) funcName.setValue(service2.u.getFname());
		if (service2.u.getFposas() != null) functPost.setValue(service2.u.getFposas());
		if (service2.u.getFid() != null) funcId.setValue(service2.u.getFid());
		//salesman will need it later, because currently there is no sales id
		/*int spid=(int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("spid_modify");
		System.out.println("spid: " + spid);
		spDataService service3 = new spDataService(spid);
		service3.getData();
		firstname.setValue(service3.u.getFirstname()); firstname.setWidth("300");
		lastname.setValue(service3.u.getLastname()); lastname.setWidth("300");
		title.setValue(service3.u.getTitle()); title.setWidth("300");
		mail.setValue(service3.u.getEmail());  mail.setWidth("300");*/
		//room
		System.out.println("fid: " + fid);
		funcDataService service4 = new funcDataService(fid, 0);
		service4.getData();
		if (service4.u.getStarttime().length() >= 16) st.setValue(service4.u.getStarttime().substring(11, 16)); 
		if (service4.u.getEndtime().length() >= 16) et.setValue(service4.u.getEndtime().substring(11, 16)); 
		exp.setValue(service4.u.getExpected()); act.setValue(service4.u.getActual()); gua.setValue(service4.u.getGuaranteed());
	    service4 = new funcDataService(service4.u.getStyle(), 1);
		service4.getData2();
        if (service4.u.getSetupstyle() != null) style.setValue(service4.u.getSetupstyle()); 
        else style.setValue("T.B.D.");
		//room.setValue();
        service4 = new funcDataService(fid, 2);
        service4.getData3();
        funcDataService service5 = new funcDataService(fid, 3);
        service5.getData4();
        List<String> rooms = new ArrayList<>();
        for (int i = 0; i < service4.roomsid.size(); i++) {
        	rooms.add(service5.map.get(service4.roomsid.get(i)));
        }
        room.setItems(rooms);
        if (rooms.size() > 0) room.setSelectedItem(rooms.get(0));
        //sec.setValue();
		//notes.setValue();
        service4 = new funcDataService(fid, 4);
        service4.getData5();
        if (service4.u.getSetupstyle() != null) notes.setValue(service4.u.getNotes());
        else notes.setValue("nothing...");
		//items
		itemsform.setVisible(false);
		 //get related date from db
		OrderitemsService iservice = new OrderitemsService(1); iservice.getData();
		headerService hservice = new headerService(); hservice.getHeader();
		timeService tservice = new timeService(1); tservice.getTime(); 
		HashMap<Integer, Boolean> mp = new HashMap<Integer, Boolean>(); //id to headerdesc
		HashMap<String, Orderitems> parent = new HashMap<String, Orderitems>();
		HashSet<String> servicetime = new HashSet<String>(); 
		 //put data in the new list
		for (int i=0; i<iservice.order.size();i++) {
			Orderitems tmp = iservice.order.get(i);
			String starttime = tservice.stime.get(tmp.getTimeid());
			String endtime = tservice.etime.get(tmp.getTimeid());
			String timeheadidcombine = starttime + endtime + tmp.getHeaderid();
			if (!servicetime.contains(timeheadidcombine)) {
				if (!mp.containsKey(tmp.getHeaderid())) { //headerid first appear
					mp.put(tmp.getHeaderid(), true);
					String header = hservice.header.get(tmp.getHeaderid());
					order.add(new Orderitems(tmp.getTimeid(), header, null, null));
					parent.put(timeheadidcombine, order.get(order.size()-1));
				}
				servicetime.add(timeheadidcombine);
				order.add(new Orderitems(tmp.getTimeid(), null, starttime, endtime));
				parent.put(tmp.getHeaderid().toString(), order.get(order.size()-1));
			}
			order.add(new Orderitems(tmp.getId(), tmp.getHeaderid(), tmp.getItem(), tmp.getQty(), tmp.getCharge(), tmp.getTotal()));
		}
		 //create tree grid
		for (int i=0; i<order.size(); i++) {
			Orderitems tmp = order.get(i);
			if (tmp.getService() == null && tmp.getTimeid() == null) {
				data.addItems(parent.get(tmp.getHeaderid()), tmp);
			} else if (tmp.getTimeid() == null) {
				data.addItem(null, tmp);
			} else {
				String starttime = tmp.getStarttime();
				String endtime = tmp.getEndtime();
				String timeheadidcombine = starttime + endtime + tmp.getHeaderid();
				data.addItem(parent.get(timeheadidcombine), tmp);
			}
		}
		//set columns of tree grid
		treeGrid.addColumn(Orderitems::getService).setCaption("Service Name");
		treeGrid.addColumn(Orderitems::getItem).setCaption("Item");
		treeGrid.addColumn(Orderitems::getQty).setCaption("Qty");
		treeGrid.addColumn(Orderitems::getCharge).setCaption("Charge");
		treeGrid.addColumn(Orderitems::getTotal).setCaption("Total");
		treeGrid.addColumn(Orderitems::getStarttime).setCaption("Start Time");
		treeGrid.addColumn(Orderitems::getEndtime).setCaption("End Time");
		//change size and refresh treegrid
		treeGrid.setSizeFull();
		dataProvider.refreshAll();
		//charges
		charges.setColumns("desc", "charges", "srv_Chg", "other", "st_Tax", "tax2", 
				   			"tax3", "tax4", "tax5", "sub_Totals");
		charges.setSizeFull();
		MoneyDataService moneyservice = new MoneyDataService(fid);
		charges.setDataProvider(moneyservice.getDataProvider());
	}
	
//	public String filter(Object s) {
//		if (s.equals(null))
//			return "";
//		return s.toString();
//	}
	@Override
	public void enter(ViewChangeEvent event) {
	}
}
