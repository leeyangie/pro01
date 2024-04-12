package org.ui.dto;

public class Qna {
	private int no;
	private String plevel;
	private int parno;
	private String title;
	private String contents;
	private String resdate;
	private String author;
	private int visited;
	
	public Qna() {}
	public Qna(int no, String plevel, int parno, String title, String contents, String resdate, String author,
			int visited) {
		super();
		this.no = no;
		this.plevel = plevel;
		this.parno = parno;
		this.title = title;
		this.contents = contents;
		this.resdate = resdate;
		this.author = author;
		this.visited = visited;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getPlevel() {
		return plevel;
	}
	public void setPlevel(String plevel) {
		this.plevel = plevel;
	}
	public int getParno() {
		return parno;
	}
	public void setParno(int parno) {
		this.parno = parno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	@Override
	public String toString() {
		return "Qna [no=" + no + ", plevel=" + plevel + ", parno=" + parno + ", title=" + title + ", contents="
				+ contents + ", resdate=" + resdate + ", author=" + author + ", visited=" + visited + "]";
	}
	
	
}