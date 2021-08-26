package com.drivease.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.drivease.dao.VehicleDao;

import com.drivease.model.Vehicle;
import com.drivease.util.DbUtility;

@Repository("vehicleDao")
public class VehicleDaoImpl extends GenericDaoImpl<Vehicle> implements VehicleDao {

	public List<Vehicle> checkVehicleNo(String vehicleNo) {
		//String query = "FROM Vehicle where vehicleNumber='" + vehicleNo + "'";
		List<Vehicle> list = super.getByQuery("FROM Vehicle where vehicleNumber=" + vehicleNo);
		return list;
	}

	public List<Vehicle> getAll() {
		List<Vehicle> list = DbUtility.getListData("SELECT v.vehicleId as vehicleId, u.fname as lenderName, v.vehicleNumber as vehicleNumber,c.companyName as companyName,m.modelName as modelName, v.pickUpAdd as pickUpAdd,v.availableFrom as availableFrom,v.availableTill as availableTill,v.hourlyRent as hourlyRent, v.dailyRent as dailyRent, v.status as status FROM vehicle v where v.isDeleted=0 ",Vehicle.class);
		//List<Vehicle> list = super.getByQuery("From Vehicle v where v.isDeleted=0");
		return list;
		
	}
	

}
