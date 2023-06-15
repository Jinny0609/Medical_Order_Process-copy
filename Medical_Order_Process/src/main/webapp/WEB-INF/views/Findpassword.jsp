<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기 페이지</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<link rel="stylesheet" type="text/css" href="resources/css/Findpassowrd.css">
<!-- jQuery 라이브러리 추가 -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<!-- jQuery UI 라이브러리 추가 -->
<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
</head>
<%@ include file="include/header.jsp"%>
<body>
	<div class="Find_form">
		<div class="Find_form1">
			<div class="Find_title">
				<h1 class="Find_title1">비밀번호 찾기</h1>
			</div>
			<div class="Find_msg">
				<h2 class="Find_msg1">비밀번호를 찾고자 하는 아이디를 입력해주세요.</h2>
			</div>
			<form action="/Findpassword" method="post">
				<div class="boxy1">
					<input type="text" name="email_id" placeholder="이메일을 입력하세요." required>
				</div>
				<div class="boxy2">
					 <button id="submit" type="submit" class="Button Login">비밀번호 찾기</button>
      			     <button type="button" class="Button Register" onclick="location.href='/Login'">뒤로가기</button>
				</div>
			</form>
		</div>
	</div>
	
</body>

<%@ include file="include/Footer.jsp"%>
</html>