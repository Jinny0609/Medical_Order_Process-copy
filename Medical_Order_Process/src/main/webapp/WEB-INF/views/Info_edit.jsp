<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Document</title>
<%@ include file="include/header.jsp"%>
<link href="resources/css/Order_list/Order_list.css" rel="stylesheet">
<link href="resources/css/Info_edit/Info_edit.css" rel="stylesheet">
</head>
<body>
	<div class="member_container">
	<div>
	<h2>회원정보확인</h2>
	<p>회원님의 정보를 안전하게 보호하기 위해 비밀번호를 다시 한번 확인 합니다.</p>
	<form action="/Info_edit_Form" method="POST">
	<%
		// 세션에서 user_id 가져오기
		int user_id = (int) session.getAttribute("user_id");
	%>
	<input type="hidden" name="user_id" value="<%= user_id %>"> <!-- 숨겨진 필드 추가 -->
	<table class="member_Logintable">
	<tbody>
	<tr>
	<th>아이디(이메일)</th>
	<td><input type="text" name="email_id" style="border: none" value="${User_date.email_id}" readonly></td>
	</tr>
	<tr>
	<th>비밀번호</th>
	<td><input type="text" name="password"></td>
	</tr>
	</tbody>
	</table>
	<div class="member_table_BT">
	<button type="submit" class="member_table_BTsumit">확인</button>
	<button class="member_table_BTcancel">취소</button>
	</div>
	</form>
	</div>
	</div>
	
	
	<script
		src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
</body>
</html>