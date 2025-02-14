package com.ServiceMyVehicleProject.demo.Entities;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Customer{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cid;
	
	private String cname;
	
	private Long cmobno;
	
	private String cemail;
	 
	private String cpassword;
	
	@JsonManagedReference
	@OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
	private CustomerAddress caddress;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	public List<Vehicle> vehicle;

	
	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

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
	

	public Customer(Long cid, String cname, Long cmobno, String cemail, String cpassword, CustomerAddress caddress,
			List<Vehicle> vehicle) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cmobno = cmobno;
		this.cemail = cemail;
		this.cpassword = cpassword;
		this.caddress = caddress;
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cmobno=" + cmobno + ", cemail=" + cemail
				+ ", cpassword=" + cpassword + ", caddress=" + caddress + ", vehicle=" + vehicle + "]";
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
