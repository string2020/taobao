package com.lala.config;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class OAuth2Config
{
	public static final String CLIENT_ID = "4033219693";
	
	public static final String CLIENT_SECRET = "752f7c9fa96e08eb169fa2bec2d5e526";
	
	public static final String REGISTERED_REDIRECT_URI;
	
	static
	{
		String url = null;
		
		try 
		{
			url = URLEncoder.encode("http://tangshiyi.oschina.mopaas.com/sina/callback.do", "UTF-8");
		} catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		
		REGISTERED_REDIRECT_URI = url;
	}
}
