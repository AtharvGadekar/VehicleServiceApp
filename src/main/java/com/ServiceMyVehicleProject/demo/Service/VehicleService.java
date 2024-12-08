package com.ServiceMyVehicleProject.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ServiceMyVehicleProject.demo.Dao.VehicleRepo;
import com.ServiceMyVehicleProject.demo.Entities.Vehicle;

@Service
public class VehicleService {

	@Autowired
	private VehicleRepo vehicleDao;
	
	public List<Vehicle> getAllVehicle(){
		return vehicleDao.findAll();
	}
	
	public Vehicle getVehicleById(long id) {
		return vehicleDao.findById(id).orElse(null);
	}
	
	public Vehicle createVehicle(Vehicle v) {
		return vehicleDao.save(v);
	}
	
	public Vehicle upadateVehicle(Vehicle v,long id) {
		v.setVid(id);
		return vehicleDao.save(v);
	}
	
	public Boolean deleteVehicle(long id) {
		vehicleDao.deleteById(id);;
		return true;
	}
}
