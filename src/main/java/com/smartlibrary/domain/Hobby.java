package com.smartlibrary.domain;

public class Hobby extends BaseObject{

	/**
	 * 爱好
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String hobbyId;
	private String hobbyName;
	public String getHobbyId() {
		return hobbyId;
	}
	public void setHobbyId(String hobbyId) {
		this.hobbyId = hobbyId;
	}
	public String getHobbyName() {
		return hobbyName;
	}
	public void setHobbyName(String hobbyName) {
		this.hobbyName = hobbyName;
	}
	
}
