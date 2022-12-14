<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://kit.fontawesome.com/92e616dfba.js"></script>
<link href="/css/Navbar.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
<style type="text/css">
table {
	margin-left: auto;
	margin-right: auto;
}

tr, td, th {
	text-align: center;
}

.topBtn {
	text-align: right;
}
</style>
</head>
<body>
	<div class="navbar">
		<div>
			<a href="/"><i class="fa-solid fa-mug-hot"></i></a>
		</div>
		<div class="menu">
			<a href="#">SHOP</a> <a href="#">CART</a> <a href="/brd/list">BOARD</a>
		</div>
		<div class="myinfo">
			<c:if test="${ses.id eq null }">
				<a href="/mem/login">로그인</a>
				<a href="/mem/join">회원가입</a>
			</c:if>
			<c:if test="${ses.id ne null }">
				<a href="/mem/logout">로그아웃</a>
				<a href="/mem/detail">내 정보</a>
			</c:if>
		</div>
	</div>
	<div class="header"></div>
	<table>
		<tr>
			<td>제목</td>
			<td>${bvo.title}</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${bvo.writer}</td>
		</tr>
		<tr>
			<td>작성일</td>
			<td>${bvo.regdate}</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>${bvo.content}</td>
		</tr>
		<tr>
			<td>파일</td>
			<td>${bvo.image_file}</td>
		</tr>
	</table>
	<a href="/brd/pagelist?writer=${ses.id}"><button type="button">나가기</button></a>
	<br>
	<c:if test="${ses.id eq bvo.writer }">
		<a href="/brd/modify?bno=${bvo.bno}"><button type="button">수정</button></a>
		<a href="/brd/remove?bno=${bvo.bno}"><button type="button">삭제</button></a>
		<br>
	</c:if>
	<c:if test="${ses.id eq '관리자' }">
		<a href="/brd/register?bno=${bvo.bno}"><button type="button">답글</button></a>
	</c:if>
	<a href="" class="topBtn">▲TOP</a>
</body>
</html>