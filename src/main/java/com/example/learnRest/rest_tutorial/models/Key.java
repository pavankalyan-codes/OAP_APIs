package com.example.learnRest.rest_tutorial.models;

import java.util.List;

public class Key {

	private String examid;
	private List<Answer> answers;
	public Key(String examid, List<Answer> answers) {
		super();
		this.examid = examid;
		this.answers = answers;
	}
	public String getExamid() {
		return examid;
	}
	public void setExamid(String examid) {
		this.examid = examid;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
	
	
}
