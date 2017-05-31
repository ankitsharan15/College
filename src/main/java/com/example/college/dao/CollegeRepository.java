package com.example.college.dao;

import com.example.college.entity.College;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gaurav on 29/05/17.
 */
public interface CollegeRepository extends CrudRepository<College, String> {
}
