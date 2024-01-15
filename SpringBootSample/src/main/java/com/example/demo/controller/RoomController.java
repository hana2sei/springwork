package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoomController {

	@GetMapping("/room1")
	public String getRoom1() {
		return "cp1/room1";
	}
	
	@GetMapping("/room2")
	public String getRoom2() {
		return "cp1/room2";
	}
}
