package com.example.college.service;

import com.example.college.entity.Lab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.college.dao.LabsRepository;

@Component
public class LabsServiceImpl implements LabsService{

	@Autowired
	private LabsRepository labrepo;
	
	@Override
	public void save(Lab lab) {
		// TODO Auto-generated method stub
		labrepo.save(lab);
	}

	@Override
	public void update(Lab lab) {
		// TODO Auto-generated method stub
		labrepo.save(lab);
	}

	@Override
	public void delete(Lab lab) {
		// TODO Auto-generated method stub
		labrepo.delete(lab);
	}

	@Override
	public Lab get(String room_no) {
		// TODO Auto-generated method stub
		return labrepo.findOne(room_no);
	}

	

}
