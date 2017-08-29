package com.smartlibrary.service;


import com.smartlibrary.dao.Event_registrationDao;
import com.smartlibrary.domain.Event_registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Event_registrationService {

	@Autowired
	private Event_registrationDao event_registrationDao;
	public List<Event_registration> getEvent_registrationList(){
		Event_registration temp =new Event_registration();
		return event_registrationDao.getEvent_registrationList(temp);
	}
	public Event_registration getOneEvent_registration(Event_registration event_registration){
		return event_registrationDao.getOneEvent_registration(event_registration);
	}
	public int addEvent_registration(Event_registration event_registration){
		return event_registrationDao.addEvent_registration(event_registration);
	}
	public int editEvent_registration(Event_registration event_registration){
		return event_registrationDao.editEvent_registration(event_registration);
	}
}
