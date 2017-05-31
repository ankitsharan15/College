package com.example.college.department.dao;
import org.springframework.data.repository.CrudRepository;
import com.example.college.department.entity.Department;

public interface DepartmentRepository extends CrudRepository<Department,String> {
	
}

