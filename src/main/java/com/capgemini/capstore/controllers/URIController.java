package com.capgemini.capstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class URIController {

	@RequestMapping(value="/")
	public String getHome() {
		return "index";
	}
	
}
