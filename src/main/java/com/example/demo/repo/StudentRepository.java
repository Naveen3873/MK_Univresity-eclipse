package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
