package raymond.Login;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vaadin.annotations.Theme;
//import com.google.gwt.aria.client.Roles;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Page;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.WebBrowser;
//import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
//import muop.missouri.edu.contracts.ContractsUI;
//import muop.missouri.edu.contracts.ContractViewProvider;
//import muop.missouri.edu.contracts.Pools;
//import muop.missouri.edu.contracts.User;
//import muop.missouri.edu.contracts.User.UserAttribute;
//import muop.missouri.edu.contracts.administration.loginhistory.LoginHistoryQuery;
//import muop.missouri.edu.contracts.ui.desktop.TopBarView;

import raymond.Test.MyUI;
import raymond.Test.TopBarView;
import raymond.Test.User;
import raymond.Test.User.UserAttribute;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@SuppressWarnings("serial")
@Theme("mytheme")
//public class LoginView extends VerticalLayout implements View {
public class LoginView extends TopBarView implements View {
	private TextField userName;
	private PasswordField password;
	private Button loginButton;
	private Label screendescription;

	private CustomLayout label;

	private Label label_warning;
	private String attemptedScreenAccess;

	public LoginView() {
		super();
		init();
		layout();
	}

	public LoginView(String attemptedScreenAccess) {
		this.attemptedScreenAccess = attemptedScreenAccess;
		setSizeFull();
		init();
		layout();
		Page.getCurrent().setTitle("Login in");
	}

	private void init() {
		
		User.setUser(null);
		
		screendescription = new Label("<h2>Welcome to University Club System!</h2>",
				com.vaadin.shared.ui.ContentMode.HTML);
	

		userName = new TextField() {
			{
				
				setCaption("User ID");
				addStyleName("login-user");
				focus();
			}
		};
		
		password = new PasswordField() {
			{
				
				setCaption("Password");
				addStyleName("login-password");
			}
		};

		loginButton = new Button() {
			{
				setCaption("Sign In");
				
				addStyleName("btnwithborder");
				setClickShortcut(KeyCode.ENTER);
				setIcon(new ThemeResource("icons/PNG/Qing/paw.png"));
			}
		};

		loginButton.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				doLogin();
			}

		});

		label_warning = new Label(
				"If you have any issues when you are using IE 11 on Windows 10, please switch to Firefox/Google Chrome/Edge. Thank you!");

		label_warning.addStyleName("loginwarning");

		String text = "Copyright @ 2018 - Curators of " + "<a href='http://missouri.edu//'>" + "University of Missouri"
				+ "</a>" + ". All rights reserved. " + "<a href='http://www.umsystem.edu/ums/copyright/'>" + "DMCA"
				+ "</a>" + " and other " + "<a href='http://missouri.edu/statements/copyright.php/'>"
				+ "copyright information" + "</a>" + "\n" + ". " + "An "
				+ "<a href='http://missouri.edu/statements/eeo-aa.php'>"
				+ "Equal Opportunity/Access/Affirmative Action/Pro Disabled & Veteran" + "</a>"
				+ " Institution.&nbsp;Published by Campus Facilities.";

		try {
			label = new CustomLayout(new ByteArrayInputStream(text.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void layout() {

//		setMenuVisible(false);
		VerticalLayout v = new VerticalLayout() {
			{
				setSpacing(true);
				setMargin(true);				
				addComponent(screendescription);
				setExpandRatio(screendescription, 1.0f);
				addComponent(userName);
				addComponent(password);
				addComponent(loginButton);
				setExpandRatio(loginButton, 1.0f);
			}
		};
		
		VerticalLayout main = new VerticalLayout() {
			{
				setSpacing(true);
				setMargin(true);	
				addComponent(v);
				addComponent(label_warning);
				addComponent(label);
			}
		};
		addComponent(main);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		
		
	}

	private void doLogin() {
		
		if (!loginButton.isEnabled()) {
			return;
		}
		
		Authenticator authenticator = new Authenticator();
		User.setUser(new User());
		MyUI.navigateTo("home");

	/*	if (authenticator.authenticate(userName.getValue().toLowerCase(), password.getValue(), User.getUser())) {
		
			User u = User.getUser();		
			ArrayList<String> security = new ArrayList<String>();
			Connection c = null;
			
			try {				
				c = Pools.getConnection(Pools.Names.CONTRACT);
				try (PreparedStatement stmt = c
						.prepareStatement("select * from PERSONS where SSO_ID = ? AND ISACTIVE = 1 AND "
								+ "(EXPIREDDT > SYSDATE OR EXPIREDDT IS NULL)")) {
					
					stmt.setString(1, userName.getValue().toUpperCase());
					try (ResultSet rs = stmt.executeQuery()) {	
						if (rs.next()) {		
						
							u.put(UserAttribute.PERSONID, rs.getString("ID"));
							u.put(UserAttribute.PEOPLESOFTID, rs.getString("EMPLID"));
							u.put(UserAttribute.DEPTID, rs.getString("DEPTID"));
							u.put(UserAttribute.DEPTNAME, rs.getString("DEPTNAME"));
							u.put(UserAttribute.CSD, rs.getString("CSD"));	
							u.put(UserAttribute.CSD_DESCR, rs.getString("CSD_DESCR"));	
							u.put(UserAttribute.BUSINESS_UNIT, rs.getString("BUSINESS_UNIT"));	
							u.put(UserAttribute.COMPANY, rs.getString("CAMPUS"));															
							
							try (PreparedStatement st = c
									.prepareStatement("select * from USERS where PERSONID = ? and ISACTIVE = 1")) {
								st.setString(1, u.get(UserAttribute.PERSONID));
								try (ResultSet ResultSet = st.executeQuery()) {								
									while (ResultSet.next()) {
										security.add(ResultSet.getString("ROLEID"));										
									}																						
								}
							}							
							
							if(security.isEmpty()){
								User.setUser(null);								
								new Notification("User has not been assign a user role!", Notification.Type.WARNING_MESSAGE)
									.show(Page.getCurrent());
								return;
							}
								
							u.setSecurityGroup(security);
							
							System.err.println("security---" + security);	
							
							if(security.contains("1") || security.contains("4")){
								u.put(UserAttribute.USERLEVEL, "ADMIN");
							}else if(security.contains("5") || security.contains("7") || 
									security.contains("21")){
								u.put(UserAttribute.USERLEVEL, "BUSINESS");
							}else if(security.contains("3") || security.contains("24")){
								u.put(UserAttribute.USERLEVEL, "CSD");
							}else {
								u.put(UserAttribute.USERLEVEL, "DEPT");
							}
														 
							ArrayList<String> assignDept = new ArrayList<String>();
							ArrayList<String> assignCSD = new ArrayList<String>();
							ArrayList<String> assignBus = new ArrayList<String>();
							
							try (PreparedStatement st = c.prepareStatement(
									"select * from USERROLESDEPT where PERSONID = ? and ISACTIVE = 1")) {
								
								st.setString(1, u.get(UserAttribute.PERSONID));
								try (ResultSet ResultSet = st.executeQuery()) {
									
									while (ResultSet.next()) {
										if (ResultSet.getString("ROLEID").equals("5")
												|| ResultSet.getString("ROLEID").equals("7")
												|| ResultSet.getString("ROLEID").equals("21")) {
											assignBus.add(ResultSet.getString("BUSINES_UNIT"));
										} else if (ResultSet.getString("ROLEID").equals("3")
												|| ResultSet.getString("ROLEID").equals("24")) {
											assignCSD.add(ResultSet.getString("CSD"));
										} else {
											assignDept.add(ResultSet.getString("DEPT"));
										}
									}
								}
							}

							u.setAssignBus(assignBus);
							u.setAssignCSD(assignCSD);
							u.setAssignDept(assignDept);
							
							System.err.println("assignBus----" + assignBus);
							System.err.println("assignCSD----" + assignCSD);
							System.err.println("assignDept---" + assignDept);
														
							ContractsUI.get().getProjexViewNavigator()
									.navigateTo(ContractViewProvider.Views.HOME.toString().toLowerCase());
							
							WebBrowser b = Page.getCurrent().getWebBrowser();
							String ip = b.getAddress();
							LoginHistoryQuery.addRecord(userName.getValue().toUpperCase(), ip);
							
						} else {
							try (PreparedStatement st = c
									.prepareStatement("select * from PILISTS where SSO_ID = ? and ISACTIVE = 1")) {
								st.setString(1, userName.getValue().toUpperCase());
								try (ResultSet rset = st.executeQuery()) {
									if (rset.next()) {	
										
										security.add("8");									
										u.setSecurityGroup(security);
										System.err.println("security type: " + security);
										
										ContractsUI.get().getProjexViewNavigator().navigateTo(attemptedScreenAccess);
									
										WebBrowser b = Page.getCurrent().getWebBrowser();
										String ip = b.getAddress();
										LoginHistoryQuery.addRecord(userName.getValue().toUpperCase(), ip);
									}
								}
							}					
						}												
					}
				}										
			} catch (SQLException e) {
				System.out.println("LOGIN--[ERROR]1: " + e.getMessage());
			} finally {
				Pools.releaseConnection(Pools.Names.CONTRACT, c);
				c = null;
			}			 
		} else {
			// if failed, show error message
			User.setUser(null);
			Notification.show("Login failed, please check your username/password and try again!", Type.ERROR_MESSAGE);
			password.setValue("");
			logger.debug("Authentication failed for {}", userName.getValue());
		}*/
	}
}
