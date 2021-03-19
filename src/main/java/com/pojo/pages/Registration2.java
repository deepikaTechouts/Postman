package com.pojo.pages;

import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SecondRegist")
public class Registration2 {
	@Column(unique = true, nullable = false)
	@Id
	private long phoneNo;
	@Column(nullable = false)
	private String fname;
	@Column(unique = true, nullable = false)
	private String lname;
	@Column(unique = true, nullable = false)
	private String email;
	private String dob;
	private String gender;

	@OneToOne
	private Registration1 registration1;

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Registration1 getRegistration1() {
		return registration1;
	}

	public void setRegistration1(Registration1 registration1) {
		this.registration1 = registration1;
	}

}
