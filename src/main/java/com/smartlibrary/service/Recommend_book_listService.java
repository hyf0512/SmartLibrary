package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.Recommend_book_listDao;
import com.smartlibrary.domain.Recommend_book_list;


@Service
public class Recommend_book_listService {

	//private static final Logger logger = Logger.getLogger(Recommend_book_listService.class);
	@Autowired
	private Recommend_book_listDao recommend_book_listDao;
	public List<Recommend_book_list> getRecommend_book_list(){
		//logger.info("测试开始");
		Recommend_book_list temp =new Recommend_book_list();
		//logger.info("测试结束");
		return recommend_book_listDao.getRecommend_book_list(temp);
	}
}
