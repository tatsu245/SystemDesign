<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="model.Tournament"%>
<%@ page import="model.Relation"%>
<%@ page import="java.util.List"%>
<%
	List<Relation> relationList = (ArrayList<Relation>) request.getAttribute("relation");
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
			if (relationList.size() > 0) {
		%>
		<h2 class="page-header">
			大会名:<%=request.getParameter("name")%>
		</h2>

		<%
			for (Relation relation : relationList) {
		%>

		<table border="1">
			<tr>
				<th>選手ID</th>
				<th>選手名</th>
				<th>所属団体</th>
			</tr>
			<tr align="center">

				<td><%=relation.getPlayer_id()%></td>
				<td><%=relation.getPlayer_name()%></td>
				<td><%=relation.getTeam()%></td>

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