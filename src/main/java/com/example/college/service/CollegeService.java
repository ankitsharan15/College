package com.example.college.service;

import com.example.college.dao.CollegeRepository;
import com.example.college.entity.College;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by gaurav on 29/05/17.
 */

public class CollegeService implements CollegeServiceInterface {

    @Autowired
    CollegeRepository collegeRepository;

    @Override
    public College save(College college) {
        return collegeRepository.save(college);
    }

    @Override
    public College update(College college) {
        return collegeRepository.save(college);
    }

    @Override
    public void delete(String collge_name) {
        collegeRepository.delete(collge_name);
    }

    @Override
    public College get(String college_name) {
        return collegeRepository.findOne(college_name);
    }
}
