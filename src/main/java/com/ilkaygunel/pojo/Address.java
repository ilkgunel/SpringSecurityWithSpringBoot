package com.ilkaygunel.pojo;

public class Address {
	
	public Address(){
		
	}
	
	public Address(String neighborhood,String borough,String country){
		this.neighborhood = neighborhood;
		this.borough = borough;
		this.country = country;
	}
	
	private String neighborhood;
	private String borough;
	private String country;

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getBorough() {
		return borough;
	}

	public void setBorough(String borough) {
		this.borough = borough;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
