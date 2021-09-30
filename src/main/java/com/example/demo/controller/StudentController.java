package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	public StudentRepository StudentRepo;
	
	@PostMapping(value = "/insert")
	public ResponseEntity<?> getStudent(@RequestBody final Student n1){
		StudentRepo.save(n1);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("insert successfully");
		
	}
	
	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAllStudents(){
		ArrayList<Student> students = (ArrayList<Student>) StudentRepo.findAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(students);
	}
}