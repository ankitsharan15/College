package com.example.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.college.entity.Classroom;


import com.example.college.service.ClassServiceInterface;

@RestController
public class ClassController {

	@Autowired
	ClassServiceInterface classsvc;
	


	@RequestMapping("/Class/save/{building}/{roomNumber}/{roomCapacity}/{isDigitallyEnabled}")
    public String saveClass(@PathVariable("building") String building,@PathVariable("roomNumber") int roomNumber,@PathVariable("roomCapacity") int roomCapacity,@PathVariable("isDigitallyEnabled") int isDigitallyEnabled){
        Classroom classroom = new Classroom();
        classroom.setBuilding(building);
        classroom.setRoomNumber(roomNumber);
        classroom.setRoomCapacity(roomCapacity);
        classroom.setIsDigitallyEnabled(isDigitallyEnabled);
        classsvc.insertClass(classroom);
        return "data saved";
    }	
	
	@RequestMapping("/Class/update/{building}/{roomNumber}/{roomCapacity}/{isDigitallyEnabled}")
    public String updateClass(@PathVariable("building") String building,@PathVariable("roomNumber") int roomNumber,@PathVariable("roomCapacity") int roomCapacity,@PathVariable("isDigitallyEnabled") int isDigitallyEnabled){
        Classroom classroom = new Classroom();
        classroom.setBuilding(building);
        classroom.setRoomNumber(roomNumber);
        classroom.setRoomCapacity(roomCapacity);
        classroom.setIsDigitallyEnabled(isDigitallyEnabled);
        classsvc.updateClass(classroom);
        return "data updated";
    }	
	
	@RequestMapping("/Class/delete/{building}/{roomNumber}")
    public String deleteClass(@PathVariable("building") String building,@PathVariable("roomNumber") int roomNumber){
        Classroom classroom = new Classroom();
        classroom.getBuilding();
        classroom.getRoomNumber();
        classsvc.deleteClass(classroom);
        return "data deleted";
    }	
	
	
}
