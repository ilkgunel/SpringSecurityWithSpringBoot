package com.ilkaygunel.pojo;

public class Member {
	public Member() {

	}

	public Member(String name, String surname, String city, String company,Address address) {
		this.name = name;
		this.surname = surname;
		this.city = city;
		this.company = company;
		this.address = address;
	}

	private String name;
	private String surname;
	private String city;
	private String company;
	private Address address;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

}
