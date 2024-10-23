package com.ServiceMyVehicleProject.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ServiceMyVehicleProject.demo.Entities.Appointment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long>{

}
