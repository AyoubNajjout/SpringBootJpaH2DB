package com.spring.boot.learn.jpa.hibernate.backend.repository;

import com.spring.boot.learn.jpa.hibernate.backend.Course;
import com.spring.boot.learn.jpa.hibernate.backend.spring.data.jpa.SpringDataJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JpaCmdRunner implements CommandLineRunner {

    @Autowired
    //private JpaRepositoryClass repository;
    private SpringDataJpa repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"C++","random channel"));
        repository.save(new Course(2,"html","random channel"));
        repository.save(new Course(3,"JavaScript","random channel"));
        repository.save(new Course(4,"php","random channel"));
        repository.save(new Course(5,"Java","random channel"));

        repository.deleteById(2l);

        System.out.println(repository.findById(5l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("random channel"));

    }
}
