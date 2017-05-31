package com.example.college.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.college.dao.StudentRepo;
import com.example.college.entity.Student;



@Service
public class StudentServiceImp implements StudentService{
	
	@Autowired
	private StudentRepo sr;

	@Override
	public void insertStudent(Student obj) {
		// TODO Auto-generated method stub
		sr.save(obj);
	}

	@Override
	public void deleteStudent(Student obj) {
		// TODO Auto-generated method stub
		sr.delete(obj);
	}

	@Override
	public void updateStudent(Student obj) {
		// TODO Auto-generated method stub
		sr.save(obj); 	
	}

	@Override
	public Student getStudent(Long id) {
		// TODO Auto-generated method stub
		return sr.findOne(id);
	}
	

}
