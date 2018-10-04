package raymond.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;

import com.unboundid.ldap.sdk.SearchResultEntry;
// import com.vaadin.data.Container.Filter;
import com.vaadin.server.Page;

import raymond.Login.Screen;



@SuppressWarnings("serial")
public class User extends HashMap<User.UserAttribute, String> {

	public static User getUser() {
		return MyUI.getCurrent().getSession().getAttribute(User.class);
	}

	public static void setUser(User value) {
		MyUI.getCurrent().getSession().setAttribute(User.class, value);
	}

	public enum UserAttribute {
		EMPLID, USERID, DISPLAYNAME, FULLNAME, SORTNAME, EMAILADDRESS, GENDER, WORKPHONENUMBER, SECURITYTYPE,
		CELLPHONENUMBER, WORKADDRESS1, WORKADDRESS2, WORKADDRESS3, CITY, STATE, COUNTRY,
		POSTALCODE, TIMEZONE, PEOPLESOFTID, JOBTITLE, USERLEVEL, DEPTID, CSD, BUSINESS_UNIT,PERSONID,
		DEPTNAME, CSD_DESCR,COMPANY;
	}

	private boolean newUser = true;
	private String verifiedID;
	private String verifiedBy;
	private String securityGroup;
	
	public void setValuesFromPeopleSoft(String id, String provider, ResultSet rs)
			throws SQLException {

		setVerifiedID(id);
		setVerifiedBy(provider);

		String name = rs.getString("NAME");
		String lastname = name.substring(0, name.indexOf(","));
		String firstname = name.substring(name.indexOf(",") + 1);
		String displayname = firstname + " " + lastname;		

		put(UserAttribute.PEOPLESOFTID, rs.getString("EMPLID"));
		put(UserAttribute.DISPLAYNAME, displayname);
		put(UserAttribute.FULLNAME, displayname);
		put(UserAttribute.SORTNAME, name);
		put(UserAttribute.EMAILADDRESS, rs.getString("EMAILID"));
		put(UserAttribute.JOBTITLE, rs.getString("JOBTITLE"));
		put(UserAttribute.WORKPHONENUMBER, rs.getString("WORK_PHONE"));	
		put(UserAttribute.WORKADDRESS1, rs.getString("WORK_ADDRESS1"));
		put(UserAttribute.WORKADDRESS2, rs.getString("WORK_ADDRESS2"));
		put(UserAttribute.WORKADDRESS3, rs.getString("WORK_ADDRESS3"));
		put(UserAttribute.CITY, rs.getString("WORK_CITY"));
		put(UserAttribute.STATE, rs.getString("WORK_STATE"));
		put(UserAttribute.POSTALCODE, rs.getString("WORK_POSTAL"));

	}
	

	public void setValuesFromLDAP(String id, String provider,
			SearchResultEntry ldap) {

		setVerifiedID(id);
		setVerifiedBy(provider);
		put(UserAttribute.USERID, ldap.getAttributeValue("sAMAccountName"));
		put(UserAttribute.DISPLAYNAME,
				ldap.getAttributeValue("displayNamePrintable"));
		put(UserAttribute.FULLNAME,
				ldap.getAttributeValue("displayNamePrintable"));
		put(UserAttribute.SORTNAME, ldap.getAttributeValue("CN"));
		put(UserAttribute.EMAILADDRESS, ldap.getAttributeValue("mail"));
		put(UserAttribute.WORKPHONENUMBER,
				ldap.getAttributeValue("telephoneNumber"));
		put(UserAttribute.WORKADDRESS1, ldap.getAttributeValue("streetAddress"));
		put(UserAttribute.CITY, ldap.getAttributeValue("l"));
		put(UserAttribute.STATE, ldap.getAttributeValue("ST"));
		put(UserAttribute.POSTALCODE, ldap.getAttributeValue("postalCode"));

	}

	private String sessionId;

	public User() {
		super();
		setSessionId();
		put(UserAttribute.USERID, "2002"); // TODO Change this when we have
											// users actually added
	}

	public String getSessionId() {
		return sessionId;
	}

	private void setSessionId() {
		Random r = new Random();
		sessionId = Long.toString(r.nextLong(), 36).replace('-', '0');
	}

	public boolean isNewUser() {
		return newUser;
	}

	public void setNewUser(boolean newUser) {
		this.newUser = newUser;
	}
	
	HashMap<String, Object> lastSelectedItems = new HashMap<String, Object>();	
	HashMap<String, Screen> screens = new HashMap<String, Screen>();
	ArrayList<String> security = new ArrayList<String>();

	public void setLastSelectedItem(Object object) {
		lastSelectedItems.put(Page.getCurrent().getLocation().toString(), object);
	}

	public Object getLastSelectedItem() {
		return lastSelectedItems.get(Page.getCurrent().getLocation().toString());
	}
	
	
//	HashMap<String, Collection<Filter>> lastFilters = new HashMap<String, Collection<Filter>>();
//	
//	public void setLastFilters(Collection<Filter> filters) {
//		lastFilters.put(Page.getCurrent().getLocation().toString(), filters);
//	}
//
//	public Collection<Filter> getLastFilters() {
//		return lastFilters.get(Page.getCurrent().getLocation().toString());
//	}	
//	
	public String getVerifiedID() {
		return verifiedID;
	}

	public void setVerifiedID(String verifiedID) {
		this.verifiedID = verifiedID;
	}

	public String getVerifiedBy() {
		return verifiedBy;
	}

	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}

	public String getUserId() {
		return get(UserAttribute.USERID);
	}
	
	public HashMap<String, Screen> getScreens() {
		return screens;
	}
	
	public void setScreens(HashMap<String, Screen> screens) {
		this.screens = screens;
	}
	
	public ArrayList<String> getSecurityGroup() {
		return security;
	}
	
	public void setSecurityGroup(ArrayList<String> security) {
		this.security = security;
	}
	
	public Locale getUserCountryLocale() {
		return Locale.US;
	}

	ArrayList<String> assignDept = new ArrayList<String>();
	ArrayList<String> assignCSD = new ArrayList<String>();
	ArrayList<String> assignBus = new ArrayList<String>();
	
	public void setAssignCSD(ArrayList<String> assignCSD) {
		this.assignCSD = assignCSD;
	}

	public ArrayList<String> getAssignCSD() {
		return assignCSD;
	}
	
	public void setAssignDept(ArrayList<String> assignDept) {
		this.assignDept = assignDept;
	}

	public ArrayList<String> getAssignDept() {
		return assignDept;
	}
	
	public void setAssignBus(ArrayList<String> assignBus) {
		this.assignBus = assignBus;
	}

	public ArrayList<String> getAssignBus() {
		return assignBus;
	}
	
}
