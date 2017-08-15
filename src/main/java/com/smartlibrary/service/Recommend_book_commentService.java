package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.Recommend_book_commentDao;
import com.smartlibrary.domain.Recommend_book_comment;


@Service
public class Recommend_book_commentService {

	//private static final Logger logger = Logger.getLogger(Recommend_book_commentService.class);
	@Autowired
	private Recommend_book_commentDao recommend_book_commentDao;
	public List<Recommend_book_comment> getRecommend_book_comment(){
		//logger.info("测试开始");
		Recommend_book_comment temp =new Recommend_book_comment();
		//logger.info("测试结束");
		return recommend_book_commentDao.getRecommend_book_comment(temp);
	}
}
