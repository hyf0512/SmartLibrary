package com.smartlibrary.dao;

import com.smartlibrary.domain.Event_registration;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Event_registrationDao {
	public abstract List<Event_registration> getEvent_registrationList(Event_registration event_registration);
	public abstract Event_registration getOneEvent_registration(Event_registration event_registration);
	public abstract int addEvent_registration(Event_registration event_registration);
	public abstract int editEvent_registration(Event_registration event_registration);
}
