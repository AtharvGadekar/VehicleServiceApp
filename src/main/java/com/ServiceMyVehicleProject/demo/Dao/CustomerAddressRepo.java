package com.ServiceMyVehicleProject.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ServiceMyVehicleProject.demo.Entities.Customer;
import com.ServiceMyVehicleProject.demo.Entities.CustomerAddress;
@Repository
public interface CustomerAddressRepo extends JpaRepository<CustomerAddress, Long>{
	public Boolean deleteById(long id);
}
