package com.example.college.service;


import com.example.college.entity.Faculty;

public interface FacultyService {
	public void insertFaculty(Faculty obj);
	public void deleteFaculty(Faculty obj);
	public void updateFaculty(Faculty obj);
	public Faculty getFaculty(Long obj);
}
