package com.huucon.securingweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/")
	public String mainView() {
		System.out.println("aaaaaajh");
		return "views/main";
	}
}
