package com.example.learnRest.rest_tutorial.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.learnRest.rest_tutorial.models.Pets;

public interface PetsRepository extends MongoRepository<Pets,String> {
	
	Pets findBy_id(ObjectId _id);
	
}
