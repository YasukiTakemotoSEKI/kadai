package com.kadai.app.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kadai.domain.entity.App;
import com.kadai.domain.entity.Employee;
import com.kadai.domain.service.AppService;

@Controller
public class ListController {
	
	@Autowired
	AppService appservice;
	
	@RequestMapping("/list")
	public String index(Principal principal) {
		//ユーザー情報取得・セッションにセット
		Authentication auth = (Authentication)principal;
		Employee employee = (Employee)auth.getPrincipal();
		
		//未承認一覧の取得
		List<App> unapproved_list = new ArrayList<App>();
		unapproved_list = appservice.findAll();
		
		System.out.println(unapproved_list);
		
		return "/make/index";
	}
	
}
