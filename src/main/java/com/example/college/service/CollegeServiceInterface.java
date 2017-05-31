package com.example.college.service;

import com.example.college.entity.College;

/**
 * Created by gaurav on 29/05/17.
 */
public interface CollegeServiceInterface {
    public College save(College college);
    public College update(College college);
    public void delete(String collge_name);
    public College get(String college_name);

}
