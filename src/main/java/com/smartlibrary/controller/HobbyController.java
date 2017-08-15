package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Hobby;
import com.smartlibrary.service.HobbyService;


@Controller
@RequestMapping({ "/getHobbyList" })
public class HobbyController {

	//private static final Logger logger = Logger.getLogger(Hobbycontroller.class);
	@Autowired
	private HobbyService hobbyService;
	@RequestMapping(method = { RequestMethod.GET })
	@ResponseBody
	//get方法测试
	public List<Hobby> getHobby(HttpServletRequest request) {
		//logger.info("测试开始");
		//System.out.println(request.getQueryString());
		//logger.info("测试结束");
		return hobbyService.getHobby();
	}

}
