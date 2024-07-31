package com.in28minutes.learn_jpa_and_hibernate.course;

import com.in28minutes.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    private final CourseJpaRepository repo;


    @Autowired
    CourseCommandLineRunner(CourseJpaRepository courseJpaRepository) {
        this.repo = courseJpaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        repo.insert(new Course(111,"abc","def"));
        repo.insert(new Course(222,"abc","def"));

        repo.deleteById(111L);

        System.out.println(repo.findById(222L));



    }
}