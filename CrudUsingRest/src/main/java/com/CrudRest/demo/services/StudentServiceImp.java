package com.CrudRest.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudRest.demo.dao.StudentRepository;
import com.CrudRest.demo.model.Student;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentRepository sr;
	@Override
	public Student saveStudent(Student stud) {
		
		return (Student) sr.save(stud);
	}

}
