package com.lala;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.junit.Test;

import com.google.gson.Gson;
import com.lala.config.OAuth2Config;

public class TestAPI
{
	@Test
	public void test()throws Exception
	{
		StringBuffer buf = new StringBuffer("https://api.weibo.com/oauth2/access_token");
		
		HttpPost postMethod = new HttpPost(buf.toString());  
		
		List<NameValuePair> params = new ArrayList<NameValuePair>();  
		params.add(new BasicNameValuePair("client_id", OAuth2Config.CLIENT_ID));  
		params.add(new BasicNameValuePair("client_secret", OAuth2Config.CLIENT_SECRET));  
		params.add(new BasicNameValuePair("grant_type", "authorization_code"));  
		params.add(new BasicNameValuePair("redirect_uri", OAuth2Config.REGISTERED_REDIRECT_URI));  
        params.add(new BasicNameValuePair("code", "123"));  
		  
		// (2) 使用HttpClient发送get请求，获得返回结果HttpResponse  
		HttpClient http = HttpClientBuilder.create().build();
		
		postMethod.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
		
		HttpResponse response = http.execute(postMethod); 
		
		org.apache.http.HttpEntity entity = response.getEntity();  
		
		InputStream in = entity.getContent();  
	    
	    String result = IOUtils.toString(in);
	    
	    Gson g = new Gson();
	    
	    System.out.println(g.fromJson(result, Map.class));
	}
}
