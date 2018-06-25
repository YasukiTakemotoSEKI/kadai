package com.kadai.app.controller;

import com.kadai.domain.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Autowired
	EmployeeRepository repository;
	
	@RequestMapping("/home")
	public String home() {
		return "/home/home";
	}
}
