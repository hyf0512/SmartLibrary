package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Book_comment;
import com.smartlibrary.service.Book_commentService;


@Controller
@RequestMapping({ "/getBook_commentList" })
public class Book_commentController {

	//private static final Logger logger = Logger.getLogger(Book_commentcontroller.class);
	@Autowired
	private Book_commentService book_commentService;
	@RequestMapping(method = { RequestMethod.GET })
	@ResponseBody
	//get方法测试
	public List<Book_comment> getBook_comment(HttpServletRequest request) {
		//logger.info("测试开始");
		//System.out.println(request.getQueryString());
		//logger.info("测试结束");
		return book_commentService.getBook_comment();
	}

}
