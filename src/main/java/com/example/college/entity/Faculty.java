package com.example.college.entity;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "faculty")
public class Faculty implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@Column(name = "firstname")
	String firstName;
	@Column(name = "lastname")
	String lastName;
	@Column(name = "nickname")
	String nickName;
	@Column(name = "designation")
	String designation;
	@Column(name = "department")
	String department;
	@Column(name = "roomno")
	int roomNo;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	@Override
	public String toString() {
		return "Faculty [firstName=" + firstName + ", lastName=" + lastName + ", nickName=" + nickName
				+ ", designation=" + designation + ", department=" + department + ", roomNo=" + roomNo + "]";
	}
	
	

		
	
}

