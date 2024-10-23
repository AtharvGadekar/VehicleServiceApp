package com.ServiceMyVehicleProject.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ServiceMyVehicleProject.demo.Dao.MechanicShopRepo;

@Service
public class ShopService {
	@Autowired
	private MechanicShopRepo shopdao;
}
