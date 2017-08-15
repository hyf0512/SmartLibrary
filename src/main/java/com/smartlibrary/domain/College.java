package com.smartlibrary.domain;

public class College extends BaseObject{

	/**
	 * 学院
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String college_id;
	private String school_id;
	private String name;
	
	public String getCollege_id() {
		return college_id;
	}
	public void setCollege_id(String college_id) {
		this.college_id = college_id;
	}
	public String getSchool_id() {
		return school_id;
	}
	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	


}
