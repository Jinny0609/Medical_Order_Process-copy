<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기 페이지</title>
<link rel="stylesheet" type="text/css" href="resources/css/Findpassowrd.css">
	<!-- 모달 창을 표시하는 jQuery 코드 -->
<script>
$(document).ready(function() {
  <% if ("passwordPopup".equals(request.getAttribute("viewName"))) { %>
    $("#passwordPopup").load("passwordPopup.jsp", function() {
      $(this).dialog({
        modal: true,
        width: 600,		// 너비 
        height: 450,	// 높이  
        buttons: {
          "확인": function() {
            $(this).dialog("close");
          }
        }
      });
    });
  <% } else if ("error".equals(request.getAttribute("viewName"))) { %>
    $("#error").load("error.jsp", function() {
      $(this).dialog({
        modal: true,
        width: 600,		// 너비
        height: 450,	// 높이 
        buttons: {
          "확인": function() {
            $(this).dialog("close");
          }
        }
      });
    });
  <% } %>
});
</script>
</head>
<%@ include file="include/header.jsp"%>
<body>
	<div class="Find_form">
		<div class="Find_title">
			<h1>비밀번호 찾기</h1>
		</div>
		<div class="Fint_msg">
			<h2>비밀번호를 찾고자 하는 아이디를 입력해주세요.</h2>
		</div>
		<form action="/findpassword" method="post">
		    <div class="boxy1">
		        <input type="text" name="email" placeholder="이메일을 입력하세요." required>
		    </div>
		    <div class="boxy2">
		        <button type="submit" class="Button Login">비밀번호찾기</button>
		        <button type="button" class="Button Register" onclick="location.href='/'">뒤로가기</button>
		    </div>
		</form>
	</div>
	
	<!-- 비밀번호 팝업 모달 창 -->
	<div id="passwordPopup" title="비밀번호" style="display:none;">
	  <p>비밀번호: ${password}</p>
	</div>
	
	<!-- 에러 모달 창 -->
	<div id="error" title="오류" style="display:none;">
	  <p>${errorMessage}</p>
	  <span>class="Copyright">&copy;MarshTit Corp. All rights reserved</span>	
	</div>
</body>

<%@ include file="include/Footer.jsp"%>
</html>