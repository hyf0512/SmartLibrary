package com.smartlibrary.domain;

public class Raking extends BaseObject{

	/**
	 * 排名
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String raking_id;
	private String year;
	private String month;
	private String number;
	private String type;
	private String studentid;
	
	public String getRaking_id() {
		return raking_id;
	}
	public void setRaking_id(String raking_id) {
		this.raking_id = raking_id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	
	

}
