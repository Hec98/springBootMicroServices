package com.mx.tesoem.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.tesoem.entity.Student;

public interface DaoStudent extends CrudRepository<Student, Long> {

}
