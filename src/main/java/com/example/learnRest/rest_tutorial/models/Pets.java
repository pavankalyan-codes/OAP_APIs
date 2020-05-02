package com.example.learnRest.rest_tutorial.models;

import org.bson.types.ObjectId;

public class Pets {
	public ObjectId _id;
	
	public String name;
	public String species;
	public String breed;
	
	public Pets(ObjectId _id, String name, String species, String breed) {
		super();
		this._id = _id;
		this.name = name;
		this.species = species;
		this.breed = breed;
	}

	public String get_id() {
		return _id.toHexString();
	}

	public String getName() {
		return name;
	}

	public String getSpecies() {
		return species;
	}

	public String getBreed() {
		return breed;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	

}
