package com.smartlibrary.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.testUserDao;
import com.smartlibrary.domain.School;

@Service
public class testUserPostService {
	private static final Logger logger = Logger.getLogger(testUserService.class);
	@Autowired
	private testUserDao testuserdao;
	public List<School> getschool1(School school){
		logger.info("测试开始");
		School a =new School();
		a.setSchool_id("1");
		logger.info("测试结束");
		return testuserdao.getschool(school);
	}
}
