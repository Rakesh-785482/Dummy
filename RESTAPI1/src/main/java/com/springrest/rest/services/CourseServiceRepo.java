package com.springrest.rest.services;

import java.util.List;

import com.springrest.rest.entities.Course;

public interface CourseServiceRepo {

	public List<Course> getCourses();

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public Course getCourse(long id);

	void deleteCourse(long parseLong);

}
