package com.ServiceMyVehicleProject.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long vid;
	
	private String vlicenseplate;
	
	private String vmodel;
	
	private String vmake;
	
	private long vyear;
	
	private String vin;

	public long getVid() {
		return vid;
	}

	public void setVid(long vid) {
		this.vid = vid;
	}

	public String getVlicenseplate() {
		return vlicenseplate;
	}

	public void setVlicenseplate(String vlicenseplate) {
		this.vlicenseplate = vlicenseplate;
	}

	public String getVmodel() {
		return vmodel;
	}

	public void setVmodel(String vmodel) {
		this.vmodel = vmodel;
	}

	public String getVmake() {
		return vmake;
	}

	public void setVmake(String vmake) {
		this.vmake = vmake;
	}

	public long getVyear() {
		return vyear;
	}

	public void setVyear(long vyear) {
		this.vyear = vyear;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vlicenseplate=" + vlicenseplate + ", vmodel=" + vmodel + ", vmake=" + vmake
				+ ", vyear=" + vyear + ", vin=" + vin + "]";
	}

	public Vehicle(long vid, String vlicenseplate, String vmodel, String vmake, long vyear, String vin) {
		super();
		this.vid = vid;
		this.vlicenseplate = vlicenseplate;
		this.vmodel = vmodel;
		this.vmake = vmake;
		this.vyear = vyear;
		this.vin = vin;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
