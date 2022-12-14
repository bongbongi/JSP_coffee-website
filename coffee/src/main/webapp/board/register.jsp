<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/brd/insert" method="post">
			<input type="hidden" name="bno"><br>
		글제목<input type="text" value="re : ${bvo.title }" name="title"><br>
		작성자<input type="text" value="${ses.id}" name="writer" readonly="readonly"><br>
		내용<input type="text" name="content"><br>
		파일첨부<input type="text" name="image_file"><br>
		
		<a href="/brd/list"><button type="button">취소</button></a>
		<button type="submit">작성</button> 
	</form>
</body>
</html>