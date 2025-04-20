package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Student;

public interface studentRepository extends JpaRepository<Student,Long>{

}
