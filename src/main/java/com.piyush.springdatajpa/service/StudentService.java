package com.piyush.springdatajpa.service;

import com.piyush.springdatajpa.dao.StudentRepo;
import com.piyush.springdatajpa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }
    public Student readStudent(Integer id) {
        return studentRepo.findById(id).get();
    }
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }
    public void deleteStudent(Integer id) {
        System.out.println(id + "is deleted sucessfully");
        studentRepo.deleteById(id);
    }

}