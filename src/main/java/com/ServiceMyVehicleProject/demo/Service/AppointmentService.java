package com.ServiceMyVehicleProject.demo.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ServiceMyVehicleProject.demo.Dao.AppointmentRepo;
import com.ServiceMyVehicleProject.demo.Entities.Appointment;
import com.ServiceMyVehicleProject.demo.Entities.Customer;
import com.ServiceMyVehicleProject.demo.Entities.MechanicShop;
import com.ServiceMyVehicleProject.demo.Entities.Services;
import com.ServiceMyVehicleProject.demo.Entities.Vehicle;

@Service
public class AppointmentService {
	
	@Autowired
	private AppointmentRepo dao;
	
	@Autowired
	private MechanicShopService shopser;
	
	@Autowired
	private VehicleService vehser;
	
	@Autowired
	private ServicesService serser;
	
	@Autowired
	private CustomerService custser;
	
	public List<Appointment> getAppointmentsByCustomerId(long id){
		Customer cust = custser.getCustomerById(id);
		return dao.findByCustomer(cust);
	}
	
	public List<Appointment> getAllAppointments(){
		return dao.findAll();
	}
	
	public Appointment getAppointmentById(long id) {
		return dao.findById(id).orElse(null);
	}
	
	public Boolean deleteAppointmentById(long id) {
		dao.deleteById(id);
		return true;
	}
	
	public Appointment createAppointment(Appointment appointment, long custid, long shopid, long vehid) {
		
		//getting list of services from appointment
		List<Services> serlist = appointment.getServices();
		
		
		for(Services ser:serlist) {
			Services s = serser.getServiceByServiceId(ser.getSid());
			ser.setScost(s.getScost());
			ser.setSdescription(s.getSdescription());
			ser.setShop(s.getShop());
			ser.setSname(s.getSname());
		}
		
		//get customer, shop and vehicle from id
		Customer cust = custser.getCustomerById(custid);
		MechanicShop shop = shopser.getShopById(shopid);
		Vehicle veh = vehser.getVehicleById(vehid);
		
		//create a new appointment, set values and save the new appointment
		Appointment newapp = new Appointment();
		newapp.setCustomer(cust);
		newapp.setShop(shop);
		newapp.setVehicle(veh);
		newapp.setServices(serlist);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
//		System.out.println("Current Date and Time: " + dtf.format(now));  
		newapp.setDateAndTime(dtf.format(now));
		return dao.save(newapp);
		
//		appointment.setAid(0);
//		appointment.setCustomer(cust);
//		appointment.setShop(shop);
//		appointment.setVehicle(veh);
//  	appointment.setDateAndTime();
//		return dao.save(appointment);
	}
}
