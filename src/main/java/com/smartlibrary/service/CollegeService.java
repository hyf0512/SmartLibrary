package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.CollegeDao;
import com.smartlibrary.domain.College;


@Service
public class CollegeService {

	//private static final Logger logger = Logger.getLogger(CollegeService.class);
	@Autowired
	private CollegeDao collegeDao;
	public List<College> getCollege(){
		//logger.info("测试开始");
		College temp =new College();
		//logger.info("测试结束");
		return collegeDao.getCollege(temp);
	}
}
