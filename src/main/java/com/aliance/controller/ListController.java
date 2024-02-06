package com.aliance.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {

	@GetMapping("/list")
	public String getList() {
		String str="Welcome to first Rest api...";
		return str;
	}
	
	@GetMapping("/msg")
	public ResponseEntity<String> getMsg() {
		String str="Welcome to first Rest api msg...";
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}
	
}
