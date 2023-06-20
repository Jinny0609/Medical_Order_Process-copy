<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Gothic+A1:wght@300&display=swap" rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="resources/css/Findpassword2.css">
</head>
<%@ include file="include/header.jsp"%>
<body>
	<div class="Main">
		<div>
			<p class="Main_ps">비밀번호:${password}</p>
		</div>
		<input type="button" value="로그인 페이지로 이동" class="Button Login"
			onclick="location.href='/Login'">
	</div>
</body>
<%@ include file="include/Footer.jsp"%>
</html>