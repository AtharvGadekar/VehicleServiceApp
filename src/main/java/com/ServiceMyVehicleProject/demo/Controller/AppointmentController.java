package com.ServiceMyVehicleProject.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ServiceMyVehicleProject.demo.Entities.Appointment;
import com.ServiceMyVehicleProject.demo.Service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	@Autowired
	private AppointmentService appser;
	
	@GetMapping()
	public List<Appointment> getAllAppointments(){
		return appser.getAllAppointments();
	}
	
	@GetMapping("/customer/{id}")
	public List<Appointment> getAllAppointmentsByCustomerId(@PathVariable("id") long cid){
		return appser.getAppointmentsByCustomerId(cid);
	}
	
	@GetMapping("/{id}")
	public Appointment getAppointmentById(@PathVariable("id") long id) {
		return appser.getAppointmentById(id);
	}
	
	@PostMapping("/{custid}/{shopid}/{vehid}")
	public Appointment createAppointment(@RequestBody Appointment appointment, @PathVariable("custid") long custid, @PathVariable("shopid")long shopid, @PathVariable("vehid") long vehid) {
		return appser.createAppointment(appointment, custid, shopid, vehid);
	}
	
	@DeleteMapping("/{id}")
	public Boolean deleteAppointment(@PathVariable("id") long id) {
		return appser.deleteAppointmentById(id);
	}
}
