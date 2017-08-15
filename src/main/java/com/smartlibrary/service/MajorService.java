package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.MajorDao;
import com.smartlibrary.domain.Major;


@Service
public class MajorService {

	//private static final Logger logger = Logger.getLogger(MajorService.class);
	@Autowired
	private MajorDao majorDao;
	public List<Major> getMajor(){
		//logger.info("测试开始");
		Major temp =new Major();
		//logger.info("测试结束");
		return majorDao.getMajor(temp);
	}
}
