package com.kadai.app.controller;

import com.kadai.domain.entity.Employee;
import com.kadai.domain.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(method = RequestMethod.GET)
    public ModelAndView list() {
		ModelAndView mav = new ModelAndView("/employee/list");
		List<Employee> employees = employeeService.findAll();
		mav.addObject("employees",employees);
        return mav;
    }
	
}
