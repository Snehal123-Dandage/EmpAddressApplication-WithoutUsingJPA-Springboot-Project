package com.JDBC.EmpAddress.Entity;

public class Emp {
	
	private int empId;
	private String name;
	private String email;
	private Address address;


	public Emp(int empId, String name, String email, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.address = address;																											
	}

	public Emp() {
	}

	public int getId() {
		return empId;
	}
	public void setId(int id) {
		this.empId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	
}
