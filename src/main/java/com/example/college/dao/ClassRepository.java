package com.example.college.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.college.entity.Classroom;

@Repository
public interface ClassRepository extends CrudRepository<Classroom,String> {

}
