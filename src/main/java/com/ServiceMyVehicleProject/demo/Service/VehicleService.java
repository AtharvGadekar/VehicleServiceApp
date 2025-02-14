package com.ServiceMyVehicleProject.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ServiceMyVehicleProject.demo.Dao.CustomerRepo;
import com.ServiceMyVehicleProject.demo.Dao.VehicleRepo;
import com.ServiceMyVehicleProject.demo.Entities.Customer;
import com.ServiceMyVehicleProject.demo.Entities.Vehicle;

@Service
public class VehicleService {

	@Autowired
	private VehicleRepo vehdao;
	
	@Autowired
	private CustomerRepo custdao;
	
	public List<Vehicle> getAllVehicle(){
		return vehdao.findAll();
	}
	
	public Vehicle getVehicleById(long id) {
		return vehdao.findById(id).orElse(null);
	}
	
	public Vehicle createVehicle(Vehicle v) {
		Customer cust = custdao.findById(v.getCustomer().getCid()).orElse(null);
		Vehicle veh = vehdao.findByVlicenseplate(v.getVlicenseplate());
		if(veh!=null) {
			throw new RuntimeException("Vehicle already exist");
		}else {
			v.setCustomer(cust);
			return vehdao.save(v);
		}
	}
	
	public Vehicle upadateVehicle(Vehicle v,long id) {
		v.setVid(id);
		return vehdao.save(v);
	}
	
	public Boolean deleteVehicle(long id) {
		vehdao.deleteById(id);;
		return true;
	}
}
