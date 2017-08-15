package com.smartlibrary.domain;

public class Hobby extends BaseObject{

	/**
	 * 爱好
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String hobbyid;
	private String name;
	
	public String getHobbyid() {
		return hobbyid;
	}
	public void setHobbyid(String hobbyid) {
		this.hobbyid = hobbyid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	


}
