package com.smartlibrary.domain;

public class Recommend_book_list extends BaseObject{

	/**
	 * 推荐书本列表
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String recommend_id;
	private String college_id;
	private String name;
	private String author;
	private String content;
	private String price;
	private String type;
	private String votecount;
	
	public String getRecommend_id() {
		return recommend_id;
	}
	public void setRecommend_id(String recommend_id) {
		this.recommend_id = recommend_id;
	}
	public String getCollege_id() {
		return college_id;
	}
	public void setCollege_id(String college_id) {
		this.college_id = college_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVotecount() {
		return votecount;
	}
	public void setVotecount(String votecount) {
		this.votecount = votecount;
	}
	
	

}
