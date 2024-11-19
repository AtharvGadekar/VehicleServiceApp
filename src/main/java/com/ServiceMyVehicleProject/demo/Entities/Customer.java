package com.ServiceMyVehicleProject.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cid;
	
	private String cname;
	
	private Long cmobno;
	
	private String cemail;
	
	@OneToOne
	private CustomerAddress caddress;

	
	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getName() {
		return cname;
	}

	public void setName(String name) {
		this.cname = name;
	}

	public long getCmobno() {
		return cmobno;
	}

	public void setCmobno(long cmobno) {
		this.cmobno = cmobno;
	}

	public String getEmail() {
		return cemail;
	}

	public void setEmail(String email) {
		this.cemail = email;
	}

	public CustomerAddress getCaddress() {
		return caddress;
	}

	public void setCaddress(CustomerAddress caddress) {
		this.caddress = caddress;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + cname + ", cmobno=" + cmobno + ", email=" + cemail + ", caddress="
				+ caddress + "]";
	}

	public Customer(long cid, String name, long cmobno, String email, CustomerAddress caddress) {
		super();
		this.cid = cid;
		this.cname = name;
		this.cmobno = cmobno;
		this.cemail = email;
		this.caddress = caddress;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
