package com.handson.basic.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handson.basic.model.Student;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public List<Student> getStudentWithSatHigherThan(Integer sat) {
        return repository.findAllBySatScoreGreaterThan(sat);
    }

    public Iterable<Student> all() {
        return repository.findAll();
    }

    @SuppressWarnings("null")
    public Optional<Student> findById(Long id) {
        return repository.findById(id);
    }

    @SuppressWarnings("null")
    public Student save(Student student) {
        return repository.save(student);
    }

    @SuppressWarnings("null")
    public void delete(Student student) {
        repository.delete(student);
    }

}