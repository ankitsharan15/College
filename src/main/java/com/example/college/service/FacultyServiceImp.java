package com.example.college.service;

import com.example.college.dao.FacultyRepository;
import com.example.college.entity.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FacultyServiceImp implements FacultyService {

	@Autowired
	private FacultyRepository frp;
	@Override
	public void insertFaculty(Faculty obj) {
		// TODO Auto-generated method stub
		frp.save(obj);
	}

	@Override
	public void deleteFaculty(Faculty obj) {
		// TODO Auto-generated method stub
		
		frp.delete(obj);
	}

	@Override
	public void updateFaculty(Faculty obj) {
		// TODO Auto-generated method stub
		frp.save(obj);
	}

	@Override
	public Faculty getFaculty(Long obj) {
		// TODO Auto-generated method stub
		Faculty fp=frp.findOne(obj);
		
		return fp;
	}

}
