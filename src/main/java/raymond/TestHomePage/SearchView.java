package raymond.TestHomePage;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.thrift.TProcessor;

import com.vaadin.annotations.Theme;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.BrowserWindowOpener;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinService;
import com.vaadin.shared.Position;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.Notification;

import raymond.ui.standardgrid.StandardGridConfigurator;
import raymond.Test.*;
import raymond.TestDetails.Items;
import raymond.dataprovider.filter.Filter;

import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.external.org.slf4j.Logger;
import com.vaadin.external.org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
@Theme("mytheme")
//public class HomeView extends VerticalLayout implements View {
public class SearchView extends TopBarView implements View {
	final transient Logger logger = LoggerFactory.getLogger(HomeView.class);
	//Components
	private Button home = new Button("HOME");
	private Button dt = new Button("Search by Date");
	private Button cus = new Button("Search by Customer"); 
	
	TextField customer = new TextField();

	Label pstbkg = new Label("Past Bookings");
	
	DateField date = new DateField();
	
	private StandardGridConfigurator configurator;
	//global variable
	Grid<Order> grid = new Grid<Order>(Order.class);
	public List<Order> orders = new ArrayList<>();
	
	public SearchView() {
		init();
	}

	public void init() {
		eventProcess();
		dataProcess();
		final VerticalLayout layout2 = new VerticalLayout(); 
		final VerticalLayout layout4 = new VerticalLayout(); 
		final HorizontalLayout layout6 = new HorizontalLayout(); 
		final HorizontalLayout layout7 = new HorizontalLayout(); 
		layout6.addComponents(date, customer);
		layout7.addComponents(dt, cus);
		layout4.addComponents(pstbkg, layout7, layout6, grid);
		//layout2.setSizeFull();
		layout2.addComponents(home,layout4);
		addComponents(layout2);
	}

	private void eventProcess(){
		
		dt.addClickListener(e->{
			dt.setVisible(false); //dt is button
			customer.setVisible(false); //customer is textfield
			date.setVisible(true); //date is calendar
			cus.setVisible(false); //cus is button
		});
		
		cus.addClickListener(e->{
			cus.setVisible(false);
			customer.setVisible(true);
			dt.setVisible(false);
			date.setVisible(false);
		});
		
		home.addClickListener(e->{
			MyUI.navigateTo("home"); 
		});        
		
		date.addValueChangeListener(e->{ //1 set grid visible 2 get user typed value 3 get data from db 
			grid.setVisible(true); 
			String s = e.getValue().toString();
			//System.out.println(s);
			OrderDataService service = new OrderDataService(s,"date");
			grid.setDataProvider(service.getDataProvider());
			cus.setVisible(true);
			dt.setVisible(true);
			date.setVisible(false);
		});
		
		customer.addValueChangeListener(e->{ //1 set grid visible 2 get user typed value 3 get data from db
			grid.setVisible(true);
			String s = e.getValue().toString();
			OrderDataService service2 = new OrderDataService(s,"customer");
			DataProvider<Order, Filter> provider = DataProvider.fromFilteringCallbacks(query -> service2.fetch(query),query -> service2.count(query));
			grid.setDataProvider(provider);
			cus.setVisible(true);
			dt.setVisible(true);
			customer.setVisible(false);
		});
		
		grid.asSingleSelect().addValueChangeListener(e->{
			VaadinService.getCurrentRequest().getWrappedSession()
			 .setAttribute("evtid_modify",grid.asSingleSelect().getValue().getEvtid());
			//System.out.println("here" + grid.asSingleSelect().getValue().getEvtid());
			VaadinService.getCurrentRequest().getWrappedSession()
			 .setAttribute("custid",grid.asSingleSelect().getValue().getId());
			VaadinService.getCurrentRequest().getWrappedSession()
			 .setAttribute("fid_modify",grid.asSingleSelect().getValue().getFid());
			VaadinService.getCurrentRequest().getWrappedSession()
			 .setAttribute("create_or_modify",1); //if search, then create_or_modify = 1
			VaadinService.getCurrentRequest().getWrappedSession()
			 .setAttribute("spid_modify",grid.asSingleSelect().getValue().getSpid());
			MyUI.navigateTo("info"); 
		});
		
	}

	private void dataProcess() {
		customer.setVisible(false);
		customer.setPlaceholder("Type customer ID or Name");
		customer.setWidth("300px");

		//date
		date.setValue(LocalDate.now());

		//grid
		grid.setColumns("evtName","custName","day","id","evtid","fid"); //grid has lots of properties, here are 6 of them
		grid.getColumn("id").setHidden(true);
		grid.getColumn("evtid").setHidden(true);
		grid.getColumn("fid").setHidden(true);
		grid.setSizeFull();
		grid.setWidth("1000px");
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
	}
}
