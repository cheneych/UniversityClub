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
public class HomeView extends TopBarView implements View {
	final transient Logger logger = LoggerFactory.getLogger(HomeView.class);
	//Components
	private Button create = new Button("Create a new Reservation");
	private Button searchPastBookings = new Button("Search past bookings");
	private Button settings = new Button("Settings");
	
	private StandardGridConfigurator configurator;
	//global variable
	Grid<Order> grid = new Grid<Order>(Order.class);
	public List<Order> orders = new ArrayList<>();
	
	public HomeView() {
		init();
	}

	public void init() {
		eventProcess();
		dataProcess();
		final HorizontalLayout layout2 = new HorizontalLayout(); 
		layout2.addComponents(create, searchPastBookings, settings);
		addComponent(layout2);
		
	}

	private void eventProcess(){
		searchPastBookings.addClickListener(e->{
			MyUI.navigateTo("search");
		});
		
		create.addClickListener(e->{
			MyUI.navigateTo("create");
		});
		
		settings.addClickListener(e->{
			MyUI.navigateTo("settings");
		});
	}

	private void dataProcess() {
		
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
	}
}
