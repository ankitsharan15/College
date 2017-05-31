package com.example.college.controller;

import com.example.college.entity.Hostel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.college.service.HostelService;


@RestController
public class HostelController {

	
	@Autowired
	HostelService hostelService;
	
	@RequestMapping(value = "/save/{name}/{location}/{numOfRoom}/{type}", method = RequestMethod.GET)
	public String save(@PathVariable("name") String name, @PathVariable("location") String location, @PathVariable("numOfRoom") int numOfRoom,@PathVariable("type") String type){
		Hostel newObj = new Hostel();
		newObj.setHostelName(name);
		newObj.setLocation(location);
		newObj.setNumOfRooms(numOfRoom);
		newObj.setHostelType(type);
		
		hostelService.save(newObj);
		return "Saved :" + newObj.toString() ;
	}
	
	@RequestMapping(value = "/update/{name}/{location}/{numOfRoom}/{type}", method = RequestMethod.GET)
	public String update(@PathVariable("name") String name, @PathVariable("location") String location, @PathVariable("numOfRoom") int numOfRoom,@PathVariable("type") String type){
		Hostel newObj = new Hostel();
		newObj.setHostelName(name);
		newObj.setLocation(location);
		newObj.setNumOfRooms(numOfRoom);
		newObj.setHostelType(type);
		
		hostelService.update(newObj);
		return "Updated :" + newObj.toString() ;
	}
	
	@RequestMapping(value = "/delete/{name}/{location}/{numOfRoom}/{type}", method = RequestMethod.GET)
	public String delete(@PathVariable("name") String name, @PathVariable("location") String location, @PathVariable("numOfRoom") int numOfRoom,@PathVariable("type") String type){
		Hostel newObj = new Hostel();
		newObj.setHostelName(name);
		newObj.setLocation(location);
		newObj.setNumOfRooms(numOfRoom);
		newObj.setHostelType(type);
		
		hostelService.delete(newObj);
		return "deleted :" + newObj.toString() ;
	}
	
	@RequestMapping(value = "/get/{name}", method = RequestMethod.GET)
	public String get(@PathVariable("name") String name){
		
		
		Hostel obj=hostelService.get(name);
		return "Got :" + obj.toString() ;
	}
	
	
}
