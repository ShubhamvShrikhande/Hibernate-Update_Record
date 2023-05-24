package com.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@Column(name ="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="firstName")
	private String fisrtname;
	@Column(name = "lastName")
	private String lastname;
	@Column(name ="phoneNumber")
	private String phoneNumber;
	@Column(name="city")
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFisrtname() {
		return fisrtname;
	}
	public void setFisrtname(String fisrtname) {
		this.fisrtname = fisrtname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
