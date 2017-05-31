package com.example.college.controller;

import com.example.college.dao.CollegeRepository;
import com.example.college.entity.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaurav on 29/05/17.
 */

@RestController
public class CollegeController {

    @Autowired
    CollegeRepository collegeRepository;

    @RequestMapping (value = "/insertcollege/{name}/{location}/{websiteurl}/{description}/{director}/{affiliationcode}")
    public College save(@PathVariable String name, @PathVariable String location, @PathVariable String websiteurl,
                        @PathVariable String description, @PathVariable String director, @PathVariable String affiliationcode){
        College college = new College(name,location,websiteurl,description,director,affiliationcode);
        return collegeRepository.save(college);
    }

    @RequestMapping (value = "/updatecollege/{name}/{location}/{websiteurl}/{description}/{director}/{affiliationcode}")
    public College update(@PathVariable String name, @PathVariable String location, @PathVariable String websiteurl,
                          @PathVariable String description,@PathVariable String director, @PathVariable String affiliationcode){
        College college = new College(name,location,websiteurl,description,director,affiliationcode);
        return collegeRepository.save(college);
    }

    @RequestMapping (value = "/getcollege/{name}")
    public College get(@PathVariable String name){
        return collegeRepository.findOne(name);
    }

    @RequestMapping (value = "/deletecollege/{name}/{location}/{websiteurl}/{description}/{director}/{affiliationcode}")
    public void delete(@PathVariable String name, @PathVariable String location, @PathVariable String websiteurl,
                       @PathVariable String description, @PathVariable String director, @PathVariable String affiliationcode){
        College college = new College(name,location,websiteurl,description,director,affiliationcode);
        collegeRepository.delete(college);
    }
}
