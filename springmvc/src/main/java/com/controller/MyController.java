package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

//	@RequestMapping("/Add")
//	public ModelAndView Add(HttpServletRequest request,HttpServletResponse response)
//	{
//		int i=Integer.parseInt(request.getParameter("t1"));
//		int j=Integer.parseInt(request.getParameter("t2"));
//		int k=i+j;
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("Display");
//		mv.addObject("result",k);
//		return mv;
//	}
	
	@RequestMapping("/Add")
	public String Add()
	{
		return "Display";
	}
	
	
//	@RequestMapping("/Delete")
//	@ResponseBody
//	public String Delete()
//	{
//		return "Hey I am here";
//	}
//	@RequestMapping("/Cancel")
//	public String Cancel()
//	{
//		return "Show";
//	}
}
