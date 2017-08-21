package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.User;

public interface UserDao {
	public abstract List<User> getUserList(User user);
	public abstract User getOneUser(User user);
	public abstract void addUser(User user);
	public abstract void editUser(User user);
}
