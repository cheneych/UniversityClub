package raymond.TestDetails;

import java.math.BigDecimal;

public class Items {
	private int servitemid;
	private int servtype;
	private int servmenutype;
	private String servitemname;
	private BigDecimal servitemchrg;
	private BigDecimal servitemcost;
	private BigDecimal servsu;
	private String inventoried;
	private int taxid;
	private int quantitydefault;
	private int itemflag;
	private String webavail;
	private int servitemorder;
	
	private int qty;
	private double total;
	
	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Items() {
		
	}

	public int getServitemid() {
		return servitemid;
	}

	public void setServitemid(int servitemid) {
		this.servitemid = servitemid;
	}

	public int getServtype() {
		return servtype;
	}

	public void setServtype(int servtype) {
		this.servtype = servtype;
	}

	public int getServmenutype() {
		return servmenutype;
	}

	public void setServmenutype(int servmenutype) {
		this.servmenutype = servmenutype;
	}

	public String getServitemname() {
		return servitemname;
	}

	public void setServitemname(String servitemname) {
		this.servitemname = servitemname;
	}

	public BigDecimal getServitemchrg() {
		return servitemchrg;
	}

	public void setServitemchrg(BigDecimal servitemchrg) {
		this.servitemchrg = servitemchrg;
	}

	public BigDecimal getServitemcost() {
		return servitemcost;
	}

	public void setServitemcost(BigDecimal servitemcost) {
		this.servitemcost = servitemcost;
	}

	public BigDecimal getServsu() {
		return servsu;
	}

	public void setServsu(BigDecimal servsu) {
		this.servsu = servsu;
	}

	public String getInventoried() {
		return inventoried;
	}

	public void setInventoried(String inventoried) {
		this.inventoried = inventoried;
	}

	public int getTaxid() {
		return taxid;
	}

	public void setTaxid(int taxid) {
		this.taxid = taxid;
	}

	public int getQuantitydefault() {
		return quantitydefault;
	}

	public void setQuantitydefault(int quantitydefault) {
		this.quantitydefault = quantitydefault;
	}

	public int getItemflag() {
		return itemflag;
	}

	public void setItemflag(int itemflag) {
		this.itemflag = itemflag;
	}

	public String getWebavail() {
		return webavail;
	}

	public void setWebavail(String webavail) {
		this.webavail = webavail;
	}

	public int getServitemorder() {
		return servitemorder;
	}

	public void setServitemorder(int servitemorder) {
		this.servitemorder = servitemorder;
	}
	
}
