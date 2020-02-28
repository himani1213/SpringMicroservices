package com.micro.ibm.app.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

	@Autowired
	private EventRepositary repo;

	public List<Event> listAllEvents() {
		return repo.findAll();
	}

	public void addEvent(Event event) {

	}

}
