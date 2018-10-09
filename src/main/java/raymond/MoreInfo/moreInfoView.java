package raymond.MoreInfo;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinService;
import com.vaadin.shared.Position;
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
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Tree;
import com.vaadin.ui.TreeGrid;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.TextArea;

import raymond.Test.MyUI;
import raymond.Test.TopBarView;
import raymond.TestHomePage.IsValidCusService;
import raymond.TestHomePage.Order;
import raymond.TestHomePage.OrderDataService;
import raymond.dataprovider.filter.Filter;
import raymond.Test.*;

@SuppressWarnings("serial")
public class moreInfoView extends TopBarView implements View {
	private Button reserve = new Button("Create");
	TextField member = new TextField("");
	//Components
	TextField booking=new TextField("Booking Name");
	TextField fName=new TextField("Function Name");
	TextField gua=new TextField("Guaranteed");
	ComboBox<String> ststy=new ComboBox<>("Setup Style");
	TextField expected=new TextField("Expected");
	TextField set=new TextField("Set");
	TextField postas=new TextField("Post As");
	TextField funcpas=new TextField("Func Post As");
	TextArea notes=new TextArea("Function Notes");
	
	FormLayout form1=new FormLayout();
	FormLayout form2=new FormLayout();
	
	Button confirm=new Button("next");
	Button save = new Button("save");
	
	List<String> style=new ArrayList<>();
	MoreInfoDataService service = new MoreInfoDataService();
	
	public moreInfoView() {
		init();
	}

	public void init() {
		dataProcess();
		eventProcess();
		confirm.setStyleName("button"); confirm.setIcon(VaadinIcons.ARROW_FORWARD);
		reserve.setStyleName("button"); reserve.setIcon(VaadinIcons.ENTER);
		save.setStyleName("button"); save.setIcon(VaadinIcons.STORAGE);
		final HorizontalLayout layout5 = new HorizontalLayout(); 
		layout5.addComponents(member, reserve);
		layout5.setComponentAlignment(reserve, Alignment.BOTTOM_LEFT);
		layout5.setComponentAlignment(member, Alignment.MIDDLE_RIGHT);
		layout5.setStyleName("bord");
		layout5.setSizeFull();
		//first layer
		final VerticalLayout layout1=new VerticalLayout();
		final HorizontalLayout layout2=new HorizontalLayout();
		layout2.addComponents(form1,form2);
		layout1.addComponents(layout2, notes);
		layout1.setSizeFull();
		layout1.setStyleName("bord");
		//second layer
		final HorizontalLayout layout3 = new HorizontalLayout();
		layout3.addComponents(save, confirm);
		addComponents(layout5,layout1, layout3);	
		setComponentAlignment(layout3, Alignment.MIDDLE_RIGHT);
	}

	private void dataProcess() {
		member.setPlaceholder("Type Customer ID");
		confirm.setVisible(false);
		booking.setValue(" "); postas.setValue("0"); fName.setValue(" "); gua.setValue("0"); 
        expected.setValue("0"); set.setValue("0"); funcpas.setValue("0"); notes.setValue("n/a");
		//setup style
		service.getData();
		for (int i=0;i<service.stylist.size();i++)
			style.add(service.stylist.get(i).getStsty());
		ststy.setItems(style);
		ststy.setSelectedItem(style.get(0));
		ststy.setEmptySelectionAllowed(false);
		//form
		form1.addComponents(booking,postas,fName,funcpas);
		form2.addComponents(expected,set,gua,ststy);
		notes.setSizeFull();
	}

	private void eventProcess() {
		
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
					Notification notif = new Notification("Successful", "Successful", 
							Notification.TYPE_TRAY_NOTIFICATION);
					notif.setDelayMsec(1000);
					notif.setPosition(Position.MIDDLE_CENTER);
					notif.setStyleName("mystyle"); //change css of the notif
					notif.show(Page.getCurrent()); 
					reserve.setVisible(false);
					//redirect
					//MyUI.navigateTo("newinfo"); 
				} else {
					//pop-up window
					Notification notif = new Notification("Warning", "Customer does not exist", 
															Notification.TYPE_WARNING_MESSAGE);
					notif.setDelayMsec(1000);
					notif.setPosition(Position.MIDDLE_CENTER);
					notif.setStyleName("mystyle"); //change css of the notif
					notif.show(Page.getCurrent()); 
				}
			}
			else {
				//for test purpose, need to be deleted later
				System.out.println("test");
				MyUI.navigateTo("newinfo"); 
			}
		});
		
		save.addClickListener(e->{
			if (booking.getValue().equals(" ") || fName.getValue().equals(" ") ) {
				Notification notif = new Notification("Warning", "Booking Name and Function Name required", 
				Notification.TYPE_WARNING_MESSAGE);
				notif.setStyleName("mystyle"); //change css of the notif
				notif.setPosition(Position.MIDDLE_CENTER);
				notif.show(Page.getCurrent()); 
			} else {
				String styid="";
				for (int i=0;i<service.stylist.size();i++) {
					if (service.stylist.get(i).getStsty().equals(ststy.getValue())) {
						styid=service.stylist.get(i).getStyid();
						break;
					}
				}
				
				MoreInfo info = new MoreInfo(booking.getValue(), postas.getValue(), fName.getValue(), gua.getValue(), 
	                    styid, expected.getValue(), set.getValue(), 
	                    funcpas.getValue(), notes.getValue());
				
				try {
					service.storeRow(info);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				save.setVisible(false);
				confirm.setVisible(true);
			}
		});
		
		confirm.addClickListener(e->{
				MyUI.navigateTo("reservation");
		});
	}

}