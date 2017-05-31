package com.example.college.service;

import com.example.college.entity.Student;

public interface StudentService {
    public void insertStudent(Student obj);
    public void deleteStudent(Student obj);
    public void updateStudent(Student obj);
    public Student getStudent(Long id);
}
