<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 페이지</title>
<link href="resources/css/admin.css" rel="stylesheet">
</head>
<body>
<div class="BT_box">
<div class="BT_set">
<button class="admin_BT1" onclick="goToAdminListPage()">관리자 리스트 페이지 이동하기</button>
<button class="admin_BT2" onclick="goToAdminRegistrationPage()">관리자 물품 등록 페이지 이동하기</button>
</div>
<button class="admin_BT3" onclick="goBack()">뒤로 가기</button>
</div>
<script>
  function goToAdminListPage() {
    location.href = "Order_history"; // 관리자 리스트 페이지의 경로를 여기에 입력하세요.
  }

  function goToAdminRegistrationPage() {
    location.href = "Product_add"; // 관리자 물품 등록 페이지의 경로를 여기에 입력하세요.
  }
  function goBack() {
	    window.history.back(); // 페이지 뒤로 가기 기능 실행
	  }
</script>
</body>
</html>