package com.lala.config;

import weibo4j.util.WeiboConfig;

public class OAuth2Config
{
	public static final String CLIENT_ID = WeiboConfig.getValue("client_ID");
	
	public static final String CLIENT_SECRET = WeiboConfig.getValue("client_SERCRET");
	
	public static final String REGISTERED_REDIRECT_URI = WeiboConfig.getValue("redirect_URI");
}
