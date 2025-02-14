package com.ServiceMyVehicleProject.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ServiceMyVehicleProject.demo.Entities.Vehicle;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Long>{

	public Vehicle findByVlicenseplate(String number);
}
