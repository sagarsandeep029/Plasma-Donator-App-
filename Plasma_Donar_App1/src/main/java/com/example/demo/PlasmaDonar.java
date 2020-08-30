package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PlasmaDonar {
	@Id
	private String userid;
	private String fullname;
	private String bloodgroup;
	private String mobilenumber;
	private String country;
	private String state;
	private String district;
	private String city;
	private String emailid;
	private String password;
	
	public PlasmaDonar() {
		//default constructor.
	}
	
	
	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getBloodgroup() {
		return bloodgroup;
	}


	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}


	public String getMobilenumber() {
		return mobilenumber;
	}


	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public PlasmaDonar(String userid, String fullname, String bloodgroup, String mobilenumber, String country, String state,
			String district, String city, String emailid, String password) {
		super();
		this.fullname = fullname;
		this.bloodgroup = bloodgroup;
		this.mobilenumber = mobilenumber;
		this.country = country;
		this.state = state;
		this.district = district;
		this.city = city;
		this.emailid = emailid;
		this.userid = userid;
		this.password = password;
	}
	
}
