<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- CSS -->
<link rel="stylesheet" href="/tt_match_manager/css/bootstrap.min.css">
<link  rel="stylesheet" href="/tt_match_manager/font/css/open-iconic-bootstrap.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>
<body>
	<!-- ナビゲーションバー -->
	<nav class="navbar navbar-dark bg-dark"> <a class="navbar-brand"
		href="/tt_match_manager/">tt_match_manager</a> </nav>
	<br>
	<!-- コンテンツ -->
	<div class="container">
		<h1 class="page-header">ログイン</h1>
		<form action="/tt_match_manager/login" method="post">
			<div class="form-group">
				<label for="userId">ユーザーID</label> <input class="form-control"
					type="text" name="userId" id="userId">
			</div>
			<div class="form-group">
				<label for="password">パスワード</label> <input class="form-control"
					type="password" name="password" id="password">
			</div>
			<button class="btn btn-primary" type="submit">ログイン</button>
		</form>
		<hr>
		新規ユーザー登録は<a href="/tt_match_manager/user">こちら</a>から
	</div>
<!-- javascript -->
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/tt_match_manager/js/bootstrap.min.js"></script>
</body>
</html>