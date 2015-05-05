package com.lala.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController extends BaseController
{
	
	private static final String LOGIN_USER = "login_user";
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(HttpServletRequest request)
	{
		
		if(request.getParameter("reset") == "1")
		{
			request.getSession().invalidate();
		}
		
		if(request.getSession().getAttribute(LOGIN_USER) != null)
		{
			return "redirect:/sina/home.do";
		}
		
		String ua = request.getHeader("User-Agent");

		return getPageDir(ua) + "/index";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home()
	{
		return "/home";
	}
}
