package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.User;

public interface UserDao {
	public abstract List<User> getUser(User user);
}
