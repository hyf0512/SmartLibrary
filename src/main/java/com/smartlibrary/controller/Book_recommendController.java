package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Book_recommend;
import com.smartlibrary.service.Book_recommendService;


@Controller
@RequestMapping({ "/getBook_recommendList" })
public class Book_recommendController {

	//private static final Logger logger = Logger.getLogger(Book_recommendcontroller.class);
	@Autowired
	private Book_recommendService book_recommendService;
	@RequestMapping(method = { RequestMethod.GET })
	@ResponseBody
	//get方法测试
	public List<Book_recommend> getBook_recommend(HttpServletRequest request) {
		//logger.info("测试开始");
		//System.out.println(request.getQueryString());
		//logger.info("测试结束");
		return book_recommendService.getBook_recommend();
	}

}
