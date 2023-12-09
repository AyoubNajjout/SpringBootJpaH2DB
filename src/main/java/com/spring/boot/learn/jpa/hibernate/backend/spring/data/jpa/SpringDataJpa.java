package com.spring.boot.learn.jpa.hibernate.backend.spring.data.jpa;

import com.spring.boot.learn.jpa.hibernate.backend.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringDataJpa extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author);

}
