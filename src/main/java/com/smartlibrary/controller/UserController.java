package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.User;
import com.smartlibrary.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserService userService;
	@RequestMapping(value="/getUserList")
	@ResponseBody
	public List<User> getUserList(HttpServletRequest request) {
		return userService.getUserList();
	}
	@RequestMapping(value="/getOneUser")
	@ResponseBody
	public User getOneUser(User user) {
		return userService.getOneUser(user);
	}
	@RequestMapping(value="/addUser")
	@ResponseBody
	public void addUser(User user) {
		userService.addUser(user);
	}
	@RequestMapping(value="/editUser")
	@ResponseBody
	public void editUser(User user) {
		userService.editUser(user);
	}
}
