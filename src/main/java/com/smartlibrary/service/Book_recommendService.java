package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.Book_recommendDao;
import com.smartlibrary.domain.Book_recommend;


@Service
public class Book_recommendService {

	//private static final Logger logger = Logger.getLogger(Book_recommendService.class);
	@Autowired
	private Book_recommendDao book_recommendDao;
	public List<Book_recommend> getBook_recommend(){
		//logger.info("测试开始");
		Book_recommend temp =new Book_recommend();
		//logger.info("测试结束");
		return book_recommendDao.getBook_recommend(temp);
	}
}
