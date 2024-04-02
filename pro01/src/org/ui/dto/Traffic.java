package org.ui.dto;

public class Traffic {
	private String ttype;
	private String no;
	private String route;
	private String comment;
	
	public Traffic() {}
	public Traffic(String ttype, String no, String route, String comment) {
		super();
		this.ttype = ttype;
		this.no = no;
		this.route = route;
		this.comment = comment;
	}
	public String getTtype() {
		return ttype;
	}
	public void setTtype(String ttype) {
		this.ttype = ttype;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Traffic [ttype=" + ttype + ", no=" + no + ", route=" + route + ", comment=" + comment + "]";
	}
	
	

}
