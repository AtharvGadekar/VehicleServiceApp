package com.ServiceMyVehicleProject.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ServiceMyVehicleProject.demo.Dao.MechanicShopRepo;
import com.ServiceMyVehicleProject.demo.Entities.MechanicShop;

@Service
public class MechanicShopService {
	
	@Autowired
	private MechanicShopRepo shopdao;
	
	@Autowired
	private ShopAddressService shopaddser;
	
	public List<MechanicShop> getAllShops(){
		return shopdao.findAll();
	}
	
	public MechanicShop getShopById(long id) {
		return shopdao.findById(id).orElse(null);
	}
	
	public MechanicShop createShop(MechanicShop shop) {
		shopaddser.createShopAddress(shop.getShopaddress());
		return shopdao.save(shop);
	}
	
	public MechanicShop updateShop(MechanicShop shop) {
		shopaddser.updateShopAddress(shop.getShopaddress());
		return shopdao.save(shop);
	}
	
	public Boolean deleteShopById(long id) {
		MechanicShop shop = shopdao.findById(id).orElse(null);
		if(shop==null) {
			return true;
		}else {
			shopdao.deleteById(id);
			shopaddser.deleteShopAddress(shop.getShopaddress().getSaid());
		}
		return true;
	}
}
