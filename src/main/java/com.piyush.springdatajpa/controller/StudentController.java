package com.piyush.springdatajpa.controller;

import com.piyush.springdatajpa.service.StudentService;
import com.piyush.springdatajpa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")

public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
    @GetMapping("/read/{id}")
    public Student readStudent(@PathVariable Integer id) {
        return studentService.readStudent(id);
    }
    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudent(id);
    }

//    -- Multiple path variables
//    @GetMapping("/api/employees/{id}/{name}")
//    @ResponseBody
//    public String getEmployeesByIdAndName(@PathVariable String id, @PathVariable String name) {
//        return "ID: " + id + ", name: " + name;
//    }

}