package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String getHello() {
		return "cp1/hello";
	}
	
	@PostMapping("/hello")
	public String postRequest(@RequestParam("text1") String str, @RequestParam("weather") String str2, Model model) {
		model.addAttribute("sample", str);
		model.addAttribute("tenki", str2);
		
		return "cp1/response";
	}
}
