package com.springrest.rest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springrest.rest.entities.Course;

@Service
public class CourseServiceRepoImpl implements CourseServiceRepo {
	List<Course> list; // All data add in list
//in this project i am not use database for store the data for that purpose i am using list

	public CourseServiceRepoImpl() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
		list.add(new Course(145, "java Core Course", "this course contains"));
		list.add(new Course(146, "java Core Course", "this course contains"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c = null;
		for (Course course : list) {
			if ((course.getId() == courseId)) {
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

	public Course updateCourse(Course course) {
        list.forEach(e->{
        	if(e.getId()==course.getId()) {
        		e.setTitle(course.getTitle());
        		e.setDescription(course.getDescription());
        	}
        });
        return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
        list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	}
}
