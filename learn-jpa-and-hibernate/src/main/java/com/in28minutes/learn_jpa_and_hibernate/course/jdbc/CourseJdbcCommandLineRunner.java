package com.in28minutes.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.in28minutes.learn_jpa_and_hibernate.course.Course;
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    private final CourseJdbcRepository courseJdbcRepository;


    @Autowired
    CourseJdbcCommandLineRunner(CourseJdbcRepository courseJdbcRepository) {
        this.courseJdbcRepository = courseJdbcRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1,"learn AWS2","in28minutes"));
        courseJdbcRepository.insert(new Course(2,"learn AWS3","in28minutes"));
        courseJdbcRepository.insert(new Course(3,"learn AWS4","in28minutes"));
        courseJdbcRepository.deleteById(2);

        System.out.println(courseJdbcRepository.selectById(1));


    }
}