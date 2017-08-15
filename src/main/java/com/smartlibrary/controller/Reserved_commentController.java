package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Reserved_comment;
import com.smartlibrary.service.Reserved_commentService;


@Controller
@RequestMapping({ "/getReserved_commentList" })
public class Reserved_commentController {

	//private static final Logger logger = Logger.getLogger(Reserved_commentcontroller.class);
	@Autowired
	private Reserved_commentService reserved_commentService;
	@RequestMapping(method = { RequestMethod.GET })
	@ResponseBody
	//get方法测试
	public List<Reserved_comment> getReserved_comment(HttpServletRequest request) {
		//logger.info("测试开始");
		//System.out.println(request.getQueryString());
		//logger.info("测试结束");
		return reserved_commentService.getReserved_comment();
	}

}
