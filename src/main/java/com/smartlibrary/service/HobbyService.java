package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.HobbyDao;
import com.smartlibrary.domain.Hobby;


@Service
public class HobbyService {

	//private static final Logger logger = Logger.getLogger(HobbyService.class);
	@Autowired
	private HobbyDao hobbyDao;
	public List<Hobby> getHobby(){
		//logger.info("测试开始");
		Hobby temp =new Hobby();
		//logger.info("测试结束");
		return hobbyDao.getHobby(temp);
	}
}
