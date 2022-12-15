package com.zaynah.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "Hello ";
	}
	
	@RequestMapping("/world")
	public String world () {
		return "Class level annotatations are cool too!";
		}
	}