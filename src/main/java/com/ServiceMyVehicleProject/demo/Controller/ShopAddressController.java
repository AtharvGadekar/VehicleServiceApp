package com.ServiceMyVehicleProject.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ServiceMyVehicleProject.demo.Entities.ShopAddress;
import com.ServiceMyVehicleProject.demo.Service.ShopAddressService;

@RestController
@RequestMapping("/shopaddress")
public class ShopAddressController {
	
	@Autowired
	private ShopAddressService shopaddser;
	
	@GetMapping("/{id}")
	public ShopAddress getShopAddressById(@PathVariable("id") long id) {
		return shopaddser.getShopAddressById(id);
	}
	
	@DeleteMapping("/{id}")
	public Boolean deleteShopAddressById(@PathVariable("id") long id) {
		return shopaddser.deleteShopAddress(id);
	}
	
	@PutMapping()
	public ShopAddress updateShopAddress(@RequestBody ShopAddress shopadd) {
		return shopaddser.updateShopAddress(shopadd);
	}
	
	@PostMapping()
	public ShopAddress createShopAddress(@RequestBody ShopAddress shopadd) {
		return shopaddser.createShopAddress(shopadd);
	}
}
