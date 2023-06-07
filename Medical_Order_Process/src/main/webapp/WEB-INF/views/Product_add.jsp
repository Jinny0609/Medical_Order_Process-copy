<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 추가 페이지입니다</title>
<!-- header include -->
<%@ include file="include/header.jsp" %>
<link rel="stylesheet" type="text/css" href="resources/css/Product_add/Product_add.css">
</head>
<body>
	<div class="product_container">
	  <span class="product_add">상품 등록</span> <span class="help">도움말</span> <br>
			  <div class="category_container">
		  <form onsubmit="submitForm(event)">
		    <select>
		      <option value="">카테고리 선택</option>
		      <option value="의료소모품">의료소모품</option>
		      <option value="수술기구">수술기구</option>
		      <option value="의료기기">의료기기</option>
		      <option value="건강용품">건강용품</option>
		      <option value="사무용품">사무용품</option>
		    </select>
		    <br>
		    이미지 : <input type="file" id="imageInput" onchange="previewImage(event)">
		    <div id="imagePreviewContainer"></div>
		    제품명 : <input type="text" id="nameInput"><br>
		    가격 : <input type="text" id="priceInput"><br>
		    <input type="submit" value="등록">
		    <input type="reset" value="취소" id="resetBtn">
		  </form>
		</div>
	</div>
</body>
<!-- javascript -->
<script src="resources/js/Product_add/Product_add.js"></script>
<!-- footer include -->
<%@ include file="include/Footer.jsp" %> 
</html>