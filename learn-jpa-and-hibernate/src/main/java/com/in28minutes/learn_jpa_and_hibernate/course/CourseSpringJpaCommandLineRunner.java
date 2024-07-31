package com.in28minutes.learn_jpa_and_hibernate.course;

import com.in28minutes.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.learn_jpa_and_hibernate.course.springjpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseSpringJpaCommandLineRunner implements CommandLineRunner {
    private final CourseSpringDataJpaRepository repo;


    @Autowired
    CourseSpringJpaCommandLineRunner(CourseSpringDataJpaRepository springDataJpaRepository) {
        this.repo = springDataJpaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Course(1111L,"asd;ljkfa;lsdkjf","as;lkdjfal;skdjf"));
        repo.save(new Course(232423,"asd;ljkfa;lsdkjf","as;lkdjfal;skdjf"));
        repo.save(new Course(23452345,"asd;ljkfa;lsdkjf","as;lkdjfal;skdjf"));

        repo.deleteById(1111L);



        System.out.println(repo.findById(232423L).orElseThrow());
        System.out.println(repo.findByAuthor("in28minutes"));



    }
}