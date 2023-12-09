package com.spring.boot.learn.jpa.hibernate.backend.jdbc;

import com.spring.boot.learn.jpa.hibernate.backend.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CmdRunner implements CommandLineRunner {

    @Autowired
    private CouseJdbcRepo repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"C++","random channel"));
        repository.insert(new Course(2,"html","random channel"));
        repository.insert(new Course(3,"JavaScript","random channel"));
        repository.insert(new Course(4,"php","random channel"));
        repository.insert(new Course(5,"Java","random channel"));

        repository.delete(2);

        System.out.println(repository.select(5));
        System.out.println(repository.select(3));
    }
}
