package com.spring.boot.learn.jpa.hibernate.backend.repository;

import com.spring.boot.learn.jpa.hibernate.backend.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class JpaRepositoryClass {
    @PersistenceContext
    private EntityManager entitymanager;

    public void insert(Course course){
        entitymanager.merge(course);
    }

    public Course select(long id){
        return entitymanager.find(Course.class,id);
    }

    public void delete(long id){
        Course course = entitymanager.find(Course.class,id);
        entitymanager.remove(course);
    }

}
