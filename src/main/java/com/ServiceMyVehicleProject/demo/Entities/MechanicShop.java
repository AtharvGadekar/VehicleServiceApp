package com.ServiceMyVehicleProject.demo.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class MechanicShop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String shopname;
	
	private String shopdescription;
	
	@OneToOne(mappedBy = "shop")
	@JsonManagedReference
	private ShopAddress shopaddress;
	
	private long contactno;
	
	@OneToMany(mappedBy = "shop")
	@JsonManagedReference
	private List<Services> services;
	
	
	public String getShopdescription() {
		return shopdescription;
	}

	public void setShopdescription(String shopdescription) {
		this.shopdescription = shopdescription;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public ShopAddress getShopaddress() {
		return shopaddress;
	}

	public void setShopaddress(ShopAddress shopaddress) {
		this.shopaddress = shopaddress;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public List<Services> getServices() {
		return services;
	}

	public void setServices(List<Services> services) {
		this.services = services;
	}

	

	public MechanicShop(long id, String shopname, String shopdescription, ShopAddress shopaddress, long contactno,
			List<Services> services) {
		super();
		this.id = id;
		this.shopname = shopname;
		this.shopdescription = shopdescription;
		this.shopaddress = shopaddress;
		this.contactno = contactno;
		this.services = services;
	}

	@Override
	public String toString() {
		return "MechanicShop [id=" + id + ", shopname=" + shopname + ", shopdescription=" + shopdescription
				+ ", shopaddress=" + shopaddress + ", contactno=" + contactno + ", services=" + services + "]";
	}

	public MechanicShop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
