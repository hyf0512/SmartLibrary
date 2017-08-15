package com.smartlibrary.domain;

public class Book_comment extends BaseObject{

	/**
	 * 书本评论
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String commentid;
	private String college_id;
	private String account;
	private String bookid;
	private String date;
	private String time;
	private String rating;
	private String votecount;
	private String content;
	
	public String getCommentid() {
		return commentid;
	}
	public void setCommentid(String commentid) {
		this.commentid = commentid;
	}
	public String getCollege_id() {
		return college_id;
	}
	public void setCollege_id(String college_id) {
		this.college_id = college_id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
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
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getVotecount() {
		return votecount;
	}
	public void setVotecount(String votecount) {
		this.votecount = votecount;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}