package com.example.learnRest.rest_tutorial;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnRest.rest_tutorial.models.ApiResponse;
import com.example.learnRest.rest_tutorial.models.Students;
import com.example.learnRest.rest_tutorial.repositories.StudentsRepository;

@RestController
@RequestMapping("/")
public class StudentsController {
	@Autowired
	private StudentsRepository repository;
	
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET) 
	public List<Students> getAllStudents() 
	{ 
		return repository.findAll();
		
	}
	
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ApiResponse getStudents(@Valid @RequestBody Students enteredDetails) {
	    Students st=repository.findBy_id(enteredDetails.get_id());
	    ApiResponse apiResponse;
	    if(st==null)
	    {
	    	apiResponse=new ApiResponse(false,"Username Not Found!",null);
	    }
	    else if(st.getPassword().equals(enteredDetails.getPassword()))
	    {
	    	apiResponse=new ApiResponse(true,"Success",st);
	    }
	    else
	    	apiResponse=new ApiResponse(false,"Incorrect Password!",null);
    	return apiResponse;
	    
	}
	@RequestMapping(value = "/Register", method = RequestMethod.POST) 
	public ApiResponse createStudent(@Valid @RequestBody Students students) 
	{ 
		Students st=repository.findBy_id(students.get_id());
		if(st==null) {
			students.set_id(students.get_id());
		    repository.save(students); 
		    return new ApiResponse(true, "Success", students);
		}
		else
		{
			return new ApiResponse(false, "UserId already exists", null);
		}
		
	}
	
	
	
	
	
	
	/*
	 * @RequestMapping(value = "/{id}", method = RequestMethod.GET) public Pets
	 * getPetById(@PathVariable("id") ObjectId id) { return
	 * repository.findBy_id(id); }
	 * 
	 * @RequestMapping(value = "/{id}", method = RequestMethod.PUT) public void
	 * modifyPetById(@PathVariable("id") ObjectId id, @Valid
	 * 
	 * @RequestBody Pets pets) { pets.set_id(id); repository.save(pets); }
	 * 
	 * @RequestMapping(value = "/", method = RequestMethod.POST) public Pets
	 * createPet(@Valid @RequestBody Pets pets) { pets.set_id(ObjectId.get());
	 * repository.save(pets); return pets; }
	 * 
	 * @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) public void
	 * deletePet(@PathVariable ObjectId id) {
	 * repository.delete(repository.findBy_id(id)); }
	 */

}
