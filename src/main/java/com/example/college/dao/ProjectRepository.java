package com.example.college.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.college.entity.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, String> {

}