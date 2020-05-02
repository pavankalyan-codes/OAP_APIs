package com.example.learnRest.rest_tutorial.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.learnRest.rest_tutorial.models.Assessments;

public interface AssessmentsRepository extends MongoRepository<Assessments, String> {

	Assessments findBy_id(String _id);
}
