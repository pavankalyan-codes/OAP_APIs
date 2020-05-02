package com.example.learnRest.rest_tutorial.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.learnRest.rest_tutorial.models.Students;

public interface StudentsRepository extends MongoRepository<Students, String> {
	
	Students findBy_id(String _id);
			
}
