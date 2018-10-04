package raymond.report;

public class Title {
	private int groupid;
	private String groupname;
	
	
	public Title(int groupid, String groupname) {
		super();
		this.groupid = groupid;
		this.groupname = groupname;
	}
	
	public Title() {
		super();
	}

	public int getGroupid() {
		return groupid;
	}
	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	
	

}
