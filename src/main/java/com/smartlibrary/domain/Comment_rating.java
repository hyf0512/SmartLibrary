package com.smartlibrary.domain;

public class Comment_rating extends BaseObject{

	/**
	 * 评论评分
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String comment_rating_id;
	private String commentid;
	private String account;
	
	public String getComment_rating_id() {
		return comment_rating_id;
	}
	public void setComment_rating_id(String comment_rating_id) {
		this.comment_rating_id = comment_rating_id;
	}
	public String getCommentid() {
		return commentid;
	}
	public void setCommentid(String commentid) {
		this.commentid = commentid;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
	

}
