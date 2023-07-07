package com.company.eventmanagement.com.emc.test;

import com.company.eventmanagement.com.emc.entities.Organizer;
import com.company.eventmanagement.com.emc.entities.Event;
import com.company.eventmanagement.com.emc.managers.EventManager;
import com.company.eventmanagement.com.emc.managers.EventManagerImpl2;

public class Test {

	public static void main(String[] args) {

		Organizer organizer = new Organizer();
		organizer.setId(123l);
		organizer.setName("Apple Inc");
		System.out.println(organizer);
		System.out.println(organizer.getName());

		Event event = new Event(456l, "Ihpone 100 Launch", "Grand Launch");
		System.out.println(event.getDescription());

		EventManager em = new EventManagerImpl2();
		System.out.println(em.create(456l).getName());

	}

}
