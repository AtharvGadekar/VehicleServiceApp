package com.ServiceMyVehicleProject.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ServiceMyVehicleProject.demo.Entities.Appointment;
import com.ServiceMyVehicleProject.demo.Entities.Customer;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long>{

	
	public List<Appointment> findByCustomer(Customer cust);
}
