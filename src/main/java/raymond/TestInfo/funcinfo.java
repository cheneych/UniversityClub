package raymond.TestInfo;

public class funcinfo {
	private String starttime = " ";
	private String endtime = " ";
	private String expected = " ";
	private String actual =  " ";
	private String guaranteed =  " ";
	private Integer style = -1;
	private String setupstyle = " ";
	private String notes = " ";
	
	public funcinfo() {}
	
	
	
	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getSetupstyle() {
		return setupstyle;
	}

	public void setSetupstyle(String setupstyle) {
		this.setupstyle = setupstyle;
	}


	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getExpected() {
		return expected;
	}

	public void setExpected(String expected) {
		this.expected = expected;
	}

	public String getActual() {
		return actual;
	}

	public void setActual(String actual) {
		this.actual = actual;
	}

	public String getGuaranteed() {
		return guaranteed;
	}

	public void setGuaranteed(String guaranteed) {
		this.guaranteed = guaranteed;
	}

	public Integer getStyle() {
		return style;
	}

	public void setStyle(Integer style) {
		this.style = style;
	}
	
	
}

