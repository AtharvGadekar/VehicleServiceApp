package com.ServiceMyVehicleProject.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ServiceMyVehicleProject.demo.Entities.MechanicShop;
import com.ServiceMyVehicleProject.demo.Service.MechanicShopService;

@RestController
@CrossOrigin
@RequestMapping("/shop")
public class MechShopController {

	@Autowired
	private MechanicShopService mechshopser;
	
	@GetMapping()
	public List<MechanicShop> getAllShops(){
		return mechshopser.getAllShops();
	}
	
	@GetMapping("/{id}")
	public MechanicShop getShopById(@PathVariable("id") long id) {
		return mechshopser.getShopById(id);
	}
	
	@DeleteMapping("/{id}")
	public Boolean deleteShop(@PathVariable("id") long id) {
		return mechshopser.deleteShopById(id);
	}
	
	@PostMapping()
	public MechanicShop createShop(@RequestBody MechanicShop shop) {
		return mechshopser.createShop(shop);
	}
	
	@PutMapping()
	public MechanicShop updateShop(@RequestBody MechanicShop shop) {
		return mechshopser.updateShop(shop);
	}
}
