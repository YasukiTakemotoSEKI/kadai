package com.kadai.app.controller;

import com.kadai.domain.entity.App;
import com.kadai.domain.repository.AppRepository;
import com.kadai.domain.repository.EmployeeRepository;
import com.kadai.domain.service.AppService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@Autowired
	AppRepository repository;
	
	@Autowired
	AppService appservice;
	
	@RequestMapping("/test")
	public String index() {
		App app = new App(1,1,1,1,false,"稟議システムの決済について","稟議書システムの決済をお願いいたします。",5000,"http://tenpusiryooo","とにかくお願いします。",null,null);
		appservice.save(app);
		appservice.checkPrice();
		return "/home/test";
	}
}
