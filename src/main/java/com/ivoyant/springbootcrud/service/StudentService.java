package com.ivoyant.springbootcrud.service;

import com.ivoyant.springbootcrud.binding.Student;

import java.util.List;

public interface StudentService {
    public String upsert(Student student);
    public Student getById(Integer id);
    public List<Student> getAllStudents();
    public String deletById(Integer id);

}
