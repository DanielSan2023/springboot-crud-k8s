package com.example.springbootcrudk8s.service;

import com.example.springbootcrudk8s.entity.Student;
import com.example.springbootcrudk8s.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    StudentRepository studentRepository;

    public Student createNewStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}