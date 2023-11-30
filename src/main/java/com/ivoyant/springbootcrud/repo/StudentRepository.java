package com.ivoyant.springbootcrud.repo;

import com.ivoyant.springbootcrud.binding.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
