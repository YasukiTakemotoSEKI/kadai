package com.kadai.app.controller;

import com.kadai.domain.entity.Employee;
import com.kadai.domain.repository.EmployeeRepository;
import com.kadai.domain.entity.*;
import com.kadai.domain.repository.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	EmployeeRepository repository;
	
	@RequestMapping("/")
	public ModelAndView sample(ModelAndView mav) {
		List<Employee> list = (List<Employee>)repository.findAll();
		mav.addObject("list", list);
		mav.setViewName("sample");
		return mav;
	}
}
