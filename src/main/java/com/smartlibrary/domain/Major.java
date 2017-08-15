package com.smartlibrary.domain;

public class Major extends BaseObject{

	/**
	 * 专业
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String major_id;
	private String college_id;
	private String name;
	
	public String getMajor_id() {
		return major_id;
	}
	public void setMajor_id(String major_id) {
		this.major_id = major_id;
	}
	public String getCollege_id() {
		return college_id;
	}
	public void setCollege_id(String college_id) {
		this.college_id = college_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
