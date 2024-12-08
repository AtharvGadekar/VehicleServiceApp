package com.ServiceMyVehicleProject.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ServiceMyVehicleProject.demo.Entities.CustomerAddress;
import com.ServiceMyVehicleProject.demo.Service.CustomerAddressService;

@RestController
@RequestMapping("/customeraddress")
public class CustomerAddressController {

	@Autowired
	private CustomerAddressService custaddser;
	
	@GetMapping("/{id}")
	public CustomerAddress getCustomerAddressById(long id) {
		return custaddser.getCustomerAddressById(id);
	}
	
	@PostMapping()
	public CustomerAddress createCustomerAddress(@RequestBody CustomerAddress custadd) {
		return custaddser.createCustAddress(custadd);
	}
	
	@PutMapping()
	public CustomerAddress updateCustomerAddress(@RequestBody CustomerAddress custadd) {
		return custaddser.updateCustAddress(custadd);
	}
	
	@DeleteMapping("/{id}")
	public Boolean deleteCustomerAddress(@PathVariable("id") long id) {
		return custaddser.deleteCustAddressById(id);
	}
}
