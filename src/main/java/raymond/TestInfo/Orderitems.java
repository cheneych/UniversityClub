package raymond.TestInfo;

import java.util.Date;

public class Orderitems {
	private Integer id;
	private Integer headerid;
	private Integer timeid;
	private String service;
	private String item;
	private Integer qty;
	private Double charge;
	private Double total;
	private String starttime;
	private String endtime;

	public Orderitems(int timeid, String service, String starttime, String endtime) {
		this.timeid    = timeid;
		this.service   = service;
		this.starttime = starttime;
		this.endtime   = endtime;
	}

	
	public Orderitems(Integer id, Integer headerid, Integer timeid, String item, double charge, double total, Integer qty) {
		super();
		this.id = id;
		this.headerid = headerid;
		this.timeid = timeid;
		this.item = item;
		this.qty = qty;
		this.charge = charge;
		this.total = total;
	}
	

	public Orderitems(Integer id, Integer headerid, String item, Integer qty, double charge, double total) {
		super();
		this.id = id;
		this.headerid = headerid;
		this.item = item;
		this.qty = qty;
		this.charge = charge;
		this.total = total;
	}


	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getItem() {
		return item == null ? "" :item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getHeaderid() {
		return headerid;
	}


	public void setHeaderid(Integer headerid) {
		this.headerid = headerid;
	}


	public Integer getTimeid() {
		return timeid;
	}


	public void setTimeid(Integer timeid) {
		this.timeid = timeid;
	}
	
	
	
}
