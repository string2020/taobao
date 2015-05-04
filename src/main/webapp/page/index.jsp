<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta property="wb:webmaster" content="29637346a95a28b9" />
<title>心随购物</title>
</head>
<body>
<h1>欢迎来到心随购物网(${current_version})</h1>
<h1>你尚未登录，请先登录</h1>
<a href="https://api.weibo.com/oauth2/authorize?client_id=${ CLIENT_ID}&response_type=code&redirect_uri=${REGISTERED_REDIRECT_URI }">请先登陆</a>
</body>
</html>