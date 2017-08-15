package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.College;
import com.smartlibrary.service.CollegeService;


@Controller
@RequestMapping({ "/getCollegeList" })
public class CollegeController {

	//private static final Logger logger = Logger.getLogger(Collegecontroller.class);
	@Autowired
	private CollegeService collegeService;
	@RequestMapping(method = { RequestMethod.GET })
	@ResponseBody
	//get方法测试
	public List<College> getCollege(HttpServletRequest request) {
		//logger.info("测试开始");
		//System.out.println(request.getQueryString());
		//logger.info("测试结束");
		return collegeService.getCollege();
	}

}