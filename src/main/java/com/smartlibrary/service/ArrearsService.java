package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.ArrearsDao;
import com.smartlibrary.domain.Arrears;


@Service
public class ArrearsService {

	//private static final Logger logger = Logger.getLogger(ArrearsService.class);
	@Autowired
	private ArrearsDao arrearsDao;
	public List<Arrears> getArrears(){
		//logger.info("测试开始");
		Arrears temp =new Arrears();
		//logger.info("测试结束");
		return arrearsDao.getArrears(temp);
	}
}
