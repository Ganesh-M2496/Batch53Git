package com.CrudRest.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CrudRest.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
