package com.example.demo.cp4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String getLogin() {
		return "cp4/login";
	}
}
