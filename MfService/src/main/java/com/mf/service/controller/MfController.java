package com.mf.service.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/mfController")

public class MfController {
	
	@GetMapping("/hello")
	public String gethelloMessage()
	{
		
		return "Hello from Pritesh";
	}
	
	

}
