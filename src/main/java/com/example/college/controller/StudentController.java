package com.example.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.college.entity.Student;
import com.example.college.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService sr;
	
	@RequestMapping("/greeting")
	public String greeting(){
		return "Hii";
	}
	
	  @RequestMapping(value = "/insertStudent/{name}/{hostel}/{course}/{college}/{gender}/{city}", method = RequestMethod.GET)
	    public String insertStudent (@PathVariable("name") String name, @PathVariable("hostel") String hostel,
	            @PathVariable("course") String course, @PathVariable("college") String college, @PathVariable("gender") String gender,
	            @PathVariable("city") String city) {

	         Student st=new Student();
	         st.setName(name);
	         st.setHostel(hostel);
	         st.setCourse(course);
	         st.setCollege(college);
	         st.setCollege(college);
	         st.setGender(gender);
	         st.setCity(city);
	         sr.insertStudent(st);
	        return "Inserted successfully";

	    }
	  @RequestMapping(value = "/updateStudent/{name}/{hostel}/{course}/{college}/{gender}/{city}", method = RequestMethod.GET)
	    public String updateStudent(@PathVariable("name") String name, @PathVariable("hostel") String hostel,
	            @PathVariable("course") String course, @PathVariable("college") String college, @PathVariable("gender") String gender,
	            @PathVariable("city") String city) {

	         Student st=new Student();
	         st.setName(name);
	         st.setHostel(hostel);
	         st.setCourse(course);
	         st.setCollege(college);
	         st.setCollege(college);
	         st.setGender(gender);
	         st.setCity(city);
	         sr.updateStudent(st);
	        return "updated successfully";

	    }
	  
	  @RequestMapping(value = "/deleteStudent/{name}/{hostel}/{course}/{college}/{gender}/{city}", method = RequestMethod.GET)
	    public String deleteStudent(@PathVariable("name") String name, @PathVariable("hostel") String hostel,
	            @PathVariable("course") String course, @PathVariable("college") String college, @PathVariable("gender") String gender,
	            @PathVariable("city") String city) {

	         Student st=new Student();
	         st.setName(name);
	         st.setHostel(hostel);
	         st.setCourse(course);
	         st.setCollege(college);
	         st.setCollege(college);
	         st.setGender(gender);
	         st.setCity(city);
	         sr.deleteStudent(st);
	        return "deleted successfully";

	    }
	  
	  @RequestMapping(value = "/getStudent/{name}", method = RequestMethod.GET)
	    public String getStudent(@PathVariable("name") Long key) {
	         Student obj= sr.getStudent(key);
	        return obj.toString();

	    }
}


