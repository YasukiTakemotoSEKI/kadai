package com.kadai.controller;

import com.kadai.entity.*;
import com.kadai.repository.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	
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
