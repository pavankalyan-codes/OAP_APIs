package com.example.learnRest.rest_tutorial.models;

import org.bson.types.ObjectId;

public class Todos {

	public ObjectId _id;
	public String username;
	public String description;
	public String targetDate;
	public boolean done;
	public String get_id() {
		return _id.toHexString();
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(String targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	public Todos(ObjectId _id, String username, String description, String targetDate, boolean done) {
		super();
		this._id = _id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}
	
	
}
