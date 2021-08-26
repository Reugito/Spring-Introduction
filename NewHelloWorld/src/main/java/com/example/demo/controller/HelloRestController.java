package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
	
	@RequestMapping(value = {"", "/n", "/home"})
	public String sayHello() {
		return "Hello this is Rest Request";
	}
	
	@RequestMapping(value = {"/query"}, method = RequestMethod.GET)
	public String sayHello(@RequestParam(value = "name") String name) {
		return "Hello "+ name +";";
	}
}
