<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://kit.fontawesome.com/92e616dfba.js"></script>
<link href="css/Navbar.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
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
<form action="/mem/insert" method="post">
	<a href="/" id="logo"> 
		<i class="fa-solid fa-mug-hot"></i>
	</a><br>
<input type="text" name="id" placeholder="ID"><br>
<input type="text" name="password" placeholder="password"><br>
<input type="text" name="name" placeholder="name"><br>
<input type="text" name="brith" placeholder="brith"><br>
<input type="text" name="gender" placeholder="gender"><br>
<input type="email" name="email" placeholder="email"><br>
<input type="text" name="mobile" placeholder="mobile"><br><br>
<button type="submit">가입</button>
</form>
</body>
</html>