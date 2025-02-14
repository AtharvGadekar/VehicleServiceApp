package com.ServiceMyVehicleProject.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ServiceMyVehicleProject.demo.Dao.MechanicShopRepo;
import com.ServiceMyVehicleProject.demo.Dao.ShopAddressRepo;
import com.ServiceMyVehicleProject.demo.Entities.MechanicShop;
import com.ServiceMyVehicleProject.demo.Entities.ShopAddress;

@Service
public class ShopAddressService {

	@Autowired
	private ShopAddressRepo shopadddao;
	
	@Autowired
	private MechanicShopRepo shopdao;
	
	public ShopAddress getShopAddressById(long id) {
		return shopadddao.findById(id).orElse(null);
	}
	
	public ShopAddress updateShopAddress(ShopAddress shop) {
		return shopadddao.save(shop);
	}
	
	public ShopAddress createShopAddress(ShopAddress shopadd) {
		MechanicShop shop = shopdao.findById(shopadd.getShop().getId()).orElse(null);
		shopadd.setShop(shop);
		return shopadddao.save(shopadd);
	}
	
	public Boolean deleteShopAddress(long id) {
		shopadddao.deleteById(id);
		return true;
	}
}
