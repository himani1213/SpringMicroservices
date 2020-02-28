package com.micro.ibm.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.micro.ibm.app.model.Event;
import com.micro.ibm.app.model.EventService;

@RestController
public class EventController {

	@Autowired
	private EventService eventService;

	@RequestMapping(method = RequestMethod.GET, value = "/event")
	public List<Event> getAllEvents() {
		return eventService.listAllEvents();

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/event")
	public ResponseEntity<String> getAllEvents(@RequestBody Event event) {
		eventService.addEvent(event);
		return ResponseEntity.ok().build();

	}
}
