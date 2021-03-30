package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "laptopdetails")
public class Laptop {
	
	@Id
	private int lid;
	private String lname;
	
	@OneToOne(mappedBy = "laptop")
	private Student student;
    

	public Laptop(int lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
	}

	public Laptop() {
		super();
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", student=" + student + "]";
	}
	
	

}
