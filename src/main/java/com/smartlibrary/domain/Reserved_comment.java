package com.smartlibrary.domain;

public class Reserved_comment extends BaseObject{

	/**
	 * 预约评论
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String reserved_id;
	private String reserved_number;
	private String studentid;
	private String type;
	private String name;
	private String location;
	private String starttime;
	private String endtime;
	private String date;
	private String number;
	private String number_ordered;
	private String end_date;
	private String event_comment;
	
	public String getReserved_id() {
		return reserved_id;
	}
	public void setReserved_id(String reserved_id) {
		this.reserved_id = reserved_id;
	}
	public String getReserved_number() {
		return reserved_number;
	}
	public void setReserved_number(String reserved_number) {
		this.reserved_number = reserved_number;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getNumber_ordered() {
		return number_ordered;
	}
	public void setNumber_ordered(String number_ordered) {
		this.number_ordered = number_ordered;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getEvent_comment() {
		return event_comment;
	}
	public void setEvent_comment(String event_comment) {
		this.event_comment = event_comment;
	}
	
	

}
