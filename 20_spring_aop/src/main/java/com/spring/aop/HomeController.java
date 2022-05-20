package com.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@Autowired
	private Boss boss;
	
	@Autowired
	private Manager manager;
	
	@Autowired
	private Employee employee;
	
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		boss.work();
		manager.work();
		employee.work();
		
		System.out.println("\n\n");
		
		boss.getWorkingTime();
		manager.getWorkingTime();
		employee.getWorkingTime();
		
		return "home";
	
	}
	
}
