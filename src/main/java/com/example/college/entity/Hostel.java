package com.example.college.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Hostel")
public class Hostel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "hostelName")
	private String hostelName;
	@Column(name = "location")
	private String location;
	@Column(name = "numOfRooms")
	private int numOfRooms;
	@Column(name = "hostelType")
	private String hostelType;
	
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNumOfRooms() {
		return numOfRooms;
	}
	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}
	public String getHostelType() {
		return hostelType;
	}
	public void setHostelType(String hostelType) {
		this.hostelType = hostelType;
	}
	@Override
	public String toString() {
		return "Hostel [hostelName=" + hostelName + ", location=" + location + ", numOfRooms=" + numOfRooms
				+ ", hostelType=" + hostelType + "]";
	}
	
	
	
	
}
