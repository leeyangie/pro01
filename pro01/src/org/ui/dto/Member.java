package org.ui.dto;

public class Member {
	private String name;
	private String id;
	private String varchar;
	private int birth;
	private String address;
	
	public Member() {}
	public Member(String name, String id, String varchar, int birth, String address) {
		super();
		this.name = name;
		this.id = id;
		this.varchar = varchar;
		this.birth = birth;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVarchar() {
		return varchar;
	}
	public void setVarchar(String varchar) {
		this.varchar = varchar;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", varchar=" + varchar + ", birth=" + birth + ", address="
				+ address + "]";
	}

	
}
