package com.smartlibrary.service;


import com.smartlibrary.dao.UserDao;
import com.smartlibrary.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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
	public int addUser(User user){
		return userDao.addUser(user);
	}
	public int editUser(User user){
		return userDao.editUser(user);
	}
}
