package org.ui.dto;

public class Notice {
	private String title;
	private String contents;
	private String resdate;
	private String author;
	private int visited;
	
	public Notice() {}
	public Notice(String title, String contents, String resdate, String author, int visited) {
		super();
		this.title = title;
		this.contents = contents;
		this.resdate = resdate;
		this.author = author;
		this.visited = visited;
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
		return "Notice [title=" + title + ", contents=" + contents + ", resdate=" + resdate + ", author=" + author
				+ ", visited=" + visited + "]";
	}
	
	

}
