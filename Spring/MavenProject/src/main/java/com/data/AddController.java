package com.data;



import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class AddController {
	@RequestMapping("/data")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
		int num1=Integer.parseInt(request.getParameter("name1"));
		int num2=Integer.parseInt(request.getParameter("name2"));
		int sum=num1+num2;
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("data");
		mv.addObject("result",sum);
		return mv;
		
	}
	

}
