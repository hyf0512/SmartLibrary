package com.smartlibrary.domain;

public class Recommend_book_comment extends BaseObject {

	/**
	 * 推荐书本评论
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String id;
	private String account;
	private String recommend_id;
	private String date;
	private String time;
	private String content;
	private String votecount;
	
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
	public String getRecommend_id() {
		return recommend_id;
	}
	public void setRecommend_id(String recommend_id) {
		this.recommend_id = recommend_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getVotecount() {
		return votecount;
	}
	public void setVotecount(String votecount) {
		this.votecount = votecount;
	}
	
	

}
