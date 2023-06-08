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
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"><!-- 폰트어썸-->
</head>
<body>
<div class="product_container">
	  <span class="product_add">상품 등록</span> <span class="help">도움말</span> <br>
	  <div class="category_container">
	    <form onsubmit="submitForm(event)">
	      <ul class="option-select">
	        <li>
	          <input type="radio" id="category_0" name="category" value="" disabled checked>
	          <label for="category_0">카테고리 선택</label>
	        </li>
	        <li>
	          <input type="radio" id="category_1" name="category" value="의료소모품">
	          <label for="category_1">의료소모품</label>
	        </li>
	        <li>
	          <input type="radio" id="category_2" name="category" value="수술기구">
	          <label for="category_2">수술기구</label>
	        </li>
	        <li>
	          <input type="radio" id="category_3" name="category" value="의료기기">
	          <label for="category_3">의료기기</label>
	        </li>
	        <li>
	          <input type="radio" id="category_4" name="category" value="건강용품">
	          <label for="category_4">건강용품</label>
	        </li>
	        <li>
	          <input type="radio" id="category_5" name="category" value="사무용품">
	          <label for="category_5">사무용품</label>
	        </li>
	      </ul>
	      <br>
	      이미지 : <input type="file" id="imageInput" onchange="previewImage(event)">
	      <div id="imagePreviewContainer"></div>
	      제품명 : <input type="text" id="nameInput"><br>
	      가격 : <input type="text" id="priceInput" oninput="formatPrice()">
	      <div id="optionContainer">
	        <label class="option-label">옵션 : </label>
	        <input type="text" id="option" class="option-input">
	        <button type="button" onclick="addOption()">옵션추가</button><br>
	      </div>
	      <input type="submit" value="등록" id="regi">
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