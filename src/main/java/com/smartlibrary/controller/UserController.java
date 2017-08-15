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
@RequestMapping({ "/getUserList" })
public class UserController {

	//private static final Logger logger = Logger.getLogger(Usercontroller.class);
	@Autowired
	private UserService userService;
	@RequestMapping(method = { RequestMethod.GET })
	@ResponseBody
	//get方法测试
	public List<User> getUser(HttpServletRequest request) {
		//logger.info("测试开始");
		//System.out.println(request.getQueryString());
		//logger.info("测试结束");
		return userService.getUser();
	}

}
