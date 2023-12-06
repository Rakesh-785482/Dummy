package com.springrest.rest.repoitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.rest.entities.Course;
                                        //Entity ClassName,Type of Primarykey/id
public interface CourseDaoJPA extends JpaRepository<Course, Integer> {
	                                          //Type of entity,Data Type
}
//JpaRepository  - it internally uses hibernate and jpa
//hibernate with jpa - it internally uses jdbc
