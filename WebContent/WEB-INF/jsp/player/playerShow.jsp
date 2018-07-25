<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Player"%>
<%
	//ここでリクエストスコープを受け取る
	//getAttributeメソッド
	//追加した属性を取り出す
	Player player = (Player) request.getAttribute("player");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>playerShow</title>
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
		<h2>選手検索結果</h2>
		<hr>
		<table border="1">
			<tr>
				<th>選手名</th>
				<th>生年月日</th>
				<th>身長</th>
				<th>体重</th>
				<th>所属団体</th>
			</tr>
			<tr align="center">
				<td><%=player.getPlayer_name()%></td>
				<td><%=player.getDate()%></td>
				<td><%=player.getTall()%></td>
				<td><%=player.getWeight()%></td>
				<td><%=player.getTeam()%></td>
			</tr>
		</table>
		<br>
		<br>

		<!-- <form action="/tt_match_manager/tournament/playerTournamentRelation" method="post">
		<div class="form-group">
				<label for="tournamentName"><%=player.getPlayer_name() %>が出場した大会を登録</label> <br>
				<input class="form-control" type="text" name="tournamentName" id="tournamentName">
			</div> -->
		<a href="/tt_match_manager/tournament/playerTournamentRelation" class="btn btn-primary"><%=player.getPlayer_name() %>が出場した大会を登録する</a>
		<br>
	</div>
</body>
</html>