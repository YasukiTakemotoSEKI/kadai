package com.kadai.app.controller;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import com.kadai.app.form.SessionAppForm;
import com.kadai.domain.entity.App;
import com.kadai.domain.entity.Employee;
import com.kadai.domain.repository.AppflowRepository;
import com.kadai.domain.repository.EmployeeRepository;

@Controller
public class ListController {
	
	@Autowired
	EmployeeRepository employeerepository;
	
	@RequestMapping("/list")
	public String index( Principal principal) {
		//ユーザー情報取得・セッションにセット
		Authentication auth = (Authentication)principal;
		Employee employee = (Employee)auth.getPrincipal();
		
		//未承認一覧の取得
		
		return "/make/index";
	}
	
}
