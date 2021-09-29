package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	public StudentRepository StudentRepo;
	
	@GetMapping(value = "/insert")
	public ResponseEntity<?> getStudent(){
		Student n1 = new Student();
		n1.setName("Naveen");
		n1.setAge(23);
		n1.setGender('M');
		n1.setEmail("abc12@gmail.com");
		StudentRepo.save(n1);
		/*
		Student n2 = new Student();
		n2.setName("Jana");
		n2.setAge(22);
		n2.setGender('M');
		n2.setEmail("ahd67@gmail.com");
		
		Student n3 = new Student();
		n3.setName("raj");
		n3.setAge(23);
		n3.setGender('M');
		n3.setEmail("andh21@gmail.com");
		
		Object[] obj = { n1,n2,n3};
		*/
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Your value is stored");
		
	}
}