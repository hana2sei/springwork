package com.example.demo.cp3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.cp3.entity.Shohin;
import com.example.demo.cp3.service.ShohinService;

@Controller
@RequestMapping("/shohin")
public class ShohinController {
	
	@Autowired
	private ShohinService service;
	
	@GetMapping("")	// http://localhost:8080/shohin でアクセス可
	public String getFirst() {
		return "cp3_3_original/shohin_search";
	}

	@GetMapping("/search")	// http://localhost:8080/shohin/search でアクセス可
	public String getSearch(@RequestParam("id") String id, Model model) {
		Shohin shohin = service.getShohin(id);
		model.addAttribute("shohin", shohin);
		
//		System.out.println(shohin);
		return "cp3_3_original/shohin_search_result";
	}
	
	@PostMapping("/delete")	// http://localhost:8080/shohin/delete でアクセス可（POST）
	public String getDelete(@RequestParam("id") String id) {
		service.deleteShohin(id);	
		return "cp3_3_original/shohin_search";
	}
}
