package com.ServiceMyVehicleProject.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShopAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long said;
	
	private String shopAddress;
	
	private String city;
	
	private long pincode;

	public long getSaid() {
		return said;
	}

	public void setSaid(long said) {
		this.said = said;
	}

	public String getShopAddress() {
		return shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
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
		return "ShopAddress [said=" + said + ", shopAddress=" + shopAddress + ", city=" + city + ", pincode=" + pincode
				+ "]";
	}

	public ShopAddress(long said, String shopAddress, String city, long pincode) {
		super();
		this.said = said;
		this.shopAddress = shopAddress;
		this.city = city;
		this.pincode = pincode;
	}

	public ShopAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
