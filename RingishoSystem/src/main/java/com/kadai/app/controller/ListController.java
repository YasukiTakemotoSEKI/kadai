package com.kadai.app.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kadai.domain.entity.App;
import com.kadai.domain.entity.Employee;
import com.kadai.domain.service.AppService;

@Controller
public class ListController {
	
	@Autowired
	AppService appservice;
	
	@RequestMapping("/list")
	public ModelAndView index(Principal principal) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/list/index");
		
		//ユーザー情報取得・セッションにセット
		Authentication auth = (Authentication)principal;
		Employee employee = (Employee)auth.getPrincipal();
		
		//未承認一覧の取得
		List<App> unapproveds = new ArrayList<App>();
		unapproveds = appservice.findAll();
		mav.addObject("unapproveds", unapproveds);
		
		System.out.println(unapproveds);
		
		return mav;
	}
	
}
