package com.example.college.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="classroom")
public class Classroom implements Serializable{
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="building")
	String building;
	@Column(name="roomNumber")
	int roomNumber;
	@Column(name="roomCapacity")
	int roomCapacity;
	@Column(name="isDigitallyEnabled")
	int isDigitallyEnabled;
	

	public String getBuilding() {
		return building;
	}


	public void setBuilding(String building) {
		this.building = building;
	}


	public Integer getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}


	public Integer getRoomCapacity() {
		return roomCapacity;
	}


	public void setRoomCapacity(int roomCapacity) {
		this.roomCapacity = roomCapacity;
	}


	public int getIsDigitallyEnabled() {
		return isDigitallyEnabled;
	}


	public void setIsDigitallyEnabled(int isDigitallyEnabled) {
		this.isDigitallyEnabled = isDigitallyEnabled;
	}
	
	@Override
	public String toString() {
		return "Classroom [building=" + building + ", roomNumber=" + roomNumber + ", roomCapacity=" + roomCapacity
				+ ", isDigitallyEnabled=" + isDigitallyEnabled + "]";
	}
	
}