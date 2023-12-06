package com.springrest.rest.services;

import java.util.List;

import com.springrest.rest.entities.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public Course getCourse(int id);

	public Course deleteCourseById(int id);
}
