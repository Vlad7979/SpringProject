package com.vladbadey.spring.springboot.spring_data_rest.dao;

import com.vladbadey.spring.springboot.spring_data_rest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    public Student findStudentByLogin(String login);
    public Student findStudentByPassword(String password);
}
