package com.wizian.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GroupController {
	
	@GetMapping("/group")
	public String group(){
		return "group";
	}

}
