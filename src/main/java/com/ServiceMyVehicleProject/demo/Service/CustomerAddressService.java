package com.ServiceMyVehicleProject.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ServiceMyVehicleProject.demo.Dao.CustomerAddressRepo;
import com.ServiceMyVehicleProject.demo.Entities.CustomerAddress;

@Service
public class CustomerAddressService {
	
	@Autowired
	private CustomerAddressRepo custadddao;
	
	public CustomerAddress getCustomerAddressById(long id) {
		return custadddao.findById(id).orElse(null);
	}
}
