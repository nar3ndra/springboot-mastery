package com.in28minutes.learn_jpa_and_hibernate.course.jpa;

import com.in28minutes.learn_jpa_and_hibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager em;

    public void insert(final Course course) {
        em.merge(course);
    }

    public Course findById(final Long id) {
        return em.find(Course.class, id);
    }

    public void deleteById(final Long id) {
        em.remove(em.find(Course.class, id));
    }
}
