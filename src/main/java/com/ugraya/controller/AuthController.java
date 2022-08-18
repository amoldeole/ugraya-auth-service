package com.ugraya.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	@RequestMapping({"/test"}) 
	public String hello() {
		return "Hello World!!";
	}
	
}
