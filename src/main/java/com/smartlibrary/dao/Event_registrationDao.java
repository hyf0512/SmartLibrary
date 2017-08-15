package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Event_registration;

public interface Event_registrationDao {
	public abstract List<Event_registration> getEvent_registration(Event_registration event_registration);
}
