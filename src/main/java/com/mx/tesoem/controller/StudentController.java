package com.mx.tesoem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mx.tesoem.entity.Student;
import com.mx.tesoem.service.ServiceStudent;

@RestController
public class StudentController {
	
	@Autowired
	private ServiceStudent serviceStudent;
	
	@GetMapping("/listar")
	public List<Student> Listar() {
		return serviceStudent.findAll();
	}
	
	@GetMapping("/listar/{id}")
	public Student detalle(@PathVariable Long id) {
		return serviceStudent.findById(id);
	}
}
