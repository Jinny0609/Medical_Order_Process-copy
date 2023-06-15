<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원정보 수정</title>
    <%@ include file="include/header.jsp"%>
    <link href="resources/css/Order_list/Order_list.css" rel="stylesheet">
    <link href="resources/css/Info_edit/Info_edit.css" rel="stylesheet">
</head>
<body>
<div class="member_container">
    <div>
        <h2>회원정보 수정</h2>
        <form action="updateUserInfo.jsp" method="post">
            <table class="member_Logintable">
                <tbody>
                <tr>
                    <th>아이디(이메일)</th>
                    <td><input type="text" name="email"></td>
                </tr>
                <tr>
                    <th>이름</th>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <th>휴대폰 번호</th>
                    <td><input type="text" name="phone"></td>
                </tr>
                <tr>
                    <th>비밀번호 변경</th>
                    <td><input type="password" name="password"></td>
                </tr>
                </tbody>
            </table>
            <div class="member_table_BT">
                <button class="member_table_BTsumit" type="submit">확인</button>
                <button class="member_table_BTcancel">취소</button>
            </div>
        </form>
    </div>
</div>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
</body>
</html>