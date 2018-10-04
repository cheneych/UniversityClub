package raymond.report;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.annotations.Theme;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextField;

import raymond.MoreInfo.MoreInfo;
import raymond.MoreInfo.MoreInfoDataService;
import raymond.Test.MyUI;
import raymond.Test.TopBarView;
import raymond.TestDetails.CategoryDataService;
import raymond.TestDetails.DescripDataService;

@SuppressWarnings("serial")
@Theme("mytheme")
public class SettingsView extends TopBarView implements View {
	SettingsDataService service = new SettingsDataService();
	//room
	FormLayout tab1 = new FormLayout();
	TextField tab1tf1 = new TextField("Room Name");
	TextField tab1tf2 = new TextField("Charge");
	Button addroom = new Button("Add");
	//item
	FormLayout tab2 = new FormLayout();
	TextField tab2tf1 = new TextField("Item Name");
	TextField tab2tf2 = new TextField("Charge");
	ComboBox<String> tab2cb1 = new ComboBox<>("Catogory");
	ComboBox<String> tab2cb2 = new ComboBox<>("Serve Type");
	Integer newitemservtypeid = -1;
	
	List<String> category = new ArrayList<>(); CategoryDataService servcat = new CategoryDataService();
	List<String> desc = new ArrayList<>(); DescripDataService servdes = new DescripDataService(servcat.CateList.get(0).getHeadertypeid());
	List<Integer> descid = new ArrayList<>();
	List<String> title = new ArrayList<>(); TitleDataService servtit = new TitleDataService();
	List<Integer> titleid = new ArrayList<>(); 
	Button additem = new Button("Add");
	//CUSTOMER
	FormLayout tab3 = new FormLayout();
	TextField tab3tf1 = new TextField("Cust Name");
	TextField tab3tf2 = new TextField("Phone");
	TextField tab3tf3 = new TextField("Address");
	TextField tab3tf4 = new TextField("City");
	TextField tab3tf5 = new TextField("State");
	TextField tab3tf9 = new TextField("PostCode");
	TextField tab3tf6 = new TextField("Bill Address");
	TextField tab3tf7 = new TextField("Bill City");
	TextField tab3tf8 = new TextField("Bill State");
	TextField tab3tf10 = new TextField("Bill PostCode");
	Button addcus = new Button("Add");
	//salesman
	FormLayout tab4 = new FormLayout();
	TextField tab4tf0 = new TextField("Last Name");
	TextField tab4tf1 = new TextField("First Name");
	TextField tab4tf2 = new TextField("Login Id");
	TextField tab4tf3 = new TextField("Password");
	ComboBox<String> tab4cb4 = new ComboBox<>("Title");
	TextField tab4tf5 = new TextField("Email");
	Button addsales = new Button("Add");
	Integer newsalesid = -1;
	
	public SettingsView()  {
		init();
	}

	public void init()  {
		dataProcess();
		eventProcess();
		TabSheet tabsheet=new TabSheet();
		//room
		tab1tf1.setIcon(VaadinIcons.USER);
		tab1tf1.setRequiredIndicatorVisible(true);
		tab1tf2.setIcon(VaadinIcons.MONEY);
		tab1tf2.setRequiredIndicatorVisible(true);
		tab1.addComponents(tab1tf1, tab1tf2, addroom);
		//item
		tab2tf1.setIcon(VaadinIcons.LIST); tab2tf1.setRequiredIndicatorVisible(true);
		tab2tf2.setIcon(VaadinIcons.MONEY); tab2tf2.setRequiredIndicatorVisible(true);
		tab2cb1.setIcon(VaadinIcons.MENU); tab2cb1.setRequiredIndicatorVisible(true);
		tab2cb2.setIcon(VaadinIcons.MENU); tab2cb2.setRequiredIndicatorVisible(true);
		tab2.addComponents(tab2tf1, tab2tf2, tab2cb1, tab2cb2, additem);
		//CUSTOMER
		HorizontalLayout h1 = new HorizontalLayout();
		tab3tf1.setIcon(VaadinIcons.USER); tab3tf1.setRequiredIndicatorVisible(true);
		tab3tf2.setIcon(VaadinIcons.PHONE); tab3tf2.setRequiredIndicatorVisible(true);
		h1.addComponents(tab3tf1, tab3tf2);
		HorizontalLayout h2 = new HorizontalLayout();
		tab3tf3.setIcon(VaadinIcons.ROAD); tab3tf3.setRequiredIndicatorVisible(true);
		tab3tf4.setIcon(VaadinIcons.ROAD);
		tab3tf5.setIcon(VaadinIcons.ROAD);
		tab3tf9.setIcon(VaadinIcons.ENVELOPE);
		h2.addComponents(tab3tf3, tab3tf4, tab3tf5, tab3tf9);
		HorizontalLayout h3 = new HorizontalLayout();
		tab3tf6.setIcon(VaadinIcons.ROAD); tab3tf6.setRequiredIndicatorVisible(true);
		tab3tf7.setIcon(VaadinIcons.ROAD);
		tab3tf8.setIcon(VaadinIcons.ROAD);
		tab3tf10.setIcon(VaadinIcons.ENVELOPE);
		h3.addComponents(tab3tf6, tab3tf7, tab3tf8, tab3tf10);
		tab3.addComponents(h1, h2, h3, addcus);
		//salesman
		tab4tf0.setIcon(VaadinIcons.USER); tab4tf0.setRequiredIndicatorVisible(true);
		tab4tf1.setIcon(VaadinIcons.USER); tab4tf1.setRequiredIndicatorVisible(true);
		tab4tf2.setIcon(VaadinIcons.USER_CHECK); tab4tf2.setRequiredIndicatorVisible(true);
		tab4tf3.setIcon(VaadinIcons.PASSWORD); tab4tf3.setRequiredIndicatorVisible(true);
		tab4cb4.setIcon(VaadinIcons.LEVEL_UP); tab4cb4.setRequiredIndicatorVisible(true);
		tab4tf5.setIcon(VaadinIcons.MAILBOX); tab4tf5.setRequiredIndicatorVisible(true);
		HorizontalLayout h4 = new HorizontalLayout(); h4.addComponents(tab4tf0, tab4tf1);
		HorizontalLayout h5 = new HorizontalLayout(); h5.addComponents(tab4tf2, tab4tf3);
		HorizontalLayout h6 = new HorizontalLayout(); h6.addComponents(tab4cb4, tab4tf5);
		tab4.addComponents(h4,h5,h6,addsales);
		
		tabsheet.addTab(tab1,"Add room");
		tabsheet.addTab(tab2, "Add item");
		tabsheet.addTab(tab3, "Add Customer");
		tabsheet.addTab(tab4, "Add Salesman");
		addComponent(tabsheet);
	}

	private void eventProcess() {	
		addroom.addClickListener(e-> {
			Settings setting  = new Settings(tab1tf1.getValue(), tab1tf2.getValue());	
			try 
			{
			  service.storeRow(setting, "room");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		});
		
		additem.addClickListener(e-> {
			Settings setting  = new Settings(tab2tf1.getValue(), tab2tf2.getValue(), newitemservtypeid.toString());
			try 
			{
			  service.storeRow(setting, "item");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		});
		
		// tab2cb1
		tab2cb1.addValueChangeListener(e -> {
			String ctg = e.getValue();
			desc.clear(); descid.clear();
			for (int i = 0; i < category.size(); i++) {
				if (category.get(i).equals(ctg)) {
					servdes = new DescripDataService(servcat.CateList.get(i).getHeadertypeid());
					for (int j = 0; j < servdes.DesList.size(); j++) {
						desc.add(servdes.DesList.get(j).getServtype());
						descid.add(servdes.DesList.get(j).getServtypeid());
					}
					break;
				}
			}
			tab2cb2.setItems(desc);
			tab2cb2.setSelectedItem(desc.get(0));
			tab2cb2.setEmptySelectionAllowed(false);
		});
		//tab2cb2
		tab2cb2.addValueChangeListener(e -> {
			String curdesc = e.getValue();
			for (int i = 0; i < desc.size(); i++) {
				if (desc.get(i).equals(curdesc)) {
					newitemservtypeid = descid.get(i);
					break;
				}
			}
			System.out.println("look here: " + newitemservtypeid);
		});
		
		addcus.addClickListener(e-> {
			Settings setting  = new Settings(tab3tf1.getValue(), tab3tf2.getValue(), tab3tf3.getValue(),
					tab3tf4.getValue(), tab3tf5.getValue(), tab3tf6.getValue(), 
					tab3tf7.getValue(), tab3tf8.getValue(), tab3tf9.getValue(), tab3tf10.getValue());
			try 
			{
			  service.storeRow(setting, "cus");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		});
		
		addsales.addClickListener(e-> {
			Settings setting  = new Settings(tab4tf0.getValue(), tab4tf1.getValue(), tab4tf2.getValue(), tab4tf3.getValue(), newsalesid.toString(), tab4tf5.getValue());
			try 
			{
			  service.storeRow(setting, "sales");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		});	
		
		tab4cb4.addValueChangeListener(e -> {
			String curtitle = e.getValue();
			for (int i = 0; i < title.size(); i++) {
				if (title.get(i).equals(curtitle)) {
					newsalesid = titleid.get(i);
					break;
				}
			}
			//System.out.println("look here: " + newsalesid);
		});
	}

	private void dataProcess() {
		//tab2cb1
		for (int i = 0; i < servcat.CateList.size(); i++)
			category.add(servcat.CateList.get(i).getHeaderdesc());
		tab2cb1.setItems(category);  
		tab2cb1.setSelectedItem(category.get(0)); 
		tab2cb1.setEmptySelectionAllowed(false);
		//tab2cb2
		for (int i = 0; i < servdes.DesList.size(); i++) {
			desc.add(servdes.DesList.get(i).getServtype());
			descid.add(servdes.DesList.get(i).getServtypeid());
		}
		tab2cb2.setItems(desc); tab2cb2.setSelectedItem(desc.get(0)); tab2cb2.setEmptySelectionAllowed(false);
		
		newitemservtypeid = descid.get(0);
		//tab4cb4
		servtit.getData();
		for (int i = 0; i < servtit.titList.size(); i++) {
			title.add(servtit.titList.get(i).getGroupname());
			titleid.add(servtit.titList.get(i).getGroupid());
		}
		newsalesid = titleid.get(0);
		tab4cb4.setItems(title); tab4cb4.setSelectedItem(title.get(0));tab4cb4.setEmptySelectionAllowed(false);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
	}
}
