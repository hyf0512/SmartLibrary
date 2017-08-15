package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.Recommend_book_commend_voteDao;
import com.smartlibrary.domain.Recommend_book_commend_vote;


@Service
public class Recommend_book_commend_voteService {

	//private static final Logger logger = Logger.getLogger(Recommend_book_commend_voteService.class);
	@Autowired
	private Recommend_book_commend_voteDao recommend_book_commend_voteDao;
	public List<Recommend_book_commend_vote> getRecommend_book_commend_vote(){
		//logger.info("测试开始");
		Recommend_book_commend_vote temp =new Recommend_book_commend_vote();
		//logger.info("测试结束");
		return recommend_book_commend_voteDao.getRecommend_book_commend_vote(temp);
	}
}
