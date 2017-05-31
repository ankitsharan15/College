package com.example.college.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;


import com.example.college.dao.HostelRepository;

import com.example.college.entity.Hostel;


@Component
public class HostelServiceImp implements HostelService{

	@Autowired
	HostelRepository labObj;
	@Override
	public Hostel save(Hostel lab) {
		// TODO Auto-generated method stub
		labObj.save(lab);
		return lab;
	}

	@Override
	public Hostel get(String name) {
		// TODO Auto-generated method stub
		Hostel fetch=labObj.findOne(name);
		return fetch;
	}

	@Override
	public Hostel update(Hostel lab) {
		// TODO Auto-generated method stub
		
		return labObj.save(lab);
	}

	@Override
	public String delete(Hostel lab) {
		// TODO Auto-generated method stub
		labObj.delete(lab);
		return "Deleted";
	}

}
