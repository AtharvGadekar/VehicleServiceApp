package com.ServiceMyVehicleProject.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ServiceMyVehicleProject.demo.Dao.ServicesRepo;
import com.ServiceMyVehicleProject.demo.Entities.MechanicShop;
import com.ServiceMyVehicleProject.demo.Entities.Services;

@Service
public class ServicesService {
	
	@Autowired
	private ServicesRepo serdao;
	
	@Autowired
	private MechanicShopService shopser;
	
//	public Services getServiceById(long id) {
//		return serdao.findById(id).orElse(null);
//	}
	
	public void deleteServiceById(long id) {
		serdao.deleteById(id);
		return;
	}
	
	public Services getServiceByServiceId(long id) {
		return serdao.findById(id).orElse(null);
	}
	
	public List<Services> getServicesByShopId(long id){
		return serdao.findByShopId(id);
	}
	
	public List<Services> getAllServices(){
		return serdao.findAll();
	}
	
	public Services createService(Services ser, long shopid) {
		MechanicShop shop = shopser.getShopById(shopid);
		ser.setShop(shop);
		return serdao.save(ser);
	}
	
	public Services updateService(Services ser, long shopid, long serviceid) {
		
		Services service = serdao.findById(serviceid).orElse(null);
		
		if(service==null) {
			throw new RuntimeException("service with serviceid provided does not exsist");
		}else {
			service.setScost(ser.getScost());
			service.setSdescription(ser.getSdescription());
			service.setShop(shopser.getShopById(shopid));
			service.setSname(ser.getSname());
			return serdao.save(service);
		}
		
	}
}
