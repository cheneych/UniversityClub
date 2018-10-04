package raymond.MoreInfo;

public class MoreInfo {
	private String booking;
	private String postas;
	private String fName;
	private String gua;
	private String ststy;
	private String expected;
	private String set;
	private String funcpas;
	private String notes;
	private String styid;
	
	public MoreInfo() {}
	
	public MoreInfo(String ststy, String styid) {
		this.ststy = ststy;
		this.styid = styid;
	}
	
	public MoreInfo(String booking, String postas, String fName, String gua, String styid, String expected, String set,
			String funcpas, String notes) {
		this.booking = booking;
		this.postas = postas;
		this.fName = fName;
		this.gua = gua;
		this.styid = styid;
		this.expected = expected;
		this.set = set;
		this.funcpas = funcpas;
		this.notes = notes;
	}

	public String getBooking() {
		return booking;
	}

	public void setBooking(String booking) {
		this.booking = booking;
	}

	public String getPostas() {
		return postas;
	}

	public void setPostas(String postas) {
		this.postas = postas;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getGua() {
		return gua;
	}

	public void setGua(String gua) {
		this.gua = gua;
	}

	public String getStsty() {
		return ststy;
	}

	public void setStsty(String ststy) {
		this.ststy = ststy;
	}

	public String getExpected() {
		return expected;
	}

	public void setExpected(String expected) {
		this.expected = expected;
	}

	public String getSet() {
		return set;
	}

	public void setSet(String set) {
		this.set = set;
	}

	public String getFuncpas() {
		return funcpas;
	}

	public void setFuncpas(String funcpas) {
		this.funcpas = funcpas;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getStyid() {
		return styid;
	}

	public void setStyid(String styid) {
		this.styid = styid;
	}
	
	
	
}
