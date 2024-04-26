package org.ui.dto;

public class Guide {
	private String pname;
	private String ptype;
	private String paddress;
	private String ptel;
	private String optime;
	private String pcomment;
	private String premark;
	
	public Guide() {}
	public Guide(String pname, String ptype, String paddress, String ptel, String optime, String pcomment,
			String premark) {
		super();
		this.pname = pname;
		this.ptype = ptype;
		this.paddress = paddress;
		this.ptel = ptel;
		this.optime = optime;
		this.pcomment = pcomment;
		this.premark = premark;
	}
	
	
	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getPtype() {
		return ptype;
	}


	public void setPtype(String ptype) {
		this.ptype = ptype;
	}


	public String getPaddress() {
		return paddress;
	}


	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}


	public String getPtel() {
		return ptel;
	}


	public void setPtel(String ptel) {
		this.ptel = ptel;
	}


	public String getOptime() {
		return optime;
	}


	public void setOptime(String optime) {
		this.optime = optime;
	}


	public String getPcomment() {
		return pcomment;
	}


	public void setPcomment(String pcomment) {
		this.pcomment = pcomment;
	}


	public String getPremark() {
		return premark;
	}


	public void setPremark(String premark) {
		this.premark = premark;
	}


	@Override
	public String toString() {
		return "Guide [pname=" + pname + ", ptype=" + ptype + ", paddress=" + paddress + ", ptel=" + ptel + ", optime="
				+ optime + ", pcomment=" + pcomment + ", premark=" + premark + "]";
	}

	
}
