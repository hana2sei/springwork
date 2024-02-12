package com.example.demo.cp4.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.cp4.form.SignupForm;
import com.example.demo.cp4.service.UserApplicationService;

@Controller
@RequestMapping("/user")
public class SignupController {

	@Autowired
	private	UserApplicationService userApplicationService;
	
	/** ユーザー登録画面を表示 **/
	@GetMapping("/signup")
	public String getSignup(Model model, @ModelAttribute SignupForm form) {
		// 性別を登録
		Map<String, Integer> genderMap = userApplicationService.getGenderMap();
		model.addAttribute("genderMap", genderMap);
		
		// ユーザー登録画面に遷移
		return "cp4/signup";
	}
	
	/** ユーザー登録処理 **/
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute SignupForm form) {
		System.out.println(form.toString());
		
		// ログイン画面にリダイレクト
		return "redirect:cp4/login";
	}
}
