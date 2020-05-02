package com.example.learnRest.rest_tutorial.models;

public class Answer {
	private String qid;
	private String answer;
	public Answer(String qid, String answer) {
		super();
		this.qid = qid;
		this.answer = answer;
	}
	public String getQid() {
		return qid;
	}
	public void setQid(String qid) {
		this.qid = qid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	

}
