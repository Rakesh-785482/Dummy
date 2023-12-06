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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.rest.entities.Course;
import com.springrest.rest.services.CourseServiceByJPA;

//@RestController   //----give this annotaion because we are working now on restAPI
public class MyControllerJPA {

	@Autowired
	private CourseServiceByJPA courseService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to courses For Your application";
	}
	
	//GET - GET request all courses
	@GetMapping("/courses")        
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	
	//POST - POST request Add new Courses
	@PostMapping("/courses")     
	public Course addCourse(@RequestBody Course course){
		return this.courseService.addCourse(course);
	}
	
	//PUT - UPDATE request the course
	@PutMapping("/courses")   //http://localhost:8080/courses
	public Course updateCourse(@RequestBody Course course){
		return this.courseService.updateCourse(course);
	}
	
	//GET - GET request single Courses
	@GetMapping("/courses/{id}")  //http://localhost:8080/courses/13
	public @ResponseBody Course getCustomerDataById(@PathVariable int id) {
		return this.courseService.getCourse(id);
	}
	
	//DELETE - DELETE request course by id
	@DeleteMapping("/courses")  //http://localhost:8080/courses/?id=13
	public @ResponseBody Course deleteCustomerDataById(@RequestParam("id") int id) {
		return courseService.deleteCourseById(id);
	}
	
}
