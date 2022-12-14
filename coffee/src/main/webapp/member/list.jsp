<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>id</th>
		<th>name</th>
		<th>brith</th>
		<th>email</th>
		<th>mobile</th>
		<th>휴먼</th>
		<th>삭제</th>
	</tr>
	<c:forEach items="${list}" var="mvo">
		<tr>
		<td>${mvo.id}</td>
		<td>${mvo.name}</td>
		<td>${mvo.brith_date}</td>
		<td>${mvo.email}</td>
		<td>${mvo.mobile}</td>
		<td><a href=""></a>○</td>
		<td><a href="/mem/remove?id=${mvo.id}">○</a></td>
		</tr>
	</c:forEach>
</table>
<a href="/">메인 이동</a>
</body>
</html>