package com.ivoyant.springbootcrud.controller;

import com.ivoyant.springbootcrud.binding.Student;
import com.ivoyant.springbootcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentRestContoller {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public ResponseEntity<String> createStudent(@RequestBody Student student) {
        String status = studentService.upsert(student);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Integer id) {
        Student student = studentService.getById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/Students")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> allStudents = studentService.getAllStudents();
        return new ResponseEntity<>(allStudents, HttpStatus.OK);
    }

    @PutMapping("/student")
    public ResponseEntity<String> updateStudent(@RequestBody Student student) {
        String status = studentService.upsert(student);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        String status = studentService.deletById(id);
        return "Deleted Successfully";
    }
}
