package com.company.eventmanagement.com.emc.managers;

import com.company.eventmanagement.com.emc.entities.Event;

public class EventManagerImpl implements EventManager {

	@Override
	public Event create(Long id) {
		return new Event(id, null, null);
	}

}
