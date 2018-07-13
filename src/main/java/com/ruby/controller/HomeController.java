package com.ruby.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ruby.model.LoginBean;

@Controller
public class HomeController {
@RequestMapping(value="/Registration")
public  ModelAndView login() {
	System.out.println("login method");
	
	return new ModelAndView("login","lb",new LoginBean());
}
@RequestMapping(value="/check", method=RequestMethod.POST)
public String processForm(@Valid @ModelAttribute("lb")LoginBean lb,BindingResult result)
{  
	if(result.hasErrors())
	{System.out.println("if condition");
		return "login";
	}
	else if (!lb.getConfirmPassword().equals(lb.getPassword())) {
		System.out.println("else if");
		return "wrongPass";
	}
	
	else
	{System.out.println("else condition");
		return "success";
	}
}
}
