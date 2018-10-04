package raymond.report;

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
import raymond.TestInfo.*;
import raymond.dataprovider.filter.Filter;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.external.org.slf4j.Logger;
import com.vaadin.external.org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
@Theme("mytheme")
public class ReportView extends TopBarView implements View {
	ArrayList<Orderitems> order = new ArrayList<Orderitems>();
	TreeGrid<Orderitems> treeGrid=new TreeGrid<>();
	TreeDataProvider<Orderitems> dataProvider = (TreeDataProvider<Orderitems>) treeGrid.getDataProvider();
	TreeData<Orderitems> data = dataProvider.getTreeData();
	public OrderForm itemsform = new OrderForm(this);
	Button next = new Button("Next");
	
	public ReportView()  {
		init();
	}
    
	public void init()  {
		eventProcess();
		dataProcess();
		VerticalLayout l1 = new VerticalLayout();
		l1.addComponents(next, treeGrid, itemsform);
		addComponent(l1);
	}

	private void eventProcess() {	
		//items
		treeGrid.asSingleSelect().addValueChangeListener(e->{
			if (e.getValue()==null) {
				itemsform.setVisible(false);
			}else {
				itemsform.setItems(e.getValue());
				itemsform.setVisible(true);
			}
		});
		
		next.addClickListener(e-> {
			MyUI.navigateTo("charge");
		});
	}

	private void dataProcess() {
		itemsform.setVisible(false);
		 //get related date from db
		int flag = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("create_or_modify");
		OrderitemsService iservice = new OrderitemsService(flag); iservice.getData();
		headerService hservice = new headerService(); hservice.getHeader();
		timeService tservice = new timeService(flag); tservice.getTime(); 
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
		treeGrid.collapse();
		dataProvider.refreshAll();
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
	}
}

