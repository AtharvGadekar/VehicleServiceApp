package com.ServiceMyVehicleProject.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ServiceMyVehicleProject.demo.Dao.AppointmentRepo;
import com.ServiceMyVehicleProject.demo.Entities.Appointment;

@Service
public class AppointmentService {
	
	@Autowired
	private AppointmentRepo dao;
	
	public List<Appointment> getAllAppointments(){
		return dao.findAll();
	}
	
	
}
