package org.ui.dto;

public class Data {
	private String title;
	private String contents;
	private String resdate;
	private int visited;
	private String file;
	
	public Data() {}
	public Data(String title, String contents, String resdate, int visited, String file) {
		super();
		this.title = title;
		this.contents = contents;
		this.resdate = resdate;
		this.visited = visited;
		this.file = file;
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
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "Data [title=" + title + ", contents=" + contents + ", resdate=" + resdate + ", visited=" + visited
				+ ", file=" + file + "]";
	}
	
	

}
