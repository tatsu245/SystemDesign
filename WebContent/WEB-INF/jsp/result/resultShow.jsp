<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = "model.Result" %>
<%//ここでリクエストスコープを受け取る
//getAttributeメソッド
//追加した属性を取り出す
Result result = (Result) request.getAttribute("result");
%>
<!-- CSS -->
<link rel="stylesheet" href="/hazelabBBS/css/bootstrap.min.css">
<link  rel="stylesheet" href="/hazelabBBS/font/css/open-iconic-bootstrap.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>resultShow</title>
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
		<h2>戦績検索結果</h2>
		<hr>
		<table border="1">
			<tr>
				<th>選手名</th>
				<th>対戦日</th>
				<th>ゲームカウント</th>
				<th>開催場所</th>
				<th>大会名</th>
				<th>対戦相手名</th>
				<th>対戦形式</th>
			</tr>
			<tr align="center">
			<td><%=result.getPlayer_name()%></td>
			<td><%=result.getResult_date() %></td>
			<td><%=result.getCount() %></td>
			<td><%=result.getMatch_place() %></td>
			<td><%=result.getTournament_name() %></td>
			<td><%=result.getOpponent_name() %></td>
			<td><%=result.getMatch_form() %></td>
			</tr>
		</table>
	</div>
<!-- javascript -->
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/tt_match_manager/js/bootstrap.min.js"></script>
</body>
</html>