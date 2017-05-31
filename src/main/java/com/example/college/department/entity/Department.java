package com.example.college.department.entity;
import javax.persistence.*;

@Entity
@Table(name = "DEPARTMENT")
public class Department {

	@Id
	@Column(name = "deptname")
	private String deptname;
	@Column(name = "hod")
	private int hodempid;
	
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public int getHodempid() {
		return hodempid;
	}
	public void setHodempid(int hodempid) {
		this.hodempid = hodempid;
	}
	@Override
	public String toString() {
		return "Department [deptname=" + deptname + ", hodempid=" + hodempid + "]";
	}

	
}
	
	
	
	

