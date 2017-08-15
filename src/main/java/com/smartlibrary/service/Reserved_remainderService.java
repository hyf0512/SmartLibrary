package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.Reserved_remainderDao;
import com.smartlibrary.domain.Reserved_remainder;


@Service
public class Reserved_remainderService {

	//private static final Logger logger = Logger.getLogger(Reserved_remainderService.class);
	@Autowired
	private Reserved_remainderDao reserved_remainderDao;
	public List<Reserved_remainder> getReserved_remainder(){
		//logger.info("测试开始");
		Reserved_remainder temp =new Reserved_remainder();
		//logger.info("测试结束");
		return reserved_remainderDao.getReserved_remainder(temp);
	}
}
