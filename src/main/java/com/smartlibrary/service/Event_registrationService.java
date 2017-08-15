package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.Event_registrationDao;
import com.smartlibrary.domain.Event_registration;


@Service
public class Event_registrationService {

	//private static final Logger logger = Logger.getLogger(Event_registrationService.class);
	@Autowired
	private Event_registrationDao event_registrationDao;
	public List<Event_registration> getEvent_registration(){
		//logger.info("测试开始");
		Event_registration temp =new Event_registration();
		//logger.info("测试结束");
		return event_registrationDao.getEvent_registration(temp);
	}
}
