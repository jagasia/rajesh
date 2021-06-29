package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
	@GetMapping("/")
	public String test() {
		return "this is a demo for spring rest";
	}
	@GetMapping("/login")
	public String test2() {
		return "this is a demo for spring rest login";
	}
@GetMapping("/demo")
public String test3() {
	return "this is a basic demo";
}

}
