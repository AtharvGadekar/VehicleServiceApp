package com.ServiceMyVehicleProject.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerAddress extends JpaRepository<CustomerAddress, Long>{

}
