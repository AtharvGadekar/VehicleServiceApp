package com.ServiceMyVehicleProject.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ServiceMyVehicleProject.demo.Dao.VehicleRepo;

@Service
public class VehicleService {

	@Autowired
	private VehicleRepo vehicleRepo;
	
}
