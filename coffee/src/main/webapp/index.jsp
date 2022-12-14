<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="/css/Navbar.css" rel="stylesheet" type="text/css">
<script src="https://kit.fontawesome.com/92e616dfba.js" 
crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h1 {
	margin: 60px 0px;
	font-size: 24px;
	color: darkgray;
	font-weight: 700;
	text-align: center;
}

.products {
	width: 1000px;
	padding: 0;
	margin-left: auto;
	margin-right: auto;
	margin-bottom: 80px;
	text-align: center;
}

.products>a {
	display: block;
	float: left;
	margin: 0 0 180px;
	font-size: 16px;
}
 .products>a:hover{
	border:1px solid gray;
	border-radius: 0 0 20px 20px;
}

.products>a img {
	width: 300px;
	height: 300px;
}
.products>div{
magin-left:20px;}
/* .products>a:nth-child(3n+2) {
	margin: 0 20px;
}
 */
.products ul {
	text-align: center;
	padding: 0;
	margin: 20px auto 0;
}

.products ul li {
	font-size: 16px; 
}

.products ul li:last-child {
	margin-top: 4px;
}
.new{
	display: flex;
	justify-content: center;
}
.new>a{
	margin-left:50px;
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
               <a href="#">SHOP</a>

               <a href="#">CART</a>

               <a href="/brd/pagelist?writer=${ses.id}">BOARD</a>
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
        <h1>NEW PRODUCTS</h1>
        <div class="products new">
            <a href="#">
                <div>
                    <img src="https://cdn.pixabay.com/photo/2015/05/07/13/46/cappuccino-756490_960_720.jpg" alt="">
                    <ul>
                        <li>coffee</li>
                        <li>49,000</li>
                    </ul>
                </div>
            </a>
            <!-- 여기서 부터 복사 8개 -->
            <a href="#">
                <div>
                    <img src="https://cdn.pixabay.com/photo/2015/05/07/13/46/cappuccino-756490_960_720.jpg" alt="">
                    <ul>
                        <li>coffee</li>
                        <li>89,000</li>
                    </ul>
                </div>
            </a>
            <a href="#">
                <div>
                    <img src="https://cdn.pixabay.com/photo/2015/05/07/13/46/cappuccino-756490_960_720.jpg" alt="">
                    <ul>
                        <li>coffee</li>
                        <li>69,000</li>
                    </ul>
                </div>
            </a>
			</div>
		<h1>BEST PRODUCTS</h1>
       	<div class="products new">
            <a href="#">
                <div>
                    <img src="https://cdn.pixabay.com/photo/2015/05/07/13/46/cappuccino-756490_960_720.jpg" alt="">
                    <ul>
                        <li>coffee</li>
                        <li>49,000</li>
                    </ul>
                </div>
            </a>
            <!-- 여기서 부터 복사 8개 -->
            <a href="#">
                <div>
                    <img src="https://cdn.pixabay.com/photo/2015/05/07/13/46/cappuccino-756490_960_720.jpg" alt="">
                    <ul>
                        <li>coffee</li>
                        <li>89,000</li>
                    </ul>
                </div>
            </a>
            <a href="#">
                <div>
                    <img src="https://cdn.pixabay.com/photo/2015/05/07/13/46/cappuccino-756490_960_720.jpg" alt="">
                    <ul>
                        <li>coffee</li>
                        <li>69,000</li>
                    </ul>
                </div>
            </a>
			</div>
			<div class="products new">
            <a href="#">
                <div>
                    <img src="https://cdn.pixabay.com/photo/2015/05/07/13/46/cappuccino-756490_960_720.jpg" alt="">
                    <ul>
                        <li>coffee</li>
                        <li>49,000</li>
                    </ul>
                </div>
            </a>
            <!-- 여기서 부터 복사 8개 -->
            <a href="#">
                <div>
                    <img src="https://cdn.pixabay.com/photo/2015/05/07/13/46/cappuccino-756490_960_720.jpg" alt="">
                    <ul>
                        <li>coffee</li>
                        <li>89,000</li>
                    </ul>
                </div>
            </a>
            <a href="#">
                <div>
                    <img src="https://cdn.pixabay.com/photo/2015/05/07/13/46/cappuccino-756490_960_720.jpg" alt="">
                    <ul>
                        <li>coffee</li>
                        <li>69,000</li>
                    </ul>
                </div>
            </a>
			</div>
           
        <!-- 여기까지가 본문. -->
        <div class="footer">
       		 <i class="fa-brands fa-github"></i>
            <!-- <i class="fa fa-instagram"></i>
            <i class="fa fa-facebook-f"></i>
            <i class="fa fa-twitter"></i> -->
            <hr>
            모든 이미지는 픽사베이.
            
        </div>
    </div>


</body>
</html>