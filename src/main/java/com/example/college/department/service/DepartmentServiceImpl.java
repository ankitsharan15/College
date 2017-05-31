package com.example.college.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.college.department.dao.DepartmentRepository;
import com.example.college.department.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentrepository;
	
	@Override
	public Department getDepartment(String departmentname) {
		return departmentrepository.findOne(departmentname);
	}
	
	@Override
	public Department insertDepartment(Department department) {
		return departmentrepository.save(department);
	}

	@Override
	public Department updateDepartment(Department department) {
		return departmentrepository.save(department);
	}

	@Override
	public void deleteDepartment(String departmentname) {
		departmentrepository.delete(departmentname);
	}

	
}
