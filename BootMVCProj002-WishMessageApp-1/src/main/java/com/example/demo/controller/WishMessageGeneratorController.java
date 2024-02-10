package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.IWishMessageService;

@Controller
public class WishMessageGeneratorController {
	
	private IWishMessageService service;
	
	@RequestMapping("/")
	public String showHome() {
		
		return "home";
	}
	
	public ModelAndView generateMessage() {
		
		String result = service.generateWishMessage();
		
		return new ModelAndView("display","wmg",result);
	}

}
