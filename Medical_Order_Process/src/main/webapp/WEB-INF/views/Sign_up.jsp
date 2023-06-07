<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/Sign_up.css">
<script src="https://kit.fontawesome.com/0d51ab0f86.js" crossorigin="anonymous"></script>
</head>
<body>
 <form class="register-form" method="post">
        <div class="logo-container">
            <img src="resources/img/MarshLogo.png" class="logo">
        </div>
        <div class="section-title">회원정보를 입력해주세요</div>
        <label class="input-container">
            <i class="icon fa-solid fa-envelope"></i>
            <span hidden>이메일</span>
            <input autofocus class="input" maxlength="50" name="email" placeholder="아이디(이메일)" type="email">
        </label>
        <label class="input-container">
            <i class="icon fa-solid fa-key"></i>
            <span hidden>비밀번호</span>
            <input class="input" maxlength="50" name="password" placeholder="비밀번호" type="password">
        </label>
        <label class="input-container">
            <i class="icon fa-solid fa-lock"></i>
            <span hidden>비밀번호 확인</span>
            <input class="input" maxlength="50" name="password" placeholder="비밀번호 확인" type="password">
        </label>
        <label class="input-container">
            <i class="icon fa-solid fa-user"></i>
            <span hidden>이름</span>
            <input class="input" maxlength="50" name="name" placeholder="이름" type="text">
        </label>
        <label class="input-container">
            <i class="icon fa-solid fa-phone"></i>
            <span hidden>휴대폰 번호</span>
            <input class="input" maxlength="10" name="tel" placeholder="휴대폰 번호" type="tel">
        </label>
        <label class="input-container">
            <i class="icon fa-solid fa-lock"></i>
            <span hidden>병원 코드</span>
            <input class="input" maxlength="50" name="password" placeholder="병원 코드" type="password">
        </label>
        <div class="line"></div>
        <p>
        <label class="input-primary">
            <input type="checkbox">
    		<span>개인정보사용동의.</span>
        </label>
        </p>
        <input class="button register" type="submit" value="가입하기">
        <span class="copyright">&copy;MarshTit Corp. All rights reserved</span>
    </form>
   
    	
    
</body>
</html>