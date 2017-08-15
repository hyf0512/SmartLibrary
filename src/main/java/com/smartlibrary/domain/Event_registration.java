package com.smartlibrary.domain;

public class Event_registration extends BaseObject{

	/**
	 * 事件登记
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String id;
	private String reserved_id;
	private String studentid;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReserved_id() {
		return reserved_id;
	}
	public void setReserved_id(String reserved_id) {
		this.reserved_id = reserved_id;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	


}
