package com.ServiceMyVehicleProject.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Service {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long sid;
	
	private String sname;
	
	private String sdescription;
	
	private String scost;
	
	@ManyToOne()
	private MechanicShop shop;

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSdescription() {
		return sdescription;
	}

	public void setSdescription(String sdescription) {
		this.sdescription = sdescription;
	}

	public String getScost() {
		return scost;
	}

	public void setScost(String scost) {
		this.scost = scost;
	}

	public MechanicShop getShop() {
		return shop;
	}

	public void setShop(MechanicShop shop) {
		this.shop = shop;
	}

	@Override
	public String toString() {
		return "Service [sid=" + sid + ", sname=" + sname + ", sdescription=" + sdescription + ", scost=" + scost
				+ ", shop=" + shop + "]";
	}

	public Service(long sid, String sname, String sdescription, String scost, MechanicShop shop) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sdescription = sdescription;
		this.scost = scost;
		this.shop = shop;
	}

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
