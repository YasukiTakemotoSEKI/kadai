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

@Controller
@SessionAttributes("sessionAppForm")
public class MakeController {
	
	@RequestMapping(path = {"/make", "/make/index"})
	public String index(SessionAppForm sessionAppForm, Principal principal) {
		//ユーザー情報取得・セッションにセット
		Authentication auth = (Authentication)principal;
		Employee employee = (Employee)auth.getPrincipal();
		sessionAppForm.setEmployeeId(employee.getEmployeeId());
		sessionAppForm.setDepartmentId(employee.getDepartmentId());
		sessionAppForm.setDivisionId(employee.getDivisionId());
		return "/make/index";
	}
	
	//確認ボタン押下時
	@RequestMapping(path = "/make/confirm")
	public String confirm(@Valid SessionAppForm sessionAppForm,BindingResult result, Model model) {
		if (result.hasErrors()){
            model.addAttribute("validation_message", "エラー：値をチェックしてください。");
            return "/make/index";
        }else{
            model.addAttribute("validation_message", "正常：入力された値は正常です。");
            return "/make/confirm";
        }
	}
	
	//戻るボタン押下時
	@RequestMapping(path = "/make/complete", params = "back", method = RequestMethod.POST)
	public String complete_back(SessionAppForm sessionAppForm) {
		return "/make/index";
	}
	
	//送信ボタン押下時
	@RequestMapping(path = "/make/complete", params = "complete", method = RequestMethod.POST)
	public String complete_send(SessionAppForm sessionAppForm, SessionStatus sessionStatus) {
		//登録処理
		App app = new App();
		app.setEmployeeId(sessionAppForm.getEmployeeId());
		app.setDepartmentId(sessionAppForm.getDepartmentId());
		app.setDivisionId(sessionAppForm.getDivisionId());
		app.setAppFlg(true);
		app.setAppSubject(sessionAppForm.getAppSubject());
		app.setAppContent(sessionAppForm.getAppContent());
		app.setAppPrice(Integer.parseInt(sessionAppForm.getAppPrice()));
		app.setAppAttachment(sessionAppForm.getAppAttachment());
		app.setAppComment(sessionAppForm.getAppComment());
		
		return "/make/complete";
	}
	
	//保持しているセッションをクリア（開発用として用意）
	@RequestMapping(path = "/make/clear")
    public String clear(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        return "redirect:/make/index";
    }
}
