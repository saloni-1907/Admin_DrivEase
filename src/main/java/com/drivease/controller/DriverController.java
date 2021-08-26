package com.drivease.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("admin")
@RequestMapping("/driver")
public class DriverController {
	
	@RequestMapping("/viewSinglePage")
	public String viewSinglePage() {
		
		return "driversinglepage";
	}
	

}
