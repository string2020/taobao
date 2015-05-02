package com.lala.controller;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.lala.config.OAuth2Config;

@Controller
@RequestMapping("/sina")
public class OAuth2Controller 
{
	/**
	 * http://open.weibo.com/wiki/%E6%8E%88%E6%9D%83%E6%9C%BA%E5%88%B6
	 * @param request
	 * @return
	 */
	
	@RequestMapping(value = "/callback", method = RequestMethod.GET)
	public String callback(HttpServletRequest request) throws Exception
	{
		getMaps(request);
		
		return "/callback";
	}
	
	@RequestMapping(value = "/cancel", method = RequestMethod.GET)
	public String cancel(HttpServletRequest request)
	{
		String code = request.getParameter("code");
		
		
		return "/index";
	}

	private void getMaps(HttpServletRequest request)throws Exception
	{
		StringBuffer buf = new StringBuffer("https://api.weibo.com/oauth2/access_token");
			
		HttpPost postMethod = new HttpPost(buf.toString());  
		
		List<NameValuePair> params = new ArrayList<NameValuePair>();  
		params.add(new BasicNameValuePair("client_id", OAuth2Config.CLIENT_ID));  
		params.add(new BasicNameValuePair("client_secret", OAuth2Config.CLIENT_SECRET));  
		params.add(new BasicNameValuePair("grant_type", "authorization_code"));  
		params.add(new BasicNameValuePair("redirect_uri", OAuth2Config.REGISTERED_REDIRECT_URI));  
        params.add(new BasicNameValuePair("code", request.getParameter("code")));  
		  
		// (2) 使用HttpClient发送get请求，获得返回结果HttpResponse  
		HttpClient http = HttpClientBuilder.create().build();
		
		postMethod.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
		
		HttpResponse response = http.execute(postMethod);  
		  
		request.setAttribute("statusCode", response.getStatusLine().getStatusCode());
		
		org.apache.http.HttpEntity entity = response.getEntity();  
		  
	    InputStream in = entity.getContent();  
	    
	    String result = IOUtils.toString(in);
	    
	    Gson g = new Gson();
	    
	    request.setAttribute("maps", g.fromJson(result, Map.class));
	}
}








