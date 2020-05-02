package com.example.learnRest.rest_tutorial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnRest.rest_tutorial.models.Students;
import com.example.learnRest.rest_tutorial.models.Todos;
import com.example.learnRest.rest_tutorial.repositories.StudentsRepository;
import com.example.learnRest.rest_tutorial.repositories.TodosRepository;

@RestController
//@RequestMapping("/todos")
public class TodosController {
	
	@Autowired
	private TodosRepository todosRepository;
	
	@RequestMapping(value = "/users/{username}/todos", method = RequestMethod.GET)
	public List<Todos> getAllTodos(@PathVariable String username) {
	  return todosRepository.findAll();
	}
	
	
	

}
