package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.IdentDao;
import com.smartlibrary.domain.Ident;


@Service
public class IdentService {

	//private static final Logger logger = Logger.getLogger(IdentService.class);
	@Autowired
	private IdentDao identDao;
	public List<Ident> getIdent(){
		//logger.info("测试开始");
		Ident temp =new Ident();
		//logger.info("测试结束");
		return identDao.getIdent(temp);
	}
}
