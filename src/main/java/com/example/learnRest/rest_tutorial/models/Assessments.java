package com.example.learnRest.rest_tutorial.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Assessments {
	@Id
	private String _id;
	private String subject;
    @Field("questions")
	private List<Questions> questions;
	
	
	
	
	public Assessments(String _id, String subject, List<Questions> questions) {
		super();
		this._id = _id;
		this.subject = subject;
		this.questions = questions;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public List<Questions> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}
	
	

}
