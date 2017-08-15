package com.smartlibrary.domain;

public class Book_recommend extends BaseObject{

	/**
	 * 荐购图书
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String id;
	private String account;
	private String school_id;
	private String bookid;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getSchool_id() {
		return school_id;
	}
	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	
	
	
}