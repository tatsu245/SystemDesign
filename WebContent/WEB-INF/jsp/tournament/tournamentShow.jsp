<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="model.Tournament"%>
<%@ page import="java.util.List"%>
<%
	List<Tournament> tournamentList = (ArrayList<Tournament>) request.getAttribute("tournament");
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>tournamentShow</title>
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
	<div class="container">

		<%
			if (tournamentList.size() > 0) {
		%>
		<h2 class="page-header">
			登録済み大会:<%=tournamentList.size()%>件
		</h2>

		<%
			for (Tournament tournament : tournamentList) {
		%>

		<table border="1">
			<tr>
				<th>大会ID</th>
				<th>大会名</th>
				<th>開始日</th>
				<th>終了日</th>
				<th>開催場所</th>
				<!-- <th>登録者</th> -->
				<th>参加対象</th>
			</tr>
			<tr align="center">

				<td><%=tournament.getTournament_id()%></td>

				<td><a href="/tt_match_manager/tournament/show?id=<%=tournament.getTournament_id()%>" class="btn btn-primary">
				<%=tournament.getTournament_name()%></a></td>

				<!-- <form action="/tt_match_manager/tournament/show" method="post">
				<td><%=tournament.getTournament_name()%></a>
				<button class="btn btn-primary" type="submit">ログイン</button>
				</form>

				<form method="post" name="tournamentName" action="/tt_match_manager/tournament/show">
				<input type="hidden" name="tournamentName" value="大会名">
				<a href=""><%=tournament.getTournament_name()%></a>
				</form> -->

				<td><%=tournament.getStart_date()%></td>
				<td><%=tournament.getEnd_date()%></td>
				<td><%=tournament.getPlace()%></td>
				<!-- <td><%=tournament.getTournament_id()%></td> -->
				<td><%=tournament.getParticipant()%></td>

			</tr>
		</table>
		<%
			}
		%>
		<%
			} else {
		%>
		<hr>
		<div class="alert alert-warning">登録されていません．</div>
		<%
			}
		%>
	</div>

</body>
</html>