package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	public Alien() {
		super();
		System.out.println("Object Created ........");
	}

	private int eid;
	private String name;
	private String tech;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public  void show() {
		System.out.println("Hello Word");
	}
	
	
	
}
