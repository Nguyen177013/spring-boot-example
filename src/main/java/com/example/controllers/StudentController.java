package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.StudentModel;

@RestController
public class StudentController {
	@GetMapping("/")
	public StudentModel getStudent() {
		return new StudentModel(1,"Phan Nguyen", "HCM");
	}
}
