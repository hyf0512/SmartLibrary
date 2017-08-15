package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.SchoolDao;
import com.smartlibrary.domain.School;


@Service
public class SchoolService {

	//private static final Logger logger = Logger.getLogger(SchoolService.class);
	@Autowired
	private SchoolDao schoolDao;
	public List<School> getSchool(){
		//logger.info("测试开始");
		School temp =new School();
		//logger.info("测试结束");
		return schoolDao.getSchool(temp);
	}
}
