package com.example.learnRest.rest_tutorial;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnRest.rest_tutorial.models.Answer;
import com.example.learnRest.rest_tutorial.models.AssessmentResponse;
import com.example.learnRest.rest_tutorial.models.Assessments;
import com.example.learnRest.rest_tutorial.models.Key;
import com.example.learnRest.rest_tutorial.models.Questions;
import com.example.learnRest.rest_tutorial.models.Score;
import com.example.learnRest.rest_tutorial.repositories.AssessmentsRepository;

@RestController
//@RequestMapping("/")
public class AssessmentsController {
	
	@Autowired
	private AssessmentsRepository assessmentRepository;
	
	
	@RequestMapping(value = "/FetchAll", method = RequestMethod.GET) 
	public List<Assessments> FetchAssessments() 
	{ 
		return assessmentRepository.findAll();
	}
	
	@RequestMapping(value = "/FetchExam", method = RequestMethod.POST) 
	public Assessments FetchExam(@RequestBody Assessments assessments) 
	{ 
		return assessmentRepository.findBy_id(assessments.get_id());
	}
	
	@RequestMapping(value = "/SubmitExam", method = RequestMethod.POST) 
	public Score SubmitExam(@RequestBody Key key) 
	{ 
		
		//add code to insert values into AssessmentsTaken collection
				
		
		//Fetching key
		Assessments myassessments= assessmentRepository.findBy_id("Assessment001");
		List<Questions> questions=myassessments.getQuestions();
		Map<String,String> map=new HashMap<>();
		for( Questions question:questions)
		{	
			map.put(question.getQid(),question.getAnswer());
		}
		
		
		int marks=0;
		int correct=0;
		int inCorrect=0;
		List<Answer> examResponse=key.getAnswers();
		for (Answer submittedAnswer:examResponse  ) { 
            String qid =submittedAnswer.getQid();
  
            // Add some bonus marks 
            // to all the students and print it 
            String studentAnswer =submittedAnswer.getAnswer(); 
            String correctAnswer=map.get(qid);
            if(studentAnswer.equals(correctAnswer)) {
            	marks++;
            	correct++;
            }
            else
            {
            	inCorrect++;
            }
          }
		return new Score(marks,correct,inCorrect);
		
	}
	
//	public Map<String,String> getKey(String examId) 
//	{ 
//		Assessments myassessments= assessmentRepository.findBy_id(examId);
//		List<Questions> questions=myassessments.getQuestions();
//		Map<String,String> map=new HashMap<>();
//		for( Questions question:questions)
//		{	
//			map.put(question.getQid(),question.getAnswer());
//		}
//		return map;
//		
//	}
//	
	
	
	@RequestMapping(value = "/CreateExam", method = RequestMethod.POST) 
	public AssessmentResponse CreateExam(@RequestBody Assessments assessments) 
	{ 
		Assessments newAssessments=assessmentRepository.findBy_id(assessments.get_id());
		if(newAssessments==null) {
			/*
			 * newAssessments.set_id(as); students.set_id(students.get_id());
			 */
			assessmentRepository.save(assessments); 
		    return new AssessmentResponse(true, "Success");
		}
		else
		{
			return new AssessmentResponse(false, "ExamId already exists");
		}
	}
	
	
	

}
