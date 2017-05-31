package com.example.college.controller;

import com.example.college.dao.FacultyRepository;
import com.example.college.entity.Faculty;
import com.example.college.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class FacultyController {

	@Autowired
	FacultyService serv;
	@Autowired
	FacultyRepository frp;

	@RequestMapping(value = "/insertfaculty/{fname}/{lname}/{dep}/{des}/{nick}/{room}", method = RequestMethod.GET)
	public String insertfaculty(@PathVariable("fname") String fname, @PathVariable("lname") String lname,
			@PathVariable("dep") String dep, @PathVariable("des") String des, @PathVariable("nick") String nick,
			@PathVariable("room") int room) {

		Faculty stdnt = new Faculty();
		stdnt.setFirstName(fname);
		stdnt.setLastName(lname);
		stdnt.setDepartment(dep);
		stdnt.setDesignation(des);
		stdnt.setNickName(nick);
		stdnt.setRoomNo(room);

		serv.insertFaculty(stdnt);

		return "Inserted successfully";

	}
	@RequestMapping(value = "/deletefaculty/{id}", method = RequestMethod.GET)
	public String deletefaculty(@PathVariable("id") Long id) {

		Faculty fdp=frp.findOne(id);
		serv.deleteFaculty(fdp);

		return "Deleted successfully";

	}
	@RequestMapping(value = "/updatefaculty/{id}/{fname}/{lname}/{dep}/{des}/{nick}/{room}", method = RequestMethod.GET)
	public String updatefaculty(@PathVariable("id") Long id,@PathVariable("fname") String fname, @PathVariable("lname") String lname,
			@PathVariable("dep") String dep, @PathVariable("des") String des, @PathVariable("nick") String nick,
			@PathVariable("room") int room) {

		Faculty fp=frp.findOne(id);
		fp.setFirstName(fname);
		fp.setLastName(lname);
		fp.setDepartment(dep);
		fp.setDesignation(des);
		fp.setNickName(nick);
		fp.setRoomNo(room);

		serv.updateFaculty(fp);

		return "Updated successfully";

	}
	@RequestMapping(value = "/getfaculty/{id}", method = RequestMethod.GET)
	public Faculty getfaculty(@PathVariable("id") Long id) {

		
		Faculty fp=serv.getFaculty(id);
		
		return fp;

	}

}
