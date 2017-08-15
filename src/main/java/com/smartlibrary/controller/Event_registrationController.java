package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Event_registration;
import com.smartlibrary.service.Event_registrationService;


@Controller
@RequestMapping({ "/getEvent_registrationList" })
public class Event_registrationController {

	//private static final Logger logger = Logger.getLogger(Event_registrationcontroller.class);
	@Autowired
	private Event_registrationService event_registrationService;
	@RequestMapping(method = { RequestMethod.GET })
	@ResponseBody
	//get方法测试
	public List<Event_registration> getEvent_registration(HttpServletRequest request) {
		//logger.info("测试开始");
		//System.out.println(request.getQueryString());
		//logger.info("测试结束");
		return event_registrationService.getEvent_registration();
	}

}
