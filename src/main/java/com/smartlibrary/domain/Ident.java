package com.smartlibrary.domain;

public class Ident extends BaseObject{

	/**
	 * 身份
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String identid;
	private String school_id;
	private String college_id;
	private String major_id;
	private String account;
	private String grade;
	private String state;
	
	public String getIdentid() {
		return identid;
	}
	public void setIdentid(String identid) {
		this.identid = identid;
	}
	public String getSchool_id() {
		return school_id;
	}
	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}
	public String getCollege_id() {
		return college_id;
	}
	public void setCollege_id(String college_id) {
		this.college_id = college_id;
	}
	public String getMajor_id() {
		return major_id;
	}
	public void setMajor_id(String major_id) {
		this.major_id = major_id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
