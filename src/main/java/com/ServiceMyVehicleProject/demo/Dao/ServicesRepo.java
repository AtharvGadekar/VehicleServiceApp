package com.ServiceMyVehicleProject.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ServiceMyVehicleProject.demo.Entities.Services;

@Repository
public interface ServicesRepo extends JpaRepository<Services, Long>{
	List<Services> findByShopId(long id);
}
