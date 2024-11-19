package com.ServiceMyVehicleProject.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ServiceMyVehicleProject.demo.Dao.CustomerRepo;
import com.ServiceMyVehicleProject.demo.Entities.Customer;

@Service
public class CustomerService {

	
	@Autowired
	private CustomerRepo custdao;
	
	public Customer getCustomerById(long id) {
		return custdao.findById(id).orElse(null);
	}
}
