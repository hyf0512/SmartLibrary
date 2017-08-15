package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.Reserved_commentDao;
import com.smartlibrary.domain.Reserved_comment;


@Service
public class Reserved_commentService {

	//private static final Logger logger = Logger.getLogger(Reserved_commentService.class);
	@Autowired
	private Reserved_commentDao reserved_commentDao;
	public List<Reserved_comment> getReserved_comment(){
		//logger.info("测试开始");
		Reserved_comment temp =new Reserved_comment();
		//logger.info("测试结束");
		return reserved_commentDao.getReserved_comment(temp);
	}
}
