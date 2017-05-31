package com.example.college.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "labs")
public class Lab implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "room_no")
	private String roomNo;
	@Column(name = "credits")
	private int credits;
	@Column(name = "faculty")
	private String faculty;
	@Column(name = "equipment")
	private String equipment;
	@Column(name = "course")
	private String course;
	
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getEquipment() {
		return equipment;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Labs [room_no=" + roomNo + ", credits=" + credits + ", faculty=" + faculty + ", equipment=" + equipment
				+ ", course=" + course + "]";
	}
	
	
	

	
	
}