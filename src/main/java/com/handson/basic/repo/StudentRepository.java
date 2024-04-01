package com.handson.basic.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.handson.basic.model.Student;

public interface StudentRepository extends CrudRepository<Student,Long> {
    List<Student> findAllBySatScoreGreaterThan(Integer satScore);
}
