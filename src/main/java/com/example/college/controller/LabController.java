package com.example.college.controller;

import com.example.college.entity.Lab;
import com.example.college.service.LabsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabController {

	@Autowired
	LabsService labsvc;

	@RequestMapping("/")
	public String index() {
		return "Greetings from College";
	}

	@RequestMapping("/Labs")
	public String labIndex() {
		return "Greetings from Labs";
	}

	@RequestMapping("/Labs/save/{roomNo}/{course}/{credits}/{equip}/{faculty}")
	public String save(@PathVariable("roomNo") String roomNo, @PathVariable("course") String course,
			@PathVariable("credits") String credits, @PathVariable("equip") String equip,
			@PathVariable("faculty") String faculty) {
		Lab lab = new Lab();;
		lab.setRoomNo(roomNo);
		lab.setCourse(course);
		lab.setCredits(Integer.parseInt(credits));
		lab.setEquipment(equip);
		lab.setFaculty(faculty);
		labsvc.save(lab);
		return "data saved" + lab.toString();
	}

	@RequestMapping("/Labs/update/{roomNo}/{course}/{credits}/{equip}/{faculty}")
	public String update(@PathVariable("roomNo") String roomNo, @PathVariable("course") String course,
			@PathVariable("credits") String credits, @PathVariable("equip") String equip,
			@PathVariable("faculty") String faculty) {
		Lab lab = new Lab();;
		lab.setRoomNo(roomNo);
		lab.setCourse(course);
		lab.setCredits(Integer.parseInt(credits));
		lab.setEquipment(equip);
		lab.setFaculty(faculty);
		labsvc.update(lab);
		return "data updated "+lab.toString();
	}

	@RequestMapping("/Labs/delete/{room_no}")
	public String delete(@PathVariable("room_no") String roomNo) {
		Lab lab;
		lab = labsvc.get(roomNo);
		labsvc.delete(lab);
		lab = labsvc.get(roomNo);
		return "Data deleted\n";
	}

	@RequestMapping("/Labs/get/{room_no}")
	public String get(@PathVariable("room_no") String roomNo) {
		Lab lab;
		lab = labsvc.get(roomNo);
		return lab.toString();
	}
}
