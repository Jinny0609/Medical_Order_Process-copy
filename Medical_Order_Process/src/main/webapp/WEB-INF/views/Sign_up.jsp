<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/Sign_up.css">
<script src="https://kit.fontawesome.com/0d51ab0f86.js"
	crossorigin="anonymous"></script>
</head>
<body>
 <c:forEach var="code" items="${Hcode}">
<input type="hidden" class="hcode-input" value="${code}">
 </c:forEach>
	<form action="/Sign_up" class="register-form" method="POST"
		onsubmit="return Validation()">
		<div class="logo-container">
			<a href="/"> <img src="resources/img/MarshLogo.png" alt="쿠팡로고"
				width="174" height="39">
			</a>
		</div>
		<div class="section-title">회원정보를 입력해주세요</div>
		<label class="input-container"> <i
			class="icon fa-solid fa-envelope"></i> <input autofocus class="input"
			maxlength="50" id="email" name="email_id" placeholder="아이디(이메일)"
			type="email">
		</label>
		<div id="EmailErrorMsg" class="ErrorMsg1"></div>
		<label class="input-container"> <i
			class="icon fa-solid fa-key"></i> <input class="input" maxlength="50"
			id="pw" name="password" placeholder="비밀번호" type="password">
		</label>
		<div id="PWErrorMsg" class="ErrorMsg2"></div>
		<label class="input-container"> <i
			class="icon fa-solid fa-lock"></i> <input class="input"
			maxlength="50" id="cpw" name="confirmPassword" placeholder="비밀번호 확인"
			type="password">
		</label>
		<div id="CPWErrorMsg" class="ErrorMsg3"></div>
		<label class="input-container"> <i
			class="icon fa-solid fa-user"></i> <input class="input"
			maxlength="50" id="name" name="name" placeholder="이름" type="text">
		</label>
		<div id="NameErrorMsg" class="ErrorMsg4"></div>
		<label class="input-container"> <i
			class="icon fa-solid fa-phone"></i> <input class="input"
			maxlength="11" id="phone" name="phonenum" placeholder="휴대폰 번호"
			type="tel">
		</label>
		<div id="PhoneErrorMsg" class="ErrorMsg5"></div>
		<label class="input-container"> <i
			class="icon fa-solid fa-lock"></i> <input class="input"
			maxlength="50" name="hcode" placeholder="병원 코드" type="password">
		</label>
		<div id="McodeErrorMsg" class="ErrorMsg6"></div>
		<div class="line"></div>
		<p>
			<label class="input-primary"> <input type="checkbox">
				<span>개인정보사용동의.</span>
			</label>
		</p>
		<input class="button register" type="submit" value="가입하기"> <span
			class="copyright">&copy;MarshTit Corp. All rights reserved</span>
	</form>
<script src="resources/js/Sign_up.js"></script>
</body>
</html>
