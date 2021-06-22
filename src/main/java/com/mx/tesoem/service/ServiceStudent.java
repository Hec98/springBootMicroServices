package com.mx.tesoem.service;

import java.util.List;

import com.mx.tesoem.entity.Student;

public interface ServiceStudent {

	public List<Student> findAll();
	public Student findById(Long id);
	
}
