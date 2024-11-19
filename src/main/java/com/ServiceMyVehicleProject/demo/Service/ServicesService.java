package com.ServiceMyVehicleProject.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ServiceMyVehicleProject.demo.Dao.ServicesRepo;
import com.ServiceMyVehicleProject.demo.Entities.Services;

public class ServicesService {
	
	@Autowired
	private ServicesRepo serdao;
	
	public Services getServiceById(long id) {
		return serdao.findById(id).orElse(null);
	}
}
