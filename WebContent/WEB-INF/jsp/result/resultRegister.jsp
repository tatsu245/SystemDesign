<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- CSS -->
<link rel="stylesheet" href="/tt_match_manager/css/bootstrap.min.css">
<link  rel="stylesheet" href="/tt_match_manager/font/css/open-iconic-bootstrap.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>resultRegister</title>
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
		<h2>試合結果登録</h2>
		<hr>
		<form action="/tt_match_manager/result/register" method="post">
		<div class="form-group">
				<label for="playerName">選手名</label> <input type="text"
					name="playerName" id="playerName">
			</div>

			<div class="form-group">
				<label for="resultDate">対戦日</label> <input type="date"
					name="resultDate" max="9999-12-31">
			</div>

			<div class="form-group">
				<label for="tournamentName">大会名</label> <input class="form-control"
					type="text" name="tournamentName" id="tournamentName">
			</div>

			<div class="form-group">
				<label for="count"></label>ゲームカウント（自分の点数 ー 相手の点数）*半角数字<input class="form-control"
					type="text" name="count" id="count">
			</div>

			<div class="form-group">
				<label for="matchPlace">対戦位置（ex.準決勝）</label> <input class="form-control"
					type="text" name="matchPlace" id="matchPlace">
			</div>

			<div class="form-group">
				<label for="opponentName">対戦相手</label> <input class="form-control"
					type="text" name="opponentName" id="opponentName">
			</div>

			<div class="form-group">
				<label for="matchForm">試合形式（ex.シングルス）</label> <input class="form-control"
					type="text" name="matchForm" id="matchForm">
			</div>

			<button type="submit" class="btn btn-primary">登録</button>
	</div>
<!-- javascript -->
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/tt_match_manager/js/bootstrap.min.js"></script>
</body>
</html>