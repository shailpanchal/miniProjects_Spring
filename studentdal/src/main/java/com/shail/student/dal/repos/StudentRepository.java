package com.shail.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.shail.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	
}
