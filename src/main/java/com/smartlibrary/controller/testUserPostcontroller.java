package com.smartlibrary.controller;

import java.util.List;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smartlibrary.domain.School;
import com.smartlibrary.service.testUserPostService;

@Controller
@RequestMapping({ "/version1" })
public class testUserPostcontroller {
	private static final Logger logger = Logger.getLogger(testUsergetcontroller.class);
	@Autowired
	private testUserPostService testuserpostservice;
	@RequestMapping(method = { RequestMethod.POST })
	@ResponseBody
	//post方法测试
	public List<School> getschool(@RequestBody School school) {
		logger.info("测试开始ʼ");
		logger.info("测试结束");
		return testuserpostservice.getschool1(school);
	}
}
