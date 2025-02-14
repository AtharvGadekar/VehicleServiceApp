package com.ServiceMyVehicleProject.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ServiceMyVehicleProject.demo.Dao.CustomerRepo;
import com.ServiceMyVehicleProject.demo.Entities.Customer;

@Service
public class MyUserDetailsService implements UserDetailsService{
	@Autowired
	private CustomerRepo userdao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Customer user= userdao.findByCemail(username);
		if(user==null) {
			throw new UsernameNotFoundException("User not found with username : "+username);
		}
		return new MyUserDetails(user.getEmail(), user.getCpassword());
	}
}
