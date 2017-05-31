package com.example.college.service;

import com.example.college.entity.Course;

public interface Services {

	public Course show(Long courseId);

	public Course save(Course obj);

	public Course update(Course obj);

	public void  delete(Long courseId);

}