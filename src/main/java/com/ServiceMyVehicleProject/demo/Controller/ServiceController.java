package com.ServiceMyVehicleProject.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ServiceMyVehicleProject.demo.Entities.Services;
import com.ServiceMyVehicleProject.demo.Service.ServicesService;

@RestController
@RequestMapping("/service")
public class ServiceController {

	@Autowired
	private ServicesService serviceser;
	
	@GetMapping("/{id}")
	public List<Services> getServicesByShopId(@PathVariable("id") long id){
		return serviceser.getServicesByShopId(id);
	}
	
	
	@GetMapping()
	public List<Services> getAllServices(){
		return serviceser.getAllServices();
	}
	
	@PostMapping()
	public Services createService(@RequestBody Services ser) {
		return serviceser.createService(ser);
	}
	
	@PutMapping("/{shopid}/{serviceid}")
	public Services updateService(@PathVariable("shopid") long shopid, @PathVariable("serviceid") long serviceid, @RequestBody Services ser) {
		return serviceser.updateService(ser,shopid,serviceid);
	} 
	
	@DeleteMapping("/{id}")
	public void deleteService(@PathVariable("id") long id) {
		serviceser.deleteServiceById(id);
		return;
	}
}
