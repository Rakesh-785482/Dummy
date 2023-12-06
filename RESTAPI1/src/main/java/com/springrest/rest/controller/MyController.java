package com.springrest.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.rest.entities.Course;
import com.springrest.rest.services.CourseService;
import com.springrest.rest.services.CourseServiceRepo;

@RestController   //----give this annotaion because we are working now on restAPI
public class MyController {

	@Autowired
//	private CourseService courseService;
	private CourseServiceRepo courseService;
	
	@GetMapping("/home")
	public String home() {     
		return "Welcome to courses application";
	}
	
	//GET - GET all courses
//	@RequestMapping(path="/courses",method=RequestMethod.GET)      - in spring MVC(we can write here also)
	@GetMapping("/courses")        
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	    
	//GET  - GET single course of given id in url
	@GetMapping("/courses/{courseId}") 
	public Course getCourses(@PathVariable String courseId){
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	//POST - Add new Courses
	@PostMapping("/courses")     
	public Course addCourse(@RequestBody Course course){
		return this.courseService.addCourse(course);
	}
	
	//PUT - UPDATE the course
	@PutMapping("/courses")
	public Course updateCourse(Course course){
		return this.courseService.updateCourse(course);
	}
	
	//DELETE - DELETE the course by id
	@DeleteMapping("/courses/{courseId}") //HttpRequest Error handle by HttpStatus
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
         try {
        	 this.courseService.deleteCourse(Long.parseLong(courseId));
        	 return new ResponseEntity<>(HttpStatus.OK);
         }catch(Exception e) {
        	 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
         }
	}
	
}
