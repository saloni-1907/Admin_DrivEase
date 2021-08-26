package com.drivease.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.drivease.model.Vehicle;

@Service("vehicleservice")
public interface VehicleService {

	long saveVehicle(Vehicle vehicle, MultipartFile file1);

	public Vehicle getById(long result1);

	public List<Vehicle> getAll();
	

}
