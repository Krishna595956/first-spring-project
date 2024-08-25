package com.example.first_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
	
	@GetMapping("/")
	public String hello(Model model,@RequestParam("id") int id) {
		model.addAttribute("name",id);
		return "hii";
	}
	
	@GetMapping("/login")
	public String hello1() {
				return "login";
	}
	
	@GetMapping("/register")
	public String hwl() {
		return "register";
	}
	
	@GetMapping("/sample")
	public String sample() {
		return "sample";
	}

}
