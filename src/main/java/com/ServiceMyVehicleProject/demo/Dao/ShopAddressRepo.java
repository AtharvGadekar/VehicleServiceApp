package com.ServiceMyVehicleProject.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ServiceMyVehicleProject.demo.Entities.ShopAddress;

@Repository
public interface ShopAddressRepo extends JpaRepository<ShopAddress, Long>{

}
