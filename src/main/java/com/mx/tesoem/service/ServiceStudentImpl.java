package com.mx.tesoem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.tesoem.dao.DaoStudent;
import com.mx.tesoem.entity.Student;

@Service
public class ServiceStudentImpl implements ServiceStudent {

	@Autowired
	private DaoStudent studentDao;

	@Override
	@Transactional(readOnly = true)
	public List<Student> findAll() {
		return (List<Student>)studentDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Student findById(Long id) {
		return studentDao.findById(id).orElse(null);
	}
}
