package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.Comment_ratingDao;
import com.smartlibrary.domain.Comment_rating;


@Service
public class Comment_ratingService {

	//private static final Logger logger = Logger.getLogger(Comment_ratingService.class);
	@Autowired
	private Comment_ratingDao comment_ratingDao;
	public List<Comment_rating> getComment_rating(){
		//logger.info("测试开始");
		Comment_rating temp =new Comment_rating();
		//logger.info("测试结束");
		return comment_ratingDao.getComment_rating(temp);
	}
}
