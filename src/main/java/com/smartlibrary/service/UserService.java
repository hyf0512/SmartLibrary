package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.UserDao;
import com.smartlibrary.domain.User;


@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	public List<User> getUserList(){
		User temp =new User();
		return userDao.getUserList(temp);
	}
	public User getOneUser(User user){
		return userDao.getOneUser(user);
	}
	public void addUser(User user){
		userDao.addUser(user);
	}
	public void editUser(User user){
		userDao.editUser(user);
	}
}
