<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- CSS -->
<link rel="stylesheet" href="/tt_match_manager/css/bootstrap.min.css">
<link  rel="stylesheet" href="/tt_match_manager/font/css/open-iconic-bootstrap.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>menu</title>
</head>
<body>
	<!-- ナビゲーションバー -->
	<nav class="navbar navbar-dark bg-dark"> <a class="navbar-brand"
		href="/tt_match_manager/">tt_match_manager</a>
	<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
	</ul>
	<a class="btn btn-warning" href="/tt_match_manager/logout" >logout</a>
	</nav>
	<br>
	<!-- コンテンツ -->
	<div class="container">
		<h2>メニュー</h2>
		<hr>
		<!-- <a hrdf="URL" ></a> HTML指定のページにジャンプすることができる。-->
		<a href="/tt_match_manager/result/search" class="btn btn-primary">試合結果検索</a>
		<br>
		<br>
		<a href="/tt_match_manager/player/register" class="btn btn-primary">選手登録</a>
		<br>
		<br>
		<a href="/tt_match_manager/tournament/register" class="btn btn-primary">大会登録</a>
		<br>
		<br>
		<a href="/tt_match_manager/result/register" class="btn btn-primary">試合結果登録</a>
		<br>
		<br>
		<a href="/tt_match_manager/player/search" class="btn btn-primary">選手検索</a>
		<br><br>
		<a href="/tt_match_manager/tournament/show" class="btn btn-primary">大会一覧</a>
		<br><br>
	</div>
<!-- javascript -->
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/tt_match_manager/js/bootstrap.min.js"></script>
</body>
</html>
