package com.example.learnRest.rest_tutorial.models;

import java.util.List;

public class Questions {

	public String qid;
	public String question;
	public List<String> options;
	public String answer;
	public Questions(String qid, String question, List<String> options,String answer) {
		super();
		this.qid = qid;
		this.question = question;
		this.options = options;
		this.answer=answer;
	}
	public String getQid() {
		return qid;
	}
	public void setQid(String qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	
	
	
	
}
