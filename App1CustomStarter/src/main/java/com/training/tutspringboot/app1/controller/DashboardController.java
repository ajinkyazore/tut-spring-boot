package com.training.tutspringboot.app1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DashboardController {

	
	@GetMapping(value="/myDashboard")
	public @ResponseBody String getDashboardContent(){
		return "Hello World";
	}
}
