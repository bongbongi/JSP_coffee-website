<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://kit.fontawesome.com/92e616dfba.js"></script>
<link href="css/Navbar.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	height: 100vh;
	
	margin: 0 auto;
	padding: 0;
	
	display: flex;
	justify-content: center;
	align-items: center;
	
	text-align: center;
}

form {
	text-align: center;
	width: 400px;
	height: 450px;
	border: 1px solid gray;
	margin: 0 auto;
}
table{
	margin-left:auto;
	margin-right:auto;
}

.fa-mug-hot {
	padding: 8px;
	font-size: 65px;
	color: rgba(102, 12, 12, 0.938);
}

.logo {
	margin: 35px;
}

.logo>i {
	font-size: 65px;
}
</style>
</head>
<body>
<form action="/mem/modify" method="post">
<!-- 로고 자리 -->
<div class="logo">
	<a href="/" id="logo"> <i class="fa-solid fa-mug-hot"></i>
	</a>
</div>
<table>
	<tr row=2>
		<td>ID</td>
		<td>
			<input type="text" value="${ses.id}" name="id" readonly="readonly">
		</td>
	</tr>
		<tr row=2>
		<td>PASSWORD</td>
		<td>
			<input type="text" value="${ses.password}"  name="password">
		</td>
	</tr>
		<tr row=2>
		<td>NAME</td>
		<td>
			<input type="text" value="${ses.name}" name="name">
		</td>
	</tr>
		<tr row=2>
		<td>BIRTH</td>
		<td>
			<input type="text" value="${ses.brith_date}"  name="brith">
		</td>
	</tr>
		<tr row=2>
		<td>GENDER</td>
		<td>
			<input type="text" value="${ses.gender}"  name="gender">
		</td>
	</tr>
		<tr row=2>
		<td>EMAIL</td>
		<td>
			<input type="text" value="${ses.email}"  name="email">
		</td>
	</tr>
		<tr row=2>
		<td>MOBILE</td>
		<td>
			<input type="text" value="${ses.mobile}" name="mobile">
		</td>
	</tr>
	</table>
	<br>
	<a href="/mem/remove?id=${ses.id}" class="btn btn-outline-secondary"><button type="button">회원탈퇴</button></a>
	<button type="submit" class="btn btn-outline-secondary">수정</button>
</form>
</body>
