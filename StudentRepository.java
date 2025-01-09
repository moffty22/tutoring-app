package com.example.tutoring.repositories;

import com.example.tutoring.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {}

