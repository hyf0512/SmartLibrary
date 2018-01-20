package com.smartlibrary.domain;

public class User extends BaseObject{

	/**
	 * 用户
	 */
	private static final long serialVersionUID = -1775298614368938621L;

	private String id;
	private String account;
	private String password;
	private String nickname;
	private String photoUrl;
	private String hobbyId;
	
	private String hobbyName;
	private String oldpassword;
	
	public String getOldpassword(){
		return oldpassword;
	}
	public void setOldpassword(String oldpassword){
		this.oldpassword=oldpassword;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHobbyId() {
		return hobbyId;
	}
	public void setHobbyId(String hobbyId) {
		this.hobbyId = hobbyId;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getHobbyName() {
		return hobbyName;
	}
	public void setHobbyName(String hobbyName) {
		this.hobbyName = hobbyName;
	}
	
}