package com.example.college.service;
import com.example.college.entity.Project;

public interface ProjectService {
	Project save(Project project);

	Project get(String name);

	Project update(Project project);

	String delete(Project project);

}