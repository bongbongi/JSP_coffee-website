<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://kit.fontawesome.com/92e616dfba.js"></script>
<link href="/css/Navbar.css?after" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>login</title>
<style>
body{
	height: 100vh;
	
	margin:0 auto;
	padding:0;

	display: flex;
	justify-content: center;
	align-items : center;
}
form {
	text-align: center;
	
    width: 300px;
    height: 300px;
    
    border: 1px solid gray;
	margin: 0 auto;

}
.logo{
	margin: 35px;
}
.logo>i{
	font-size:65px;
}
#join{
	color:gray;
}

.fa-mug-hot{
	padding:8px;
	font-size:65px;
	color:rgba(102, 12, 12, 0.938);
	
}
</style>
</head>
<body>
		<form action="/mem/loginOk" method="post">
			<!-- 로고 자리 -->
			<div class="logo">
				<a href="/" id="logo"> <i class="fa-solid fa-mug-hot"></i>
				</a>
			</div>
			<input type="text" name="id" placeholder="아이디"><br> 
			<input type="password" name="password" placeholder="비밀번호"><br><br>
			<button type="submit" class="btn btn-outline-secondary">로그인</button><br><br> 
			<a href="/mem/join" id="join">회원가입</a>
		</form>
</body>
</html>