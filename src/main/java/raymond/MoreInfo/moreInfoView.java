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
		//first layer
		final HorizontalLayout layout2=new HorizontalLayout();
		layout2.addComponents(form1,form2);
		layout2.setSizeFull();
		//second layer
		final HorizontalLayout layout3 = new HorizontalLayout();
		layout3.addComponents(save, confirm);
		addComponents(layout2,notes,layout3);	
		setComponentAlignment(layout3, Alignment.MIDDLE_RIGHT);
	}

	private void dataProcess() {
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
				confirm.setVisible(true);
			}
		});
		
		confirm.addClickListener(e->{
				MyUI.navigateTo("reservation");
		});
	}

}