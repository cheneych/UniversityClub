/**
 * 
 */
package raymond.Test;

import java.util.HashMap;
import java.util.Map.Entry;

import com.vaadin.external.org.slf4j.Logger;
import com.vaadin.external.org.slf4j.LoggerFactory;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.Page;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
//import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.MenuBar.Command;
//import muop.missouri.edu.contracts.User;
//import muop.missouri.edu.contracts.ContractViewProvider;
//import muop.missouri.edu.contracts.ContractsUI;
//import muop.missouri.edu.contracts.ContractViewProvider.Views;
//import muop.missouri.edu.contracts.administration.screenright.ScreenRightsQuery;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.Notification;

@SuppressWarnings("serial")
public abstract class TopBarView extends VerticalLayout implements View {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	private VerticalLayout mainComponent;

	protected String[] rights;

	private Label hrButton;
	private Label hrButton_1;

	private Button contactus;
	private Button logout;
	private MenuBar barmenu;

	private Image muImage;

	/**
	 * all views need extends this view
	 */
	public TopBarView() {
		super();
		init();
		layout();
	}

	/**
	 * all views need extends this view
	 */
	public TopBarView(Component... children) {
		super(children);
		init();
		layout();
	}

	private void init() {

		muImage = new Image() {
			{
				setSource(new ThemeResource("images/logo_mu.png"));
				setDescription("University of Missouri Homepage");
				setAlternateText("MU Logo");
			}
		}; 

		hrButton = new Label("<h1>University Club System</h1>",
				ContentMode.HTML);
		hrButton.addStyleName("hrButton");


		hrButton_1 = new Label("<h2>University of Missouri</h2>",
				ContentMode.HTML);
		hrButton_1.addStyleName("hrButton_2");


		barmenu = new MenuBar();
		MenuItem name=barmenu.addItem("Raymond",null,null);
		name.setIcon(VaadinIcons.USER);
		MenuItem account1=name.addItem("Contact us",new ThemeResource("icons/PNG/Help/Help_16x16.png"),null);
		MenuItem signout1=name.addItem("Logout",new ThemeResource("icons/PNG/Qing/Sign_Out.png"),null);
		
		signout1.setCommand(new Command() {
			public void menuSelected(MenuItem selectedItem) {
				MyUI.navigateTo("login");
				//clear pools
				
			}
		});
		
		account1.setCommand(new Command() {
			public void menuSelected(MenuItem selectedItem) {
				MyUI.navigateTo("");
			}
		});
		
//		logout = new Button("Log Out") {
//			{
//				addStyleName("btnwithborder");
//				addStyleName("rightbutton");
//				setIcon(new ThemeResource("icons/PNG/Qing/Sign_Out.png"));
//			}
//		};		
//
//		contactus = new Button("User Help/Contact Us") {
//			{
//				addStyleName("btnwithborder");
//				addStyleName("leftbutton");
//				setIcon(new ThemeResource("icons/PNG/Help/Help_16x16.png"));
//			}
//		};		
	}

	private void layout() {

		setSizeFull();
		addStyleName("screen");
		setMargin(false);

		HorizontalLayout topBarComponent = new HorizontalLayout() {
			{
				setWidth("100%");
				addStyleName("topbar");
				setMargin(false);								
				HorizontalLayout layout1 = new HorizontalLayout() {
					{						
						addStyleName("logolayout");
						addComponent(muImage);
						addComponent(new VerticalLayout() {
							{
								addStyleName("logotextlayout");
								addComponent(hrButton);
								addComponent(hrButton_1);
							}
						});
					}
				};
				addComponents(layout1);			
			}
		};
		addComponent(topBarComponent);
		addComponent(new HorizontalLayout() {
			{
				setWidth("100%");
				setHeight("55px");
				if (raymond.Test.User.getUser() == null) {

				} else {
					Label welcomeLabel = new Label(" Welcome "
							+raymond.Test.User.getUser().get(User.UserAttribute.DISPLAYNAME) + "!");
					welcomeLabel.setStyleName("username");					

					addComponent(welcomeLabel);
					setComponentAlignment(welcomeLabel, Alignment.TOP_LEFT);
					addComponent(barmenu);
					setComponentAlignment(barmenu, Alignment.TOP_RIGHT);

//					CssLayout h = new CssLayout(){
//						{
//							addStyleName("menubarlayout");
////							addComponent(contactus);
////							addComponent(logout);							
//						}				
//					};
//					addComponent(h);
//					setComponentAlignment(h, Alignment.MIDDLE_RIGHT);
				}
			}
		});

		
		//addComponent(buttonmenubar);
		// main body to add content
//		HorizontalLayout mainBodyComponent = new HorizontalLayout() {
//			{
//				setSizeFull();	
//				VerticalLayout main = new VerticalLayout() {
//					{
//						//setMargin(true);
//						setSpacing(true);		
//
//					}
//				};
//
//				mainComponent = main;
//				addComponent(main);
//				//setExpandRatio(main, 1.0f);
//
//			}
//		};
//		addComponent(mainBodyComponent);
//		setExpandRatio(mainBodyComponent, 1.0f);
	}

	/**
	 * add component to the main body, right to menu
	 * 
	 * @param component
	 */
	protected void addToMainComponent(Component com) {
		mainComponent.addComponent(com);
	}

	//	public void setHighlight(View name){		
	//		barmenu.highlight(name);
	//	}
	//	
	protected void setMenuVisible(boolean value) {
		//		 barmenu.setVisible(value);
	}

	/**
	 * set menu visibility
	 * 
	 * @param value
	 */


	/**
	 * check if the user has permission to open this page
	 * 
	 * if the page is free to access, do not call this check function
	 */
	//	protected void checkPermission(View view) {
	//		if (User.getUser() != null) {
	//			
	//			if (User.getUser().getSecurityGroup().contains("1")) {			
	//				return;
	//			}
	//			
	////			if (ScreenRightsQuery.allowAccess(view, User.getUser().getSecurityGroup())) {				
	////				return;
	////			}
	//		}
	//		
	//		Notification.show("Permission Denied", "back to home page!", Notification.Type.WARNING_MESSAGE);
	////		ContractsUI.get().getProjexViewNavigator().navigateTo(ContractViewProvider.Views.HOME);
	//	}

	//	private HashMap<AbstractComponent, String> map = new HashMap<AbstractComponent, String>();

	/**
	 * rights contain two level2 screen level: READ, WRITE, DELETE 
	 * second level: Low, Median, High edit and delete 
	 * buttons are controlled by screen level
	 * other components can be controlled by second level
	 */
	//	protected void addAccessControl(AbstractComponent c, String right) {
	//		map.put(c, right);
	//	}

	/**
	 * apply access control stored in map use addAccessControl(AbstractComponent
	 * c, String right) to add components that need access control
	 */
	//	protected void applyAccessControl() {
	//		if (rights == null)
	//			return;
	//		if (rights[0].equals("READ")) {
	//			for (Entry<AbstractComponent, String> entry : map.entrySet()) {
	//				if (entry.getValue().equals("WRITE")
	//						|| entry.getValue().equals("DELETE"))
	//					entry.getKey().setVisible(false);
	//			}
	//		} else if (rights[0].equals("WRITE")) {
	//			for (Entry<AbstractComponent, String> entry : map.entrySet()) {
	//				if (entry.getValue().equals("DELETE"))
	//					entry.getKey().setVisible(false);
	//			}
	//		} else if (rights[0].equals("DELETE")) {
	//			// full screen editing rights
	//		} else {
	//			logger.debug("Screen Right Exception {}", rights[0]);
	//		}
	//
	//		if (rights[1] == null)
	//			rights[1] = "Low";
	//		if (rights[1].equals("Low")) {
	//			for (Entry<AbstractComponent, String> entry : map.entrySet()) {
	//				if (entry.getValue().equals("Median")
	//						|| entry.getValue().equals("High"))
	//					entry.getKey().setVisible(false);
	//			}
	//		} else if (rights[1].equals("Median")) {
	//			for (Entry<AbstractComponent, String> entry : map.entrySet()) {
	//				if (entry.getValue().equals("High"))
	//					entry.getKey().setVisible(false);
	//			}
	//		} else if (rights[1].equals("High")) {
	//			// enable to see all components
	//		} else {
	//			logger.debug("Second Level Right Exception {}", rights[1]);
	//		}
	//	}

}
