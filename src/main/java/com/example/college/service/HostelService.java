package com.example.college.service;

import com.example.college.entity.Hostel;

public interface HostelService {
	 Hostel save(Hostel lab);
	 Hostel get(String name);
	 Hostel update(Hostel lab);
	 String delete(Hostel lab);
}
