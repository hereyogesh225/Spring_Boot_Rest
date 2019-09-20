package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Employee {
	private int id;
	private String name;
	private String surname;
	private String address;
	private String mobileNumber;

	public Employee()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Employee(int id, String name, String surname, String address, String mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}
	
	
	
	
}
