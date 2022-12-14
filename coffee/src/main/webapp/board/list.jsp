<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
<script src="https://kit.fontawesome.com/92e616dfba.js"
	crossorigin="anonymous"></script>
<link href="/css/Navbar.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>board list</title>
<style type="text/css">

tr, th, td {
	text-align: center;
}

th {
	/* magin: 5px; */
	font-size: 20px;
}

.board_write {
	margin-left: auto;
}

.page-link {
	text-align: center;
	color: gray;
}

.tableBox{
	width: 1000px;
	
	margin-left: auto;
	margin-right: auto;
	margin-top: 50px;
	
}
.pagination{
	justify-content: center;
	align-items: center;
	
	margin-top:25px;
}
.notice{
	background-color: #D8D8D8;
}

</style>
</head>
<body>
	<div>
		<div class="navbar">
			<div>
				<a href="/"><i class="fa-solid fa-mug-hot"></i></a>
			</div>
			<div class="menu">
				<a href="#">SHOP</a> <a href="#">CART</a> <a href="/brd/pagelist?writer=${ses.id}">BOARD</a>
			</div>
			<div class="myinfo">
				<c:if test="${ses.id eq null }">
					<a href="/mem/login" >로그인</a>
					<a href="/mem/join" >회원가입</a>
				</c:if>
      	  		<c:if test="${ses.id eq '관리자' }">
					<a href="/mem/logout" >로그아웃</a>
					<a href="/mem/list" >회원관리</a>
				</c:if>
				<c:if test="${ses.id ne null && ses.id ne '관리자'}" >
					<a href="/mem/logout">로그아웃</a>
					<a href="/mem/detail">내 정보</a>
				</c:if>
			</div>
		</div>
		<!-- main image 자리 -->
		<div class="header"></div>
		<!-- 게시판자리 -->
		<div class="tableBox">
			<table class="table table-hover">
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회수</th>
				</tr>
				<c:forEach items="${list}" var="bvo">
					<c:if test="${bvo.writer eq '관리자' }">
						<tr class="notice">
							<td>${bvo.bno}</td>
							<td><a href="/brd/detail?bno=${bvo.bno}">${bvo.title}</a></td>
							<td>${bvo.writer}</td>
							<td>${bvo.regdate}</td>
							<td>${bvo.read_count}</td>
						</tr>
					</c:if>
					<c:if test="${bvo.writer ne '관리자' }">
						<tr>
							<td>${bvo.bno}</td>
							<td><a href="/brd/detail?bno=${bvo.bno}">${bvo.title}</a></td>
							<td>${bvo.writer}</td>
							<td>${bvo.regdate}</td>
							<td>${bvo.read_count}</td>
						</tr>
					</c:if>
				</c:forEach>
			</table>
		</div>
		<nav aria-label="Page navigation example" class="pagingNav">
				<ul class="pagination">
				<c:if test="${pgh.prev }">
					<li class="page-item">
					<a class="page-link" aria-label="Previous"
					href="/brd/page?pageNo=${pgh.startPage-1 }&qty=${pgh.pvo.qty }"> 
						<span aria-hidden="true">&laquo;</span>
					</a></li>
				</c:if>
				<c:forEach begin="${pgh.startPage}" end="${pgh.endPage}" var="i">
					<li class="page-item">
						<a class="page-link" href="/brd/page?pageNo=${i}&qty=${pgh.pvo.qty}">
						${i }
						</a>
					</li>
				</c:forEach>
				<c:if test="${pgh.next }">
					<li class="page-item"><a class="page-link" aria-label="Next" 
						href="/brd/page?pageNo=${pgh.endPage+1 }&qty=${pgh.pvo.qty }"> 
						<span aria-hidden="true">&raquo;</span>
					</a></li>
				</c:if>
				</ul>
			</nav>
		<c:if test="${ses.id ne null}">
			<a class=board_write href="/brd/register"><button type="button">글작성</button></a>
		</c:if>	
	</div>
	<footer> 
	
	</footer>
</body>
</html>

