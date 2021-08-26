package com.drivease.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import com.drivease.dao.UserDao;
import com.drivease.model.Area;
import com.drivease.model.City;
import com.drivease.model.LenderDriver;
import com.drivease.model.Vehicle;
import com.drivease.model.VehicleCompany;
import com.drivease.model.VehicleModel;


import com.drivease.model.State;
import com.drivease.model.User;
import com.drivease.model.VehicleType;
import com.drivease.service.AreaService;
import com.drivease.service.CityService;
import com.drivease.service.LenderDriverService;
import com.drivease.service.VehicleService;

import com.drivease.service.StateService;
import com.drivease.service.UserService;
import com.drivease.service.VehicleCompanyService;
import com.drivease.service.VehicleModelService;
import com.drivease.service.VehicleTypeService;
import com.drivease.serviceimpl.VehicleCompanyServiceImpl;


@Controller
@RequestMapping("/vehicle")
@SessionAttributes("admin")
public class VehicleController {

	@Autowired
	VehicleService vehicleservice;
	
	@Autowired
	HttpSession session;
	
	@Autowired
	LenderDriverService lenderdriverservice;
	
	@Autowired
	VehicleCompanyService companyservice;
	
	@Autowired
	VehicleModelService modelservice;
	
	
	
	
	@RequestMapping("/vehicleList")
	public String getAllVehicles(Model model)
	{
		List<Vehicle> vehicleList = vehicleservice.getAll();
		model.addAttribute("listvehicle", vehicleList);
		return "vehiclelist";
	}
	@RequestMapping("/viewSinglePage")
	public String viewSinglePage() {
		
		return "vehiclesinglepage";
	}
	@RequestMapping("/viewSinglePages")
	public String viewSinglePages() {
		
		return "vehicletrial";
	}
	
}
