package com.drivease.serviceimpl;

import java.io.File;
import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.drivease.dao.VehicleDao;

import com.drivease.model.Vehicle;
import com.drivease.model.User;
import com.drivease.service.VehicleService;

import com.drivease.util.FTPUtils;
import com.drivease.util.FileUtils;


@Service("vehicleservice")
@Transactional
@SessionAttributes("user")
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	VehicleDao vehicledao;
	
	@Autowired
	HttpSession session;
	
	String absolutePath1 = "";
	//private static String UPLOADED_FOLDER1 =File.separator+"resources"+File.separator+"images"+File.separator+"vehiclePicture"+File.separator;
	//private static String UPLOADED_FOLDER1 ="D://tools//apache-tomcat-9.0.11-windows-x64//apache-tomcat-9.0.11//webapps//userdrivease//resources//images//vehiclePicture"+File.separator;
	//  private static String UPLOADED_FOLDER1="D://tools//apache-tomcat-9.0.11-windows-x64//apache-tomcat-9.0.11//webapps//userdrivease//resources//images";
	private static String UPLOADED_FOLDER1 ="D://tools//apache-tomcat-9.0.11-windows-x64//apache-tomcat-9.0.11//webapps//userdrivease//resources//images//vehiclePicture"+File.separator;
	
	public long saveVehicle(Vehicle vehicle, MultipartFile file1) {
		/*List<Vehicle> list = vehicledao.checkVehicleNo(vehicle.getVehicleNumber());
		if(list!=null) {
			return 0;
		}*/
		/*if((vehicle.getWithDriver())==1)
		{
			vehicle.setWithDriver(1);
		}
		else
		
			vehicle.setWithDriver(0);
		*/
		String newPP=FileUtils.getFileName(file1.getOriginalFilename());
		vehicle.setVehiclePicture(newPP);
		vehicle.setVehicleImage(file1);
		vehicle.setStatus("available");
		User ud=(User)session.getAttribute("user");
		if(ud==null)
		{
			return 0;
		}
		vehicle.setUserId(ud.getUserId());
		vehicle.setIsActive(1);
		//vehicle.setCreatedDate(new Date(System.currentTimeMillis()));
		Vehicle v1=vehicledao.saveObject(vehicle);
		if(v1!=null)
		{
		
			FileUtils.uploadImageFile(file1, UPLOADED_FOLDER1+newPP);
			FTPUtils.uploadOnFTP(UPLOADED_FOLDER1+newPP, newPP);
			return v1.getVehicleId();

		}
		return 0;
	}

	public Vehicle getById(long vid) {
		
		return vehicledao.getById(Vehicle.class,vid);
	}

	public List<Vehicle> getAll() {
		return vehicledao.getAll();
	}
	
	
	

}
