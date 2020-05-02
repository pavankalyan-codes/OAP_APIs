package com.example.learnRest.rest_tutorial.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.learnRest.rest_tutorial.models.Todos;

public interface TodosRepository extends MongoRepository<Todos, String> {
	Todos findBy_id(ObjectId _id);
}
