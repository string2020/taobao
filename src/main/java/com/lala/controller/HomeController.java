package com.lala.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController 
{
	
	private static final String LOGIN_USER = "login_user";
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(HttpServletRequest request)
	{
		if(request.getSession().getAttribute(LOGIN_USER) != null)
		{
			return "redirect:/home.do";
		}
		String ua = request.getHeader("User-Agent");
		return getPageDir(ua) + "/index";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home()
	{
		return "/home";
	}
	
	private String getPageDir(String ua)
	{
		if(ua.indexOf("iPhone") != -1 || ua.indexOf("Mobile") != -1 || ua.indexOf("iPad") != -1 || ua.indexOf("Android") != -1)
		{
			return "/m";
		}
		return "";
	}
	
}
