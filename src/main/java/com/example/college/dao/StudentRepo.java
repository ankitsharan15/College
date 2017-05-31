package com.example.college.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.college.entity.Student;

public interface StudentRepo extends CrudRepository<Student, Long> {

}
