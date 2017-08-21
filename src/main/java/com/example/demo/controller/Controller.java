package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String sendMessage() {
		return "Test Okay Sagar";
	}
}
