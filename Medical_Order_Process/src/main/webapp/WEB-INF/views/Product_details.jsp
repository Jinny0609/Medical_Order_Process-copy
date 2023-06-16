<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>제품 상세 페이지</title>
<%@ include file="include/header.jsp"%>
<link href="resources/css/Product_details/OP_list.css" rel="stylesheet">
</head>
<body>
	<div class="I_container">
		<div class="B_itembox">
			<div>
				<img class="I_img" src="resources/img/Product_details/Jsagi.jpg"
					alt="의료용품이미지">
			</div>
			<c:forEach items="${Product_detail}" var="detail">
			<div class="I_Detail">
				<div class="I_title">
					<h4>${detail.product_name}</h4>
				</div>
				<div class="I_ex">
					<span>판매가 </span><span>${detail.product_price}원</span>
				</div>
				<div class="I_ex">
					배송비 <span>2,500원</span> / 주문시결제(선결제)
				</div>
				<div class="S_sun"></div>
				<div>
					<div class="option-container">
						<label class="option-label" onclick="toggleOptionList()">옵션
							▼</label>
						<ul id="optionList" class="option-list">
						<c:forEach items="${Option_name}" var="opname">
							<li onclick="toggleOption(this, ${detail.product_price})">${opname.option_name}</li>
						</c:forEach>
						</ul>
					</div>

					<div id="quantityContainer"></div>

					<div id="priceContainer">
						<div class="priceContainer2">
							<p class="price">
								총 합계금액: <span id="price">0</span>원
							</p>
						</div>
					</div>
				</div>
				<div class="I_BT">
					<button type="button" class="btn btn-outline-primary">장바구니
						담기</button>
					<button type="button" class="btn btn-primary">바로 구매</button>
				</div>
			</div>
			</c:forEach>
		</div>
		<div id="productDescription" class="P_detail">
			<img src="resources/img/Product_details/img_detail.jpg">
		</div>
		<div class="Detail_BT">
			<p id="toggleDescription">제품설명 더보기</p>
		</div>
		<i id="toggleIcon" class="bi bi-arrow-down-short"
			style="font-size: 30px;"></i>
	</div>





	<!-- jQuery 라이브러리 추가 -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
		integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"
		integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V"
		crossorigin="anonymous"></script>
	<script src="resources/js/Product_details/Op_list.js"></script>
	<script src="resources/js/Product_details/S_detail.js"></script>
</body>
</html>