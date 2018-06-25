package com.kadai.app.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import com.kadai.app.form.SessionAppForm;

@Controller
@SessionAttributes("sessionAppForm")
public class MakeController {
	
	@RequestMapping(path = {"/make", "/make/index"})
	public String index(SessionAppForm sessionAppForm) {
		return "/make/index";
	}
	
	@RequestMapping(path = "/make/confirm")
	public String confirm(@Valid SessionAppForm sessionAppForm,BindingResult result, Model model) {
		if (result.hasErrors()){
            model.addAttribute("message", "エラー：値をチェックしてください。");
            return "/make/index";
        }else{
            model.addAttribute("message", "正常：入力された値は正常です。");
            return "/make/confirm";
        }
	}
	
	@RequestMapping(path = "/make/complete", params = "back", method = RequestMethod.POST)
	public String complete_back(SessionAppForm sessionAppForm) {
		return "/make/index";
	}
	
	@RequestMapping(path = "/make/complete", params = "complete", method = RequestMethod.POST)
	public String complete_send(SessionAppForm sessionAppForm, SessionStatus sessionStatus) {
		return "/make/complete";
	}
	
	@RequestMapping(path = "/make/clear")
    public String clear(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        return "redirect:/make/index";
    }
}
