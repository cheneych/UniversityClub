package raymond.Login;


import com.unboundid.ldap.sdk.LDAPConnection;
import com.unboundid.ldap.sdk.LDAPException;
import com.unboundid.ldap.sdk.SearchResult;
import com.unboundid.ldap.sdk.SearchResultEntry;
import com.unboundid.ldap.sdk.SearchScope;
import com.unboundid.util.LDAPSDKUsageException;

import com.vaadin.external.org.slf4j.Logger;
import com.vaadin.external.org.slf4j.LoggerFactory;

import raymond.Test.User;
import raymond.Test.User.UserAttribute;



public class Authenticator {

	/* Parameters for initial global catalog query */

	private String gcBindDN;

	/**
	 * @return the gcBindDN
	 */
	public String getGcBindDN() {
		return gcBindDN;
	}

	/**
	 * @param gcBindDN
	 *            the gcBindDN to set
	 */
	public void setGcBindDN(String gcBindDN) {
		this.gcBindDN = gcBindDN;
	}

	/**
	 * @return the gcPassword
	 */
	public String getGcPassword() {
		return gcPassword;
	}

	/**
	 * @param gcPassword
	 *            the gcPassword to set
	 */
	public void setGcPassword(String gcPassword) {
		this.gcPassword = gcPassword;
	}

	/**
	 * @return the gcServer
	 */
	public String getGcServer() {
		return gcServer;
	}

	/**
	 * @param gcServer
	 *            the gcServer to set
	 */
	public void setGcServer(String gcServer) {
		this.gcServer = gcServer;
	}

	private String gcPassword;
	private String gcServer;

	private final static Logger logger = LoggerFactory
			.getLogger(Authenticator.class);

	public Authenticator() {

		// this.gcBindDN = SystemProperties.get("globalcatalog.binddn");
		// this.gcPassword = SystemProperties.get("globalcatalog.password");
		// this.gcServer = SystemProperties.get("globalcatalog.server");

		this.gcBindDN = "CN=MU CF SDAV,CN=USERS,DC=COL,DC=MISSOURI,DC=EDU";
		this.gcPassword = "Dbsb&484";
		this.gcServer = "col.missouri.edu";
	}

	private String getServer(String dn) {
		return dn.substring(dn.indexOf("DC=")).replaceAll("DC=", "")
				.replaceAll(",", ".");
	}

	/**
	 * authenticate with pawprint, then fill in more information from PeopleSoft
	 * @param username
	 * @param password
	 * @param u
	 * @return
	 */
	@SuppressWarnings("unused")
	public boolean authenticate(String username, String password, User u) {

		// For some reason the User is coming in as null. This may have
		// something to do with the startup routine.

		if (null == u) {
			u = new User();
		}

		String sso;

		if (username.indexOf("@") != -1) {
			sso = username.substring(0, username.indexOf("@") - 1);
		} else if (username.indexOf("\\") != -1) {
			sso = username.substring(username.indexOf("\\") + 1).toUpperCase();
		} else {
			sso = username;
		}

		LDAPConnection gcConnection = null;
		LDAPConnection connection = null;

		SearchResult searchResult;

		String dn = null;
		String newserver = null;

		try {

			gcConnection = new LDAPConnection(gcServer, 3268, gcBindDN, gcPassword);

			if (gcConnection != null) {

				SearchResult gcSearchResult = gcConnection.search("dc=edu", SearchScope.SUB, "(sAMAccountName=" + sso + ")");

				if (gcSearchResult.getEntryCount() == 1) {

					SearchResultEntry e = gcSearchResult.getSearchEntries().get(0);
					dn = e.getDN();

					u.setValuesFromLDAP(dn, "University of Missouri", e);
					newserver = getServer(dn);

					if (logger.isDebugEnabled()) {
//						logger.debug("Global catalog server says to try {} for  user {} {}", newserver, sso, dn);
					}
				}

				gcConnection.close();

			} else {

				if (logger.isErrorEnabled()) {
					logger.error("Unable to Make LDAP Connection to global catalog server");
				}

				return false;

			}
		
		} catch (LDAPException e) {

			if (logger.isErrorEnabled()) {
				logger.error("LDAP Exception occurred ", e);
			}
			return false;

		} finally {

			if (gcConnection != null) {
				gcConnection.close();
			}

		}
		
		
		try {
						
			connection = new LDAPConnection(newserver, 389, dn, password);
			if (connection != null) {

				// Correct Password - User is properly verified
				u.setVerifiedID(dn);
				u.setVerifiedBy("University of Missouri");

				u.put(UserAttribute.USERID, sso);

				if (logger.isDebugEnabled()) {
					logger.debug("UM SSO = {}", u.get(User.UserAttribute.USERID));
				}
				
				return true;

			} else {

				if (logger.isErrorEnabled()) {
					logger.error("Unable to make ldap connection to " + newserver);
				}

				return false;

			}
			
		} catch (LDAPException | LDAPSDKUsageException  e) {
			
			if (logger.isErrorEnabled()) {
				logger.error("LDAP Exception occurred ", e);
			}
			return false;

		} finally {

			if (connection != null) {
				connection.close();
			}
		}

	}
}
