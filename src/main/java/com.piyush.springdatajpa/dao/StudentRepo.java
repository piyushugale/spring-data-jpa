package com.piyush.springdatajpa.dao;

import com.piyush.springdatajpa.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
