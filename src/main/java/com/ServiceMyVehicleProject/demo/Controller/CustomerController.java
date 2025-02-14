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

import com.ServiceMyVehicleProject.demo.Entities.Customer;
import com.ServiceMyVehicleProject.demo.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService custser;
	
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable("id") long id) {
		return custser.getCustomerById(id);
	}
	
	@GetMapping("/mail/{mail}")
	public Customer getCustomerbyEmail(@PathVariable("mail")String mail) {
		return custser.findbyEmail(mail);
	}
	@GetMapping("/name/{name}")
	public Customer getCustomerByName(@PathVariable("name")String name) {
		return custser.findbyName(name);
	}
	@GetMapping
	public List<Customer> getAllCustomers(){
		return custser.getAllCustomer();
	}
	
	@PostMapping()
	public Customer createCustomer(@RequestBody Customer customer) {
		return custser.createCustomer(customer);
	}
	
	@PutMapping
	public Customer updateCustomer(@RequestBody Customer customer) {
		return custser.updateCustomer(customer);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCustomer(@PathVariable("id") long id) {
		custser.deleteCustomer(id);
	}
}
