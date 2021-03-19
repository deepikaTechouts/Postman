package com.pojo.pages;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ThirdRegist")
public class Registration3 {
	
	@Column(nullable = false)
	private long pincode;
    @Column(nullable = false)
	private String address;
	@Column(nullable = false)
   private String state;
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	@OneToOne
	private Registration2 registration2;
	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	

	public String getAddress() {
		return address;
	}

	public Registration2 getRegistration2() {
		return registration2;
	}

	public void setRegistration2(Registration2 registration2) {
		this.registration2 = registration2;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

		
}
