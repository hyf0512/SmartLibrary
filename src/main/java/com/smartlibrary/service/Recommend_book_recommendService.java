package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.Recommend_book_recommendDao;
import com.smartlibrary.domain.Recommend_book_recommend;


@Service
public class Recommend_book_recommendService {

	//private static final Logger logger = Logger.getLogger(Recommend_book_recommendService.class);
	@Autowired
	private Recommend_book_recommendDao recommend_book_recommendDao;
	public List<Recommend_book_recommend> getRecommend_book_recommend(){
		//logger.info("测试开始");
		Recommend_book_recommend temp =new Recommend_book_recommend();
		//logger.info("测试结束");
		return recommend_book_recommendDao.getRecommend_book_recommend(temp);
	}
}
