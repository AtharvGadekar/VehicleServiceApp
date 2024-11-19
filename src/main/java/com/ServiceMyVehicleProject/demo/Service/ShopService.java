package com.ServiceMyVehicleProject.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ServiceMyVehicleProject.demo.Dao.MechanicShopRepo;
import com.ServiceMyVehicleProject.demo.Entities.MechanicShop;

@Service
public class ShopService {
	
	@Autowired
	private MechanicShopRepo shopdao;
	
	public List<MechanicShop> getAllShops(){
		return shopdao.findAll();
	}
	
	public MechanicShop getShopById(long id) {
		return shopdao.findById(id).orElse(null);
	}
	
	public MechanicShop createShop(MechanicShop shop) {
		return shopdao.save(shop);
	}
	
	public MechanicShop updateShop(MechanicShop shop) {
		return shopdao.save(shop);
	}
	
	public Boolean deleteShopById(long id) {
		shopdao.deleteById(id);
		return true;
	}
}
