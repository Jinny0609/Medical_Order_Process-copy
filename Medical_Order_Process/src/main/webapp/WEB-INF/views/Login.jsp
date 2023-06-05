<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>로그인</title>
    <link href="resources/css/Login.css" rel="stylesheet">
    <script src="login.js"></script>
    <script src="https://kit.fontawesome.com/0d51ab0f86.js" crossorigin="anonymous"></script>
</head>
<body>
<form class="Login-form" method="post" onsubmit="return validateLogin()">
    <div class="Logo-container">
        <img class="Logo" src="resources/img/MarshLogo.png">
    </div>
    <label class="Input-container">
        <i class="icon fa-solid fa-envelope"></i>
        <span hidden>이메일</span>
        <input autofocus class="Input" id="User"maxlength="50" name="email" placeholder="아이디(이메일)" type="email">
    </label>
    <label class="Input-container">
        <i class="icon fa-solid fa-key"></i>
        <span hidden>비밀번호</span>
        <input class="Input" id="Pass" maxlength="50" name="password" placeholder="비밀번호" type="password">
    </label>
    <div class="Sub">
        <label class="Autosign-container">
            <input class="Checkbox" name="autosign" type="checkbox">
            <span class="Checker">
                <i class="icon fa-solid fa-check"></i>
            </span>
            <span class="Text">아이디기억하기</span>
        </label>
        <a class="Link" href="user/recove">아이디(이메일)/비밀번호 찾기</a>
    </div>
    <input class="Button Login" type="submit" value="로그인" >
    <div class="Line"></div>
    <a class="Button register" href="user/register">회원가입</a>
    <span class="Copyright">&copy;MarshTit Corp. All rights reserved</span>
</form>
</body>
</html>
