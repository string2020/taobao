<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>你好，欢迎回来</title>
<style type="text/css">
	td {
		width:20px;
	}
</style>
</head>
<body>
<h1>你好，欢迎回来</h1>
<table style="width: 100%;align:center;">
	<tr>
		<td width="40%">用户UID</td>
		<td width="60%">${user.id }<img alt="" src="${user.profileImageUrl }" /></td>
	</tr>
	<tr>
		<td>用户名称</td>
		<td>${user.name }</td>
	</tr>
	<tr>
		<td>用户昵称</td>
		<td>${user.screenName }</td>
	</tr>
	<tr>
		<td>用户所在地</td>
		<td>${user.location }</td>
	</tr>
	<tr>
		<td>用户个人描述</td>
		<td>${user.description }</td>
	</tr>
	<tr>
		<td>用户博客地址</td>
		<td>${user.url }</td>
	</tr>
	<tr>
		<td>粉丝数</td>
		<td>${user.followersCount }</td>
	</tr>
	<tr>
		<td>关注数</td>
		<td>${user.friendsCount }</td>
	</tr>
	<tr>
		<td>微博数</td>
		<td>${user.statusesCount }</td>
	</tr>
</table>
</body>
</html>