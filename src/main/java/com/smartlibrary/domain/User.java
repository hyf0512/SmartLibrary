package com.smartlibrary.domain;

public class User extends BaseObject{

	/**
	 * 用户
	 */
	private static final long serialVersionUID = -1775298614368938621L;
	
	private String account;
	private String password;
	private String name;
	private String hobbyid;
	private String sex;
	private String photourl;
	private String nickname;
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobbyid() {
		return hobbyid;
	}
	public void setHobbyid(String hobbyid) {
		this.hobbyid = hobbyid;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhotourl() {
		return photourl;
	}
	public void setPhotourl(String photourl) {
		this.photourl = photourl;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
	

}