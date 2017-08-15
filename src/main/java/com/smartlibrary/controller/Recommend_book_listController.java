package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Recommend_book_list;
import com.smartlibrary.service.Recommend_book_listService;


@Controller
@RequestMapping({ "/getRecommend_book_listList" })
public class Recommend_book_listController {

	//private static final Logger logger = Logger.getLogger(Recommend_book_listcontroller.class);
	@Autowired
	private Recommend_book_listService recommend_book_listService;
	@RequestMapping(method = { RequestMethod.GET })
	@ResponseBody
	//get方法测试
	public List<Recommend_book_list> getRecommend_book_list(HttpServletRequest request) {
		//logger.info("测试开始");
		//System.out.println(request.getQueryString());
		//logger.info("测试结束");
		return recommend_book_listService.getRecommend_book_list();
	}

}
