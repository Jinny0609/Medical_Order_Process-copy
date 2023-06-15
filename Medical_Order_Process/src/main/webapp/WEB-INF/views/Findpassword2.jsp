<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@ include file="include/header.jsp"%>
<body>
<div>
<p>비밀번호:${password}</p>
</div>
<input type="button" value="로그인 페이지로 이동" onclick="location.href='/Login'">
</body>
<%@ include file="include/Footer.jsp"%>
</html>