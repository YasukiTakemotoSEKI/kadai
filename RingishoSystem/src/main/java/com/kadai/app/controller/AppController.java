package com.kadai.app.controller;

import com.kadai.domain.entity.App;
import com.kadai.domain.entity.Appflow;
import com.kadai.domain.entity.Flow;
import com.kadai.domain.entity.Price;
import com.kadai.domain.repository.AppRepository;
import com.kadai.domain.repository.EmployeeRepository;
import com.kadai.domain.service.AppService;
import com.kadai.domain.service.AppflowService;
import com.kadai.domain.service.FlowService;
import com.kadai.domain.service.PriceService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@Autowired
	AppRepository repository;

	@Autowired
	AppService appservice;

	@Autowired
	PriceService priceservice;
	
	@Autowired
	FlowService flowservice;
	
	@Autowired
	AppflowService appflowservice;

	@RequestMapping("/test")
	public String apptest() {
		//Chromeブラウザ読み込みで走る？
		// 案件１件分のレコード作成
		App app = new App(1, 1, 1, 1, false, "稟議システムの決済について", "稟議書システムの決済をお願いいたします。", 10000, "http://tenpusiryooo", "とにかくお願いします。", null, null);
		appservice.searchPrice(app);
		return "/home/test";
	}
}

