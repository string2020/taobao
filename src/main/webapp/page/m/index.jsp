<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta property="wb:webmaster" content="29637346a95a28b9" />
<meta name="viewport" content="width=device-width, initial-scale=1.0,user-scalable=no,maximum-scale=1.0" />  
<meta name="apple-mobile-web-app-capable" content="yes"/>  
<meta name="apple-mobile-web-app-status-bar-style" content="black"/>  
<meta name="full-screen" content="yes" />  
<meta name="x5-full-screen" content="yes" />  
<title>心随购物</title>
</head>
<body>
<h1>欢迎来到心随购物网</h1>
<h1>你尚未登录，请先登录</h1>
<a href="https://api.weibo.com/oauth2/authorize?client_id=${ CLIENT_ID}&response_type=code&redirect_uri=${REGISTERED_REDIRECT_URI }">请先登陆</a>
</body>
</html>