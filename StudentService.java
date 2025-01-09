package com.example.tutoring.services;

import com.example.tutoring.models.Student;
import com.example.tutoring.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void registerStudent(Student student) {
        studentRepository.save(student);
    }
}

