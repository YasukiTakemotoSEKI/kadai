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
public class ListController {
	
	@Autowired
	AppService appservice;
	
	@RequestMapping("/list")
	public ModelAndView index(Principal principal) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/list/index");
		
		//ユーザー情報取得
		Authentication auth = (Authentication)principal;
		Employee employee = (Employee)auth.getPrincipal();
		
		//未承認一覧の取得
		List<App> unapproveds = new ArrayList<App>();
		unapproveds = appservice.IncompleteList(employee);
		mav.addObject("unapproveds", unapproveds);
		return mav;
	}
	
	@RequestMapping("/list/view/{appId}")
	public ModelAndView view(@PathVariable("appId") Integer appId, Principal principal) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/list/view");
		
		//ユーザー情報取得
		Authentication auth = (Authentication)principal;
		Employee employee = (Employee)auth.getPrincipal();
		
		//所有する申請データか確認
		if(appservice.IncompleteList(employee).isEmpty()) {
			mav.setViewName("/error/error");
			return mav;
		}
		
		//データ表示
		App app = appservice.findOne(appId);
		mav.addObject("app", app);
		
		return mav;
	}
	
	@RequestMapping("/list/approval/{appId}")
	public ModelAndView approval(@PathVariable("appId") Integer appId, Principal principal) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/list/index");
		
		//ユーザー情報取得
		Authentication auth = (Authentication)principal;
		Employee employee = (Employee)auth.getPrincipal();
		
		//所有する申請データか確認
		if(appservice.IncompleteList(employee).isEmpty()) {
			mav.setViewName("/error/error");
			return mav;
		}
		
		//承認処理
		appservice.approval(appId, employee.getPositionId());
		mav.addObject("success_message", "承認を完了しました。");
		
		//未承認一覧の取得
		List<App> unapproveds = new ArrayList<App>();
		unapproveds = appservice.IncompleteList(employee);
		mav.addObject("unapproveds", unapproveds);
		
		return mav;
	}
	
	@RequestMapping("/list/dismissal/{appId}")
	public ModelAndView dismissal(@PathVariable("appId") Integer appId, Principal principal) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/list/index");
		
		//ユーザー情報取得
		Authentication auth = (Authentication)principal;
		Employee employee = (Employee)auth.getPrincipal();
		
		//所有する申請データか確認
		if(appservice.IncompleteList(employee).isEmpty()) {
			mav.setViewName("/error/error");
			return mav;
		}
		
		//却下処理
		appservice.dismissal(appId, employee.getPositionId());
		mav.addObject("success_message", "却下を完了しました。");
		
		//未承認一覧の取得
		List<App> unapproveds = new ArrayList<App>();
		unapproveds = appservice.IncompleteList(employee);
		mav.addObject("unapproveds", unapproveds);
		
		return mav;
	}
	
	
}
