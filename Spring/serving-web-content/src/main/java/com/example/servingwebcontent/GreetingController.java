package com.example.servingwebcontent;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

@GetMapping("/greeting")
//public String Greeting(@RequestParam(name="name",required=false,defaultValue = "World")String name,Model model) {
//	
//	model.addAttribute("name",name);
//	
//	
//	
//	return "greeting";
//}
public Greetings greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
	return new Greetings(counter.incrementAndGet(), String.format(template, name));
}
}
