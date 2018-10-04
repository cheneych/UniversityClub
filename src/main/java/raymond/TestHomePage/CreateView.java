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
public class CreateView extends TopBarView implements View {
	final transient Logger logger = LoggerFactory.getLogger(HomeView.class);
	//Components
	private Button reserve = new Button("Create");
	private Button home = new Button("HOME");

	TextField member = new TextField("Customer ID");
	
	private StandardGridConfigurator configurator;
	//global variable
	
	public CreateView() {
		init();
	}

	public void init() {
		eventProcess();
		dataProcess();
		final VerticalLayout layout2 = new VerticalLayout(); 
		final VerticalLayout layout5 = new VerticalLayout(); 
		layout5.addComponents(member, reserve);
		layout2.addComponents(home, layout5);
		addComponents(layout2);
	}

	private void eventProcess(){
		home.addClickListener(e->{
			MyUI.navigateTo("home"); 
		});        

		reserve.addClickListener(e->{
			String custid = member.getValue();
			System.out.println("custid " + custid);
			if (!custid.equals("")) { 
				/* 1 check if id exists 
				   2 create a new event
				   3 redirect to new page */
				IsValidCusService service = new IsValidCusService(custid);
				int count = service.getData();
				if (count == 1) {
					//set custid in session
					VaadinService.getCurrentRequest().getWrappedSession().setAttribute("cur_custid", custid);
					//insert into evt
					try {
						service.storeRow(custid);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					//if create, then create_or_modify = 0
					VaadinService.getCurrentRequest().getWrappedSession().setAttribute("create_or_modify", 0);
					//redirect
					MyUI.navigateTo("newinfo"); 
				} else {
					//pop-up window
					Notification notif = new Notification("Warning", "Customer does not exist", 
															Notification.TYPE_WARNING_MESSAGE);
					notif.setStyleName("mystyle"); //change css of the notif
					notif.setPosition(Position.MIDDLE_LEFT);
					notif.show(Page.getCurrent()); 
				}
			}
			else {
				//for test purpose, need to be deleted later
				System.out.println("test");
				MyUI.navigateTo("newinfo"); 
			}
		});
		
	}

	private void dataProcess() {
		member.setPlaceholder("Type Customer ID");
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
	}
}

