package com.example.college.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.college.department.entity.Department;
import com.example.college.department.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService departmentservice;
	
	@RequestMapping("/getdepartment/{name}")
    public String getDepartment(@PathVariable String name){
    	return departmentservice.getDepartment(name).toString();
    }
	
	@RequestMapping("/insertdepartment/{name}/{hod}")
    public String insertDepartment(@PathVariable String name, @PathVariable int hod)
	{
		Department department = new Department();
		department.setDeptname(name);
		department.setHodempid(hod);
    	return departmentservice.insertDepartment(department).toString();
    }
	
	@RequestMapping("/updatedepartment/{name}/{hod}")
    public String updateDepartment(@PathVariable String name, @PathVariable int hod)
	{
		Department department = new Department();
		department.setDeptname(name);
		department.setHodempid(hod);
    	return departmentservice.updateDepartment(department).toString();
    }

	@RequestMapping("/deletedepartment/{name}")
    public void deleteDepartment(@PathVariable String name){
    	departmentservice.deleteDepartment(name);
    }
}
