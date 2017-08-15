package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.UserDao;
import com.smartlibrary.domain.User;


@Service
public class UserService {

	//private static final Logger logger = Logger.getLogger(UserService.class);
	@Autowired
	private UserDao userDao;
	public List<User> getUser(){
		//logger.info("测试开始");
		User temp =new User();
		//logger.info("测试结束");
		return userDao.getUser(temp);
	}
}
