package com.lala.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/oauth2")
public class OAuth2Controller 
{
	/**
	 * http://open.weibo.com/wiki/%E6%8E%88%E6%9D%83%E6%9C%BA%E5%88%B6
	 * @param request
	 * @return
	 */
	
	@RequestMapping(value = "/callback", method = RequestMethod.GET)
	public String index(HttpServletRequest request)
	{
		//https://api.weibo.com/oauth2/access_token?client_id=YOUR_CLIENT_ID&client_secret=YOUR_CLIENT_SECRET&grant_type=authorization_code&redirect_uri=YOUR_REGISTERED_REDIRECT_URI&code=CODE

		return "/index";
	}
	
	
}
