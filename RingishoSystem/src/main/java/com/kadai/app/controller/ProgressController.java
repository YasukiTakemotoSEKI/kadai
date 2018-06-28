package com.kadai.app.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kadai.domain.entity.App;
import com.kadai.domain.entity.Employee;
import com.kadai.domain.service.AppService;

@Controller
public class ProgressController {
	
	@Autowired
	AppService appservice;
	
	@RequestMapping("/progress")
	public ModelAndView index(Principal principal) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/progress/index");
		
		//ユーザー情報取得
		Authentication auth = (Authentication)principal;
		Employee employee = (Employee)auth.getPrincipal();
		//承認状況の取得
		List<App> apps = new ArrayList<App>();
		apps = appservice.ApprovalStatus(employee);
		for(App a:apps) {
			appservice.checkApproval(a);
		}
		mav.addObject("apps", apps);
		return mav;
	}
	
	@RequestMapping("/progress/view/{appId}")
	public ModelAndView view(@PathVariable("appId") Integer appId) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/progress/view");
		
		//所有する申請データか確認
		
		//データ表示
		App app = appservice.findOne(appId);
		mav.addObject("app", app);
		
		return mav;
	}
	
	
}
