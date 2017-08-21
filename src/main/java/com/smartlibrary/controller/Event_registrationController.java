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
@RequestMapping(value="/event_registration")
public class Event_registrationController {

	@Autowired
	private Event_registrationService event_registrationService;
	@RequestMapping(value="/getEvent_registrationList")
	@ResponseBody
	public List<Event_registration> getEvent_registrationList(HttpServletRequest request) {
		return event_registrationService.getEvent_registrationList();
	}
	@RequestMapping(value="/getOneEvent_registration")
	@ResponseBody
	public Event_registration getOneEvent_registration(Event_registration event_registration) {
		return event_registrationService.getOneEvent_registration(event_registration);
	}
	@RequestMapping(value="/addEvent_registration")
	@ResponseBody
	public void addEvent_registration(Event_registration event_registration) {
		event_registrationService.addEvent_registration(event_registration);
	}
	@RequestMapping(value="/editEvent_registration")
	@ResponseBody
	public void editEvent_registration(Event_registration event_registration) {
		event_registrationService.editEvent_registration(event_registration);
	}
}
