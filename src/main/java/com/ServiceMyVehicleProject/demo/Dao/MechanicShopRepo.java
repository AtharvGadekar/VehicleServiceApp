package com.ServiceMyVehicleProject.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ServiceMyVehicleProject.demo.Entities.MechanicShop;

@Repository
public interface MechanicShopRepo extends JpaRepository<MechanicShop, Long	>{

}
