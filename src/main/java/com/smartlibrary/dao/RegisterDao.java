package com.smartlibrary.dao;

import com.smartlibrary.domain.User;

public interface RegisterDao {

	public abstract String ifuserexist(String account);
	public abstract void insertuser(User user);
	public abstract void editpassword(User user);
	public abstract String getpassword(String account);
	public abstract void updatepassword(User user);
}
