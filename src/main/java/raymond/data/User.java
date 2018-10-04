package raymond.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.unboundid.ldap.sdk.SearchResultEntry;
import com.vaadin.server.Page;
import com.vaadin.ui.UI;

import raymond.dataprovider.filter.Filter;

@SuppressWarnings("serial")
public class User extends HashMap<User.UserAttribute, String> {

	private static transient final Logger logger = LoggerFactory.getLogger(User.class);

	public static User getUser() {
		if (UI.getCurrent() != null && UI.getCurrent().getSession() != null) {
			return UI.getCurrent().getSession().getAttribute(User.class);
		} else {
			return null;
		}
	}

	public static void setUser(User value) {
		UI.getCurrent().getSession().setAttribute(User.class, value);
	}

	public enum UserAttribute {
		USERID, LOGINNAME, DISPLAYNAME, FULLNAME, SORTNAME, EMAILADDRESS, GENDER, WORKPHONENUMBER, CELLPHONENUMBER, WORKADDRESS1, WORKADDRESS2, WORKADDRESS3, CITY, STATE, COUNTRY, POSTALCODE, TIMEZONE, PEOPLESOFTID, AUTHPROVIDERID, AUTHPROVIDERLOGIN, INVITATIONEMAIL;
	}

	public enum UserType {
		SYSTEM, INTERNAL, ENTERPRISE, EXTERNAL, FACILITIES;
	}

	private boolean newUser = true;
	private UserType userType;
	private String verifiedID;
	private String verifiedBy;

	public void setValuesFromDummy(String id, String provider, ResultSet rs) throws SQLException {

		setVerifiedID(id);
		setUserType(UserType.ENTERPRISE);
		setVerifiedBy(provider);

		put(UserAttribute.USERID, rs.getString("ID"));
		put(UserAttribute.DISPLAYNAME, rs.getString("USERLOGIN"));
		put(UserAttribute.FULLNAME, rs.getString("USERLOGIN"));

	}

	public void setValuesFromPeopleSoft(String id, String provider, ResultSet rs) throws SQLException {

		setVerifiedID(id);
		setUserType(UserType.ENTERPRISE);
		setVerifiedBy(provider);

		String name = rs.getString("NAME");
		String lastname = name.substring(0, name.indexOf(","));
		String firstname = name.substring(name.indexOf(",") + 1);
		String displayname = firstname + " " + lastname;

		logger.debug("PeopleSoft display name = {}", displayname);

		put(UserAttribute.PEOPLESOFTID, rs.getString("EMPLID"));
		put(UserAttribute.DISPLAYNAME, displayname);
		put(UserAttribute.FULLNAME, displayname);
		put(UserAttribute.SORTNAME, name);
		put(UserAttribute.EMAILADDRESS, rs.getString("EMAILID"));
		// put(UserAttribute.GENDER,rs.getString());
		put(UserAttribute.WORKPHONENUMBER, rs.getString("WORK_PHONE").replaceAll("[^\\d]", ""));
		put(UserAttribute.WORKADDRESS1, rs.getString("WORK_ADDRESS1"));
		put(UserAttribute.WORKADDRESS2, rs.getString("WORK_ADDRESS2"));
		put(UserAttribute.WORKADDRESS3, rs.getString("WORK_ADDRESS3"));
		put(UserAttribute.CITY, rs.getString("WORK_CITY"));
		put(UserAttribute.STATE, rs.getString("WORK_STATE"));
		put(UserAttribute.POSTALCODE, rs.getString("WORK_POSTAL"));
		// put(UserAttribute.COUNTRY, rs.getString());
		// put(UserAttribute.TIMEZONE, rs.getString());

	}

	public void setValuesFromInternalDB(String id, String provider, ResultSet rs) throws SQLException {

		setVerifiedID(id);
		setUserType(UserType.INTERNAL);
		/* System Users do not have PERSON Records */
		setUserType(UserType.SYSTEM);
		setVerifiedBy(provider);

	}

	public void setValuesFromLDAP(String id, String provider, SearchResultEntry ldap) {

		setVerifiedID(id);
		setUserType(UserType.EXTERNAL);
		setVerifiedBy(provider);

		/*
		 * UserAttribute.GENDER does not exist in LDAP
		 * UserAttribute.WORKADDRESS2 does not exist in LDAP
		 * UserAttribute.WORKADDRESS3 does not exist in LDAP
		 */

		put(UserAttribute.LOGINNAME, ldap.getAttributeValue("sAMAccountName"));
		put(UserAttribute.DISPLAYNAME, ldap.getAttributeValue("displayNamePrintable"));
		put(UserAttribute.FULLNAME, ldap.getAttributeValue("displayNamePrintable"));
		put(UserAttribute.SORTNAME, ldap.getAttributeValue("CN"));
		put(UserAttribute.EMAILADDRESS, ldap.getAttributeValue("mail"));
		put(UserAttribute.WORKPHONENUMBER, ldap.getAttributeValue("telephoneNumber"));
		put(UserAttribute.WORKADDRESS1, ldap.getAttributeValue("streetAddress"));
		put(UserAttribute.CITY, ldap.getAttributeValue("l"));
		put(UserAttribute.STATE, ldap.getAttributeValue("ST"));
		put(UserAttribute.POSTALCODE, ldap.getAttributeValue("postalCode"));

	}

	public void setValuesFromDatabase(String id, String provider, ResultSet rs) throws SQLException {

		setVerifiedID(id);
		setVerifiedBy(provider);
		put(UserAttribute.USERID, rs.getString("ID"));

		setUserType(UserType.valueOf(rs.getString("USERTYPE")));

		put(UserAttribute.DISPLAYNAME, rs.getString("DISPLAYNAME"));
		put(UserAttribute.FULLNAME, rs.getString("FULLNAME"));
		put(UserAttribute.SORTNAME, rs.getString("SORTNAME"));
		put(UserAttribute.EMAILADDRESS, rs.getString("EMAILADDRESS"));
		put(UserAttribute.INVITATIONEMAIL, rs.getString("INVITATIONEMAIL"));

	}

	public void setValuesFromDatabaseForPersonId(String id, ResultSet rs) throws SQLException {

		setVerifiedID(id);
		put(UserAttribute.USERID, rs.getString("USERID"));
		setUserType(UserType.valueOf(rs.getString("USERTYPE")));
		put(UserAttribute.DISPLAYNAME, rs.getString("DISPLAYNAME"));
		put(UserAttribute.FULLNAME, rs.getString("FULLNAME"));
		put(UserAttribute.SORTNAME, rs.getString("SORTNAME"));
		put(UserAttribute.EMAILADDRESS, rs.getString("EMAILADDRESS"));
		put(UserAttribute.INVITATIONEMAIL, rs.getString("INVITATIONEMAIL"));

	}

	private String sessionId;

	public User() {
		super();
		setSessionId();
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

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

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

	public Locale getUserLocale() {
		// TODO Eventually use value from users/person table;
		return Locale.ENGLISH;
	}

	public Locale getUserCountryLocale() {

		// To properly format numbers and dates.
		// Distinguished from C10N supported locales

		return Locale.US;
	}

	HashMap<String, Collection<Filter>> lastFilters = new HashMap<String, Collection<Filter>>();

	public void setLastFilters(Collection<Filter> filters) {
		lastFilters.put(Page.getCurrent().getLocation().toString(), filters);
	}

	public Collection<Filter> getLastFilters() {
		return lastFilters.get(Page.getCurrent().getLocation().toString());
	}

	HashMap<String, Object> lastSelectedItems = new HashMap<String, Object>();

	public void setLastSelectedItem(Object object) {
		lastSelectedItems.put(Page.getCurrent().getLocation().toString(), object);
	}

	public Object getLastSelectedItem() {
		return lastSelectedItems.get(Page.getCurrent().getLocation().toString());
	}

	public void registerLogin() {

		if (logger.isDebugEnabled()) {
			logger.debug("registerLogin");
		}

//		Item item = new PropertysetItem();
//		item.addItemProperty("USERID", new ObjectProperty<String>(getUserId()));
//		item.addItemProperty("LOGGEDIN", new ObjectProperty<OracleTimestamp>(OracleTimestamp.now()));
//		item.addItemProperty("IPADDRESS", new ObjectProperty<String>(UI.getCurrent().getPage().getWebBrowser().getAddress()));
//
//		UserLoginHistory.storeItem(item);

	}

}
