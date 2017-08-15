package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.Book_commentDao;
import com.smartlibrary.domain.Book_comment;


@Service
public class Book_commentService {

	//private static final Logger logger = Logger.getLogger(Book_commentService.class);
	@Autowired
	private Book_commentDao book_commentDao;
	public List<Book_comment> getBook_comment(){
		//logger.info("测试开始");
		Book_comment temp =new Book_comment();
		//logger.info("测试结束");
		return book_commentDao.getBook_comment(temp);
	}
}
