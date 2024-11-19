package com.ServiceMyVehicleProject.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ServiceMyVehicleProject.demo.Entities.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{

}
