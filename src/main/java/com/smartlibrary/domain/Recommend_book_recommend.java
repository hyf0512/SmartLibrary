package com.smartlibrary.domain;

public class Recommend_book_recommend extends BaseObject{

	/**
	 * 推荐书本推荐
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String id;
	private String recommend_id;
	private String account;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRecommend_id() {
		return recommend_id;
	}
	public void setRecommend_id(String recommend_id) {
		this.recommend_id = recommend_id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
	

}