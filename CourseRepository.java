package com.example.tutoring.repositories;

import com.example.tutoring.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {}

