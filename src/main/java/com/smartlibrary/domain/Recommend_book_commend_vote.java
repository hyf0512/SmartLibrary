package com.smartlibrary.domain;

public class Recommend_book_commend_vote extends BaseObject {

	/**
	 * 推荐书本推荐点赞
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String recommend_voteid;
	private String id;
	private String account;
	
	public String getRecommend_voteid() {
		return recommend_voteid;
	}
	public void setRecommend_voteid(String recommend_voteid) {
		this.recommend_voteid = recommend_voteid;
	}
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
	
	

}

