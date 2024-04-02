package org.ui.dto;

public class Qna {
	private String title;
	private String plevel;
	private int pano;
	private String contents;
	private String resdate;
	private String author;
	private int mno;
	private int visited;
	
	public Qna() {}
	public Qna(String title, String plevel, int pano, String contents, String resdate, String author, int mno,
			int visited) {
		super();
		this.title = title;
		this.plevel = plevel;
		this.pano = pano;
		this.contents = contents;
		this.resdate = resdate;
		this.author = author;
		this.mno = mno;
		this.visited = visited;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPlevel() {
		return plevel;
	}
	public void setPlevel(String plevel) {
		this.plevel = plevel;
	}
	public int getPano() {
		return pano;
	}
	public void setPano(int pano) {
		this.pano = pano;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	@Override
	public String toString() {
		return "qna [title=" + title + ", plevel=" + plevel + ", pano=" + pano + ", contents=" + contents + ", resdate="
				+ resdate + ", author=" + author + ", mno=" + mno + ", visited=" + visited + "]";
	}
	

}
