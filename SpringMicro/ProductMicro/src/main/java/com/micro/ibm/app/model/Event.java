package com.micro.ibm.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Event {

	@Id
	private int id;
	private String eventName;
	private String eventPayload;
	@Temporal(TemporalType.TIMESTAMP)
	private Date timeStamp;

	public Event(int a, String b, String c, Date d) {
		super();
		this.id = a;
		this.eventName = b;
		this.eventPayload = c;
		this.timeStamp = d;
	}

	public Event() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventPayload() {
		return eventPayload;
	}

	public void setEventPayload(String eventPayload) {
		this.eventPayload = eventPayload;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

}
