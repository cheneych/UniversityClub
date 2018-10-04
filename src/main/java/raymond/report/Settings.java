package raymond.report;

public class Settings {
	//room
	private String roomname;
	private String roomcharge;
	//item
	private String itemname;
	private String itemcharge;
	private String category;
	private String serveType;
	//cus
	private String custname;
	private String cusphone;
	private String cusadd;
	private String cuscity;
	private String cusstate;
	private String cuspost;
	private String cusbadd;
	private String cusbcity;
	private String cusbstate;
	private String cusbpost;
	//sales
	private String salesfirstname;
	private String saleslastname;
	private String loginid;
	private String password;
	private String title;
	private String titleid;
	private String email;
	
	public Settings(String roomname, String charge) {
		super();
		this.roomname = roomname;
		this.roomcharge = roomcharge;
	}
	
	
	public Settings(String itemname, String itemcharge, String serveType) {
		super();
		this.itemname = itemname;
		this.itemcharge = itemcharge;
		this.serveType = serveType;
	}


	public Settings(String custname, String cusphone, String cusadd, String cuscity, String cusstate, String cusbadd,
			String cusbcity, String cusbstate, String cuspost, String cusbpost) {
		super();
		this.custname = custname;
		this.cusphone = cusphone;
		this.cusadd = cusadd;
		this.cuscity = cuscity;
		this.cusstate = cusstate;
		this.cusbadd = cusbadd;
		this.cusbcity = cusbcity;
		this.cusbstate = cusbstate;
		this.cuspost = cuspost;
		this.cusbpost = cusbpost;
	}


	public Settings(String salesfirstname, String saleslastname, String loginid, String password, String titleid, String email) {
		super();
		this.salesfirstname = salesfirstname;
		this.saleslastname = saleslastname;
		this.loginid = loginid;
		this.password = password;
		this.titleid = titleid;
		this.email = email;
	}
	
	
	
	public String getTitleid() {
		return titleid;
	}


	public void setTitleid(String titleid) {
		this.titleid = titleid;
	}


	public String getCuspost() {
		return cuspost;
	}


	public void setCuspost(String cuspost) {
		this.cuspost = cuspost;
	}


	public String getCusbpost() {
		return cusbpost;
	}


	public void setCusbpost(String cusbpost) {
		this.cusbpost = cusbpost;
	}


	public String getCusbadd() {
		return cusbadd;
	}


	public void setCusbadd(String cusbadd) {
		this.cusbadd = cusbadd;
	}


	public String getCusbcity() {
		return cusbcity;
	}


	public void setCusbcity(String cusbcity) {
		this.cusbcity = cusbcity;
	}


	public String getCusbstate() {
		return cusbstate;
	}


	public void setCusbstate(String cusbstate) {
		this.cusbstate = cusbstate;
	}


	public String getCuscity() {
		return cuscity;
	}


	public void setCuscity(String cuscity) {
		this.cuscity = cuscity;
	}


	public String getCusstate() {
		return cusstate;
	}


	public void setCusstate(String cusstate) {
		this.cusstate = cusstate;
	}


	public String getRoomname() {
		return roomname;
	}
	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	public String getRoomcharge() {
		return roomcharge;
	}
	public void setRoomcharge(String roomcharge) {
		this.roomcharge = roomcharge;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getItemcharge() {
		return itemcharge;
	}
	public void setItemcharge(String itemcharge) {
		this.itemcharge = itemcharge;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getServeType() {
		return serveType;
	}
	public void setServeType(String serveType) {
		this.serveType = serveType;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCusphone() {
		return cusphone;
	}
	public void setCusphone(String cusphone) {
		this.cusphone = cusphone;
	}
	public String getCusadd() {
		return cusadd;
	}
	public void setCusadd(String cusadd) {
		this.cusadd = cusadd;
	}
	public String getSalesfirstname() {
		return salesfirstname;
	}
	public void setSalesfirstname(String salesfirstname) {
		this.salesfirstname = salesfirstname;
	}
	public String getSaleslastname() {
		return saleslastname;
	}
	public void setSaleslastname(String saleslastname) {
		this.saleslastname = saleslastname;
	}
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
