package com.springrest.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.springrest.rest.entities.Course;
import com.springrest.rest.repoitory.CourseDaoJPA;

@Service
public class CourseServiceByJPA implements CourseService {

	@Autowired // Automatic wire/dependency inject
	private CourseDaoJPA courseDao;

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}


	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	
	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}


	@Override
	public Course getCourse(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Course deleteCourseById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
//	public Course getCourse(int id) {
//		return courseDao.findById(id).orElse(new Course(HttpStatus.NOT_FOUND.value(),HttpStatus.NOT_FOUND.name(),HttpStatus.NOT_FOUND.name()));
//	}
//	public Course deleteCourseById(int id) {
//		Course course = getCourse(id);
//		if(course.getId()!=404) {
//			courseDao.deleteById(id);
//		}
//        return course;		
//	}

}
