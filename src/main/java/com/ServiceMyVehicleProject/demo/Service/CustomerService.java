package com.ServiceMyVehicleProject.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ServiceMyVehicleProject.demo.Dao.CustomerRepo;
import com.ServiceMyVehicleProject.demo.Entities.Customer;

@Service
public class CustomerService {

	
	@Autowired
	private CustomerRepo custdao;
	
	@Autowired
	private CustomerAddressService custaddser;
	
	public Customer getCustomerById(long id) {
		return custdao.findById(id).orElse(null);
	}
	
	public Customer getCustomerByEmailAndPassword(String email,String password) {
		Customer cust = custdao.findByCemail(email);
		if(cust.getCpassword().equals(password)) {
			return cust;
		}
		return null;
	}
	
	public List<Customer> getAllCustomer(){
		return custdao.findAll();
	}
	
	public Customer createCustomer(Customer cust) {
//		custaddser.createCustAddress(cust.getCaddress());
		return custdao.save(cust);
	}
	
	public Customer updateCustomer(Customer cust) {
//		custaddser.updateCustAddress(cust.getCaddress());
//		Customer customer = custdao.findById(cust.getCid()).orElse(null);
//		

		return custdao.save(cust);
	}
	public Customer findbyEmail(String email) {
		return custdao.findByCemail(email);
	}
	public Customer findbyName(String name) {
		return custdao.findByCname(name);
	}
	public void deleteCustomer(long id) {
		Customer cust = custdao.findById(id).orElse(null);
		if(cust==null) {
			custdao.deleteById(id);
			return ;
		}else {
			long i = cust.getCaddress().getId();
			custdao.deleteById(id);
			custaddser.deleteCustAddressById(i);	
			return ;
		}
	}
}
