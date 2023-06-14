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
        <div class="dropdown_menu">
		  <div class="select-wrapper">
		    <div class="selected">Select a category</div>
		    <ul class="options">
		      <li data-value="의료소모품">의료소모품</li>
		      <li data-value="수술기구">수술기구</li>
		      <li data-value="의료기기">의료기기</li>
		      <li data-value="건강용품">건강용품</li>
		      <li data-value="사무용품">사무용품</li>
		    </ul>
		  </div>
		  <input type="hidden" id="categoryInput" name="category">
		</div>
        
        <div class="product_details">
	      <div class="image_input">
		    <label>이미지 : </label>
		    <div class="file_input">
		        <div class="custom-file-input">
		            <input type="text" id="fileText" disabled>
		            <input type="file" id="imageInput" onchange="previewImage(event)">
		            <button type="button">파일 선택</button>
		        </div>
		    </div>
		    <div id="imagePreviewContainer"></div>
		   </div>
					
          <div class="input_field">
            <label for="nameInput">제품명 : </label>
            <input type="text" id="nameInput">
          </div>
          
          <div class="price_field">
            <label for="priceInput">가격 : </label>
            <input type="text" id="priceInput" oninput="formatPrice()">
          </div>
          
         <div class="count_field">
		    <label for="countInput">수량 : </label>
		    <input type="number" id="countInput" min="0">
		    <span id="countErrorMessage" style="display: none; color: red;">최대 수량은 30입니다.</span>
		 </div>
          
          <div class="optionContainer">
			  <label class="option-label">옵션 : </label>
			  <input type="text" id="option" class="option-input">
			  <button type="button" onclick="addOption()" class="option-add">옵션 추가</button>
			  <div id="addedOptionsContainer"></div> <!-- 추가된 옵션들을 위한 새로운 컨테이너 -->
		  </div>
          
          <div class="buttons">
            <input type="submit" value="등록" id="regi">
            <input type="reset" value="초기화" id="resetBtn">
            <input type="button" value="취소" id="cancel">
          </div>
          
        </div>
      </form>
    </div>
  </div>
</body>
<!-- javascript -->
<script src="resources/js/Product_add/Product_add.js"></script>
<!-- footer include -->
<%@ include file="include/Footer.jsp" %> 
</html>