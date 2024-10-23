package com.ServiceMyVehicleProject.demo.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long aid;
	
	private Customer customer;
	
	private MechanicShop shop;
	
	private Vehicle vehicle;
	
	private List<Service> services;
	
	private String dateAndTime;

	public long getAid() {
		return aid;
	}

	public void setAid(long aid) {
		this.aid = aid;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public MechanicShop getShop() {
		return shop;
	}

	public void setShop(MechanicShop shop) {
		this.shop = shop;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public String getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	@Override
	public String toString() {
		return "Appointment [aid=" + aid + ", customer=" + customer + ", shop=" + shop + ", vehicle=" + vehicle
				+ ", services=" + services + ", dateAndTime=" + dateAndTime + "]";
	}

	public Appointment(long aid, Customer customer, MechanicShop shop, Vehicle vehicle, List<Service> services,
			String dateAndTime) {
		super();
		this.aid = aid;
		this.customer = customer;
		this.shop = shop;
		this.vehicle = vehicle;
		this.services = services;
		this.dateAndTime = dateAndTime;
	}

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
