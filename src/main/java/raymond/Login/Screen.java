package raymond.Login;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Screen implements Serializable{
	
	String screenName;
	boolean isAdministrator;
	
	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public boolean isAdministrator() {
		return isAdministrator;
	}

	public void setAdministrator(boolean isAdministrator) {
		this.isAdministrator = isAdministrator;
	}

	public Screen(String screenName, boolean isAdministrator) {
		this.screenName = screenName;
		this.isAdministrator = isAdministrator;
	}
	
	public String toString() {
		return screenName;
	}
}