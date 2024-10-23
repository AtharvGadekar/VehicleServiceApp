package com.ServiceMyVehicleProject.demo.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class MechanicShop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String shopname;
	
	private ShopAddress shopaddress;
	
	private long contactno;
	
	@OneToMany(mappedBy = "shop")
	private List<Service> services;

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

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	@Override
	public String toString() {
		return "MechanicShop [id=" + id + ", shopname=" + shopname + ", shopaddress=" + shopaddress + ", contactno="
				+ contactno + ", services=" + services + "]";
	}

	public MechanicShop(long id, String shopname, ShopAddress shopaddress, long contactno, List<Service> services) {
		super();
		this.id = id;
		this.shopname = shopname;
		this.shopaddress = shopaddress;
		this.contactno = contactno;
		this.services = services;
	}

	public MechanicShop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
