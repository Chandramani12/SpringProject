package com.info;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AddController {
	@GetMapping("/add" )
	public String Add() {
		return "display";
	}

}
