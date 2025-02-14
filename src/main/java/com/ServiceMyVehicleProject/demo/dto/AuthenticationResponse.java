package com.ServiceMyVehicleProject.demo.dto;

import com.ServiceMyVehicleProject.demo.Entities.Customer;

public class AuthenticationResponse {
	private final String jwt;
	
	private Customer customer;

	public AuthenticationResponse(String jwt,Customer customer) {
		this.jwt = jwt;
		this.customer=customer;
	}

	public String getJwtToken() {
		return this.jwt;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
}
