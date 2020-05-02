package com.example.learnRest.rest_tutorial.models;

public class ApiResponse {
	
	private boolean reponse;
	private String message;
	private Students students;
	public ApiResponse(boolean reponse, String message, Students students) {
		super();
		this.reponse = reponse;
		this.message = message;
		this.students = students;
	}
	
	public ApiResponse(boolean reponse, String message) {
		super();
		this.reponse = reponse;
		this.message = message;
	}

	public boolean isReponse() {
		return reponse;
	}
	public void setReponse(boolean reponse) {
		this.reponse = reponse;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Students getStudents() {
		return students;
	}
	public void setStudents(Students students) {
		this.students = students;
	}
	
	
	
	
	
	

}
