package com.ServiceMyVehicleProject.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ServiceMyVehicleProject.demo.Dao.CustomerAddressRepo;
import com.ServiceMyVehicleProject.demo.Dao.CustomerRepo;
import com.ServiceMyVehicleProject.demo.Entities.Customer;
import com.ServiceMyVehicleProject.demo.Entities.CustomerAddress;

@Service
public class CustomerAddressService {
	
	@Autowired
	private CustomerAddressRepo custadddao;
	
	@Autowired
	private CustomerRepo custdao;
	
	public CustomerAddress getCustomerAddressById(long id) {
		return custadddao.findById(id).orElse(null);
	}
	
	public CustomerAddress createCustAddress(CustomerAddress address) {
		Customer cust = custdao.findById(address.getCustomer().getCid()).orElse(null);
		return custadddao.save(address);
	}
	
	public CustomerAddress updateCustAddress(CustomerAddress address) {
		CustomerAddress add = custadddao.findById(address.getId()).orElse(null);
		if(add==null) {
			return custadddao.save(address);
		}else {
			add.setAddress(address.getAddress());
			add.setAreaname(address.getAreaname());
			add.setCity(address.getCity());
			add.setPincode(address.getPincode());
			return custadddao.save(add);
		}
	}
	
	public Boolean deleteCustAddressById(long id) {
		return custadddao.deleteById(id);
	}
}
