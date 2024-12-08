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

import com.ServiceMyVehicleProject.demo.Entities.Vehicle;
import com.ServiceMyVehicleProject.demo.Service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	
	@Autowired
	private VehicleService vehser;
	
	
	@GetMapping()
	public List<Vehicle> getAllVehicle(){
		return vehser.getAllVehicle();
	}
	
	@GetMapping("/{id}")
	public Vehicle getVehicleById(@PathVariable("id") long id) {
		return vehser.getVehicleById(id);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteVehicleById(@PathVariable("id") long id) {
		return vehser.deleteVehicle(id);
	}
	
	@PostMapping()
	public Vehicle createVehicle(@RequestBody Vehicle veh) {
		return vehser.createVehicle(veh);
	}
	
	@PutMapping("/{id}")
	public Vehicle updateVehicle(@RequestBody Vehicle veh,@PathVariable("id") long id) {
		return vehser.upadateVehicle(veh,id);
	}
}
