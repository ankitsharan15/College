package com.example.college.entity;

import java.io.Serializable;
 
import javax.persistence.*;

@Entity
@Table(name = "student_data")
public class Student implements Serializable{
    
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name="id")
	    private int id;
	    @Column(name = "name")
	    private String name;
	    @Column(name = "hostel")
	    private String hostel;
	    @Column(name="course")
	    private String course;
	    @Column(name="gender")
	    private String gender;
	    @Column(name="college")
        private String college;  
	    @Column(name="city")
	    private String city;
	    
	    public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getCollege() {
			return college;
		}

		public void setCollege(String college) {
			this.college = college;
		}

		 
    
	  
	public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void setHostel(String hostel) {
			this.hostel = hostel;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHostel() {
		return hostel;
	}

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", hostel=" + hostel + ", course=" + course + ", gender="
				+ gender + ", college=" + college + ", city=" + city + "]";
	}
	
}
