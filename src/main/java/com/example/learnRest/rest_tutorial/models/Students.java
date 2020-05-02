package com.example.learnRest.rest_tutorial.models;

public class Students {
	String _id;
	String name;
	String email;
	String password;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Students(String _id, String name, String email, String password) {
		super();
		this._id = _id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	

	@Override
	public String toString() {
		
		return "Students [_id=" + _id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}

}
