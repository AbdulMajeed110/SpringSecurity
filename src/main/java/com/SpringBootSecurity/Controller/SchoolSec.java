package com.SpringBootSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolSec {
	
	@GetMapping("/Home")
	public String show() {
		return "Hello World";
	}
}
