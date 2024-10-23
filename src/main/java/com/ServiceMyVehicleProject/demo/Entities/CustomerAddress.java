package com.ServiceMyVehicleProject.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CustomerAddress {
	@Id
	private long id;
	
	private String address;
	
	private String areaname;
	
	private String city;
	
	private long pincode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAreaname() {
		return areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "CustomerAddress [id=" + id + ", address=" + address + ", areaname=" + areaname + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}

	public CustomerAddress(long id, String address, String areaname, String city, long pincode) {
		super();
		this.id = id;
		this.address = address;
		this.areaname = areaname;
		this.city = city;
		this.pincode = pincode;
	}

	public CustomerAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}