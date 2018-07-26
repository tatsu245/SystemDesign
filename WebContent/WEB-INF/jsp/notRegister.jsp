<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- CSS -->
<link rel="stylesheet" href="/tt_match_manager/css/bootstrap.min.css">
<link rel="stylesheet"
	href="/tt_match_manager/font/css/open-iconic-bootstrap.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>notRegister</title>
</head>
<body>
<!-- ナビゲーションバー -->
	<nav class="navbar navbar-dark bg-dark"> <a class="navbar-brand"
		href="/tt_match_manager/">tt_match_manager</a>
	<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
	</ul>
	<a class="btn btn-warning" href="/tt_match_manager/logout">ログアウト</a> </nav>
	<br>

<!-- コンテンツ -->
<div class="container"><%=request.getAttribute("ERROR") %></div>

	<style>
.container {
	line-height: 300px;
	text-align: center;
	font-size: x-large;
}
</style>

<!-- javascript -->
	<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript"
		src="/tt_match_manager/js/bootstrap.min.js"></script>
</body>
</html>