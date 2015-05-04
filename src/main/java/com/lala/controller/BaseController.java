package com.lala.controller;

public class BaseController
{
	protected String getPageDir(String ua)
	{
		if(ua == null)
		{
			return "";
		}
		if(ua.indexOf("iPhone") != -1 || ua.indexOf("Mobile") != -1 || ua.indexOf("iPad") != -1 || ua.indexOf("Android") != -1)
		{
			return "/m";
		}
		return "";
	}
}
