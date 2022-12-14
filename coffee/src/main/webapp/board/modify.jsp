<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/brd/update" method="post">
<input type="hidden" value="${bvo.bno}" name="bno"><br>
글제목<input type="text" value="${bvo.title}" name="title"><br>
작성자<input type="text" value="${bvo.writer}" name="writer" readonly="readonly"><br>
내용<input type="text" value="${bvo.content}" name="content"><br>
파일첨부<input type="text" value="${bvo.image_file}" name="image_file"><br>
<a href="/brd/list"><button type="button">취소</button></a>
<button type="submit">수정</button> 
</form>
</body>
</html>