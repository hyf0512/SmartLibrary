package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.RakingDao;
import com.smartlibrary.domain.Raking;


@Service
public class RakingService {

	//private static final Logger logger = Logger.getLogger(RakingService.class);
	@Autowired
	private RakingDao rakingDao;
	public List<Raking> getRaking(){
		//logger.info("测试开始");
		Raking temp =new Raking();
		//logger.info("测试结束");
		return rakingDao.getRaking(temp);
	}
}
