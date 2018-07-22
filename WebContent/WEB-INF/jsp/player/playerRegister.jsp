<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>playerRegister</title>
</head>
<body>
	<!-- ナビゲーションバー -->
	<nav class="navbar navbar-dark bg-dark"> <a class="navbar-brand"
		href="/tt_match_manager/">tt_match_manager</a>
	<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
	</ul>
	<a class="btn btn-warning" href="/tt_match_manager/logout">logout</a> </nav>
	<br>
	<!-- コンテンツ -->
	<div class="container">
		<h2>選手登録</h2>
		<hr>
		<form action="/tt_match_manager/player/register" method="post">
			<div class="form-group">
				<label for="playerName">選手名</label> <input class="form-control"
					type="text" name="playerName" id="playerName">
			</div>
			<!-- <div class="form-group">
				<label for="userName">生年月日</label> <input class="form-control"
					type="text" name="userName" id="userName">
			</div> -->
			<div class="form-group">
				<label for="birthday">生年月日</label> <input type="date"
					name="birthday" max="9999-12-31">
			</div>

			<div class="form-group">
				<label for="tall">身長</label> <input class="form-control"
					type="text" name="tall" id="tall">
			</div>
			<h6>＊半角数字(ex.170)</h6>

			<div class="form-group">
				<label for="weight">体重</label> <input class="form-control"
					type="text" name="weight" id="weight">
			</div>
			<h6>＊半角数字(ex.170)</h6>

			<div class="form-group">
				<label for="team">所属団体名</label> <input class="form-control"
					type="text" name="team" id="team">
			</div>
			<button type="submit" class="btn btn-primary">登録</button>
	</div>
</body>
</html>