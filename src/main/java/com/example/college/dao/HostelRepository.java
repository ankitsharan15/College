package com.example.college.dao;

//import jpa_example.entity.Department;
import org.springframework.data.repository.CrudRepository;

import com.example.college.entity.Hostel;


/**
* Created by ppatchava on 1/11/17.
*/
public interface HostelRepository extends CrudRepository<Hostel,String> {
}
