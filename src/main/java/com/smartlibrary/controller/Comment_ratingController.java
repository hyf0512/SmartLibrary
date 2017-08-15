package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Comment_rating;
import com.smartlibrary.service.Comment_ratingService;


@Controller
@RequestMapping({ "/getComment_ratingList" })
public class Comment_ratingController {

	//private static final Logger logger = Logger.getLogger(Comment_ratingcontroller.class);
	@Autowired
	private Comment_ratingService comment_ratingService;
	@RequestMapping(method = { RequestMethod.GET })
	@ResponseBody
	//get方法测试
	public List<Comment_rating> getComment_rating(HttpServletRequest request) {
		//logger.info("测试开始");
		//System.out.println(request.getQueryString());
		//logger.info("测试结束");
		return comment_ratingService.getComment_rating();
	}

}
