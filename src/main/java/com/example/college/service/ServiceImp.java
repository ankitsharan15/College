package com.example.college.service;

import com.example.college.dao.CourseRepository;
import com.example.college.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImp implements Services {
	@Autowired
	CourseRepository course;

	@Override
	public Course show(Long courseId) {
		return course.findOne(courseId);

	}

	@Override
	public Course save(Course obj) {
		course.save(obj);
		return obj;
	}

	@Override
	public Course update(Course obj) {
		course.save(obj);
		return obj;
	}

	@Override
	public void delete(Long courseId) {
		course.delete(courseId);
	}


	/*@Override
	public Course save(Course obj) {
		course.save(obj);
		return obj;
	}

	@Override
	public Course update(Course obj) {
		course.save(obj);
		return obj;
	}

	@Override
	public void delete(Long courseId) {
		course.delete(courseId);
	}

	@Override
	public Course show(Long courseId) {
		return course.findOne(courseId);
	}*/

	

}
