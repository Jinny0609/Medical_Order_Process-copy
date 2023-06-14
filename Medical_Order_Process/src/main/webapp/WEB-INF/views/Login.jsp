<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>로그인</title>
    <link href="resources/css/Login.css" rel="stylesheet">
    <script src="https://kit.fontawesome.com/0d51ab0f86.js" crossorigin="anonymous"></script>
    <script src="resources/js/Login.js"></script>
    <script>
        window.onload = function() {
            // 아이디 기억하기 체크박스 요소
            var rememberMeCheckbox = document.getElementById('RememberMe');
            // 이전에 저장된 아이디 가져오기
            var savedId = localStorage.getItem('rememberedId');
            if (savedId) {
                rememberMeCheckbox.checked = true;
                document.getElementById('Email').value = savedId;
            }

            // 폼 전송 이벤트 처리
            document.getElementById('LoginForm').addEventListener('submit', function() {
                if (rememberMeCheckbox.checked) {
                    var enteredId = document.getElementById('Email').value;
                    localStorage.setItem('rememberedId', enteredId);
                } else {//체크박스 헤제시 아이디값 제거
                    localStorage.removeItem('rememberedId');
                }
            });
        };
    </script>
</head>
<body>
<form id="LoginForm" class="Login-form" method="post" onsubmit="return Validation()">
    <div class="Logo-container">
        <img class="Logo" src="resources/img/MarshLogo.png">
    </div>
    <div class="Input-container">
        <i class="icon fa-solid fa-envelope"></i>
        <span hidden>이메일</span>
        <input id="Email" class="Input" maxlength="50" name="email_id" placeholder="아이디(이메일)" type="email">
        <div id="emailErrorMsg" class="ErrorMsg"></div>
    </div>
    <div class="Input-container">
        <i class="icon fa-solid fa-key"></i>
        <span hidden>비밀번호</span>
        <input id="Password" class="Input" maxlength="50" name="password" placeholder="비밀번호" type="password">
        <div id="passwordErrorMsg" class="ErrorMsg"></div>
    </div>
    <div class="Sub">
        <label class="Autosign-container">
            <input id="RememberMe" class="Checkbox" name="rememberMe" type="checkbox">
            <span class="Checker">
                <i class="icon fa-solid fa-check"></i>
            </span>
            <span class="Text">아이디 기억하기</span>
        </label>
        <a class="Link" href="#">아이디(이메일)/비밀번호 찾기</a>
    </div>
    <input class="Button Login" type="submit" value="로그인">
    <div class="Line"></div>
    <a class="Button register" href="user/register">회원가입</a>
    <span class="Copyright">&copy;MarshTit Corp. All rights reserved</span>
</form>
</body>
</html>
