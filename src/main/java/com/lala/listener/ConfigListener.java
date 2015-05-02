package com.lala.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.lala.config.OAuth2Config;

public class ConfigListener implements ServletContextListener
{
	public void contextInitialized(ServletContextEvent sce)
	{
		ServletContext context = sce.getServletContext();
		context.setAttribute("CLIENT_ID", OAuth2Config.CLIENT_ID);
		context.setAttribute("CLIENT_SECRET", OAuth2Config.CLIENT_SECRET);
		context.setAttribute("REGISTERED_REDIRECT_URI", OAuth2Config.REGISTERED_REDIRECT_URI);
	}

	public void contextDestroyed(ServletContextEvent sce) 
	{
		
	}
}
