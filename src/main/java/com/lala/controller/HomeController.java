package com.lala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lala.model.User;

@Controller
public class HomeController 
{

	@ModelAttribute("u")
	public User pre()
	{
		User user = new User();
		user.setDesc("this is desc");
		user.setId(10010);
		user.setName("Apache");
		return user;
	}
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(@ModelAttribute("u") User user)
	{
		System.out.println(user);
		return "/index";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home()
	{
		return "/home";
	}
	
	
}
