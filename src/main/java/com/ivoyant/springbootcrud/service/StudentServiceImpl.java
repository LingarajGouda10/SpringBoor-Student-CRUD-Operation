package com.ivoyant.springbootcrud.service;

import com.ivoyant.springbootcrud.binding.Student;
import com.ivoyant.springbootcrud.repo.StudentRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepo;
    @Override
    public String upsert(Student student) {
        studentRepo.save(student);
        return "sucess";
    }

    @Override
    public Student getById(Integer id) {
        Optional<Student> byId = studentRepo.findById(id);
        if (byId.isPresent()){
            return byId.get();
        }

        return null;
    }

    @Override
    public List<Student> getAllStudents() {
       return studentRepo.findAll();

    }

    @Override
    public String deletById(Integer id) {
        if (studentRepo.existsById(id)){
            studentRepo.deleteById(id);
            return "Successfully Deleted";
        }else{
            return "No Records Found";
        }

    }
}
