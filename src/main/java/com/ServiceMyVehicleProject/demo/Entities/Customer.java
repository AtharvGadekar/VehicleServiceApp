package com.ServiceMyVehicleProject.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cid;
	
	private String name;
	
	private long cmobno;
	
	private String email;
	
	private CustomerAddress caddress;

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCmobno() {
		return cmobno;
	}

	public void setCmobno(long cmobno) {
		this.cmobno = cmobno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CustomerAddress getCaddress() {
		return caddress;
	}

	public void setCaddress(CustomerAddress caddress) {
		this.caddress = caddress;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", cmobno=" + cmobno + ", email=" + email + ", caddress="
				+ caddress + "]";
	}

	public Customer(long cid, String name, long cmobno, String email, CustomerAddress caddress) {
		super();
		this.cid = cid;
		this.name = name;
		this.cmobno = cmobno;
		this.email = email;
		this.caddress = caddress;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
