package com.example.college.department.service;

import com.example.college.department.entity.*;


public interface DepartmentService {
	
	public Department getDepartment(String departmentname);
	
	public Department insertDepartment(Department department);
	
	public Department updateDepartment(Department department);
	
	public void deleteDepartment(String departmentname);

	
}
