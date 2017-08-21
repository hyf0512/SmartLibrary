package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Event_registration;

public interface Event_registrationDao {
	public abstract List<Event_registration> getEvent_registrationList(Event_registration event_registration);
	public abstract Event_registration getOneEvent_registration(Event_registration event_registration);
	public abstract void addEvent_registration(Event_registration event_registration);
	public abstract void editEvent_registration(Event_registration event_registration);
}
