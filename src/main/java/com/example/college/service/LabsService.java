package com.example.college.service;

import com.example.college.entity.Lab;

public interface LabsService {

	public void save(Lab lab);
	public void update(Lab lab);
	public void delete(Lab lab);
	public Lab get(String room_no);
	
}
