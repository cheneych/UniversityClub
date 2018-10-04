package raymond.TestDetails;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lists {
	private String ctg;
	private String des;
	private String start;
	private String end;
	private int id;
	
	public Lists() {
	}
	
	public Lists(String ctg,String des,LocalDateTime start,LocalDateTime end,int id) {
		this.ctg=ctg;
		this.des=des;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		this.start=formatter.format(start);
		this.end=formatter.format(end);
		this.id=id;
	}
	
	public void setCtg(String ctg) {
		this.ctg=ctg;
	}
	public String getCtg() {
		return ctg;
	}
	
	public void setDes(String des) {
		this.des=des;
	}
	public String getdes() {
		return des;
	}
	
	public void setStart(LocalDateTime start) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		this.start=formatter.format(start);
	}
	public String getStart() {
		return start;
	}
	
	
	public void setEnd(LocalDateTime end) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		this.end=formatter.format(end);
	}
	public String getEnd() {
		return end;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
}
