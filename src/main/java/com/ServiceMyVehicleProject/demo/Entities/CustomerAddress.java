package com.ServiceMyVehicleProject.demo.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class CustomerAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String address;
	
	private String areaname;
	
	private String city;
	
	private long pincode;
	
	@OneToOne()
	@JsonBackReference
	@JoinColumn(nullable = false)
	private Customer customer;
	
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

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


	public CustomerAddress(long id, String address, String areaname, String city, long pincode, Customer customer) {
		super();
		this.id = id;
		this.address = address;
		this.areaname = areaname;
		this.city = city;
		this.pincode = pincode;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "CustomerAddress [id=" + id + ", address=" + address + ", areaname=" + areaname + ", city=" + city
				+ ", pincode=" + pincode + ", customer=" + customer + "]";
	}

	public CustomerAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
