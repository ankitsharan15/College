package com.example.college.controller;

import com.example.college.entity.Course;
import com.example.college.service.Services;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CourseController {
		
			@Autowired
			Services service;
			
		    @RequestMapping("/course")
		    public String index() {
		        return "Course Section";
		    }
		    
		    @RequestMapping(value= "/getCourse/{courseId}")
		    public Course getCourse(@PathVariable Long courseId){
		    	
		    	Course obj = service.show(courseId);
				return obj;  	
		    }
		    
		    @RequestMapping(value= "/saveCourse/{courseId}/{courseName}/{credits}/{department}/{faculty}")
		    public Course saveCourset( @PathVariable Long courseId, @PathVariable String courseName,
									   @PathVariable int credits,@PathVariable String department, @PathVariable String faculty){
		    	Course course = new Course();
		    	course.setCourseId(courseId);
		    	course.setCourseName(courseName);
		    	course.setCredits(credits);
		    	course.setDepartment(department);
		    	course.setFaculty(faculty);
		    	service.save(course);
				return course;  	
		    }
		    
		    @RequestMapping(value= "/deleteCourse/{courseId}")
		    public void deleteCourse( @PathVariable Long courseId){
		    	
		    	
		    	service.delete(courseId);
				
		    }
		    
		    @RequestMapping(value= "/updateCourse/{courseId}/{courseName}/{credits}/{department}/{faculty}")
		    public Course updateCourse(@PathVariable Long courseId, @PathVariable String courseName,
									   @PathVariable int credits,@PathVariable String department, @PathVariable String faculty){
		    	Course cr=new Course();
		    	cr.setCourseId(courseId);
		    	cr.setCourseName(courseName);
		    	cr.setCredits(credits);
		    	cr.setDepartment(department);
		    	cr.setFaculty(faculty);
		    	service.save(cr);
				return cr;  	
		    }
		}
