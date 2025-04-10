package com.CrudRest.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CrudRest.demo.model.Student;
import com.CrudRest.demo.services.StudentService;
// this is student controller
@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	public StudentService s_service;
	
	@PostMapping("/save")
	public ResponseEntity<Student> addStudent(@RequestBody Student std)
	{
		Student std1 =  s_service.saveStudent(std);
		return ResponseEntity.ok().body(std1);
		
		
	}
}
