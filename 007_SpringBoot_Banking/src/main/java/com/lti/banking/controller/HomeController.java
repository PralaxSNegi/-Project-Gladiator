package com.lti.banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class HomeController {
	
	@RequestMapping(value="/home")
	public String showHomePage(Model model) {
		model.addAttribute("msg", "Banking");
		return "home";
	}
	
}
