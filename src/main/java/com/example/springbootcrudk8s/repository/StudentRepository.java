package com.example.springbootcrudk8s.repository;

import com.example.springbootcrudk8s.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentRepository extends JpaRepository<Student,Long> {
}
