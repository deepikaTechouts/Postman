package com.pojo.pages;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class RegistrationPojo {
@Id
	private BigInteger Aadharno;
	private String Fname;
	private String Lname;
	private String Dob;
	private String Email;
	private String Gender;
	private BigInteger PhoneNo;
	private String Address;
	private String State;
	private BigInteger Pincode;
	
	
	
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return Gender;
	}
	
	public BigInteger getAadharNo() {
		return Aadharno;
	}
	public void setAadharNo(BigInteger aadharno) {
		Aadharno = aadharno;
	}
	public BigInteger getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(BigInteger phoneNo) {
		PhoneNo = phoneNo;
	}
	public BigInteger getPincode() {
		return Pincode;
	}
	public void setPincode(BigInteger pincode) {
		Pincode = pincode;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	@Override
	public String toString() {
		return "RegistrationPojo [Aadharno=" + Aadharno + ", Fname=" + Fname + ", Lname=" + Lname + ", Dob=" + Dob
				+ ", Email=" + Email + ", Gender=" + Gender + ", PhoneNo=" + PhoneNo + ", Address=" + Address
				+ ", State=" + State + ", Pincode=" + Pincode + "]";
	}
	
	
	
	
	
	
}
