<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Document</title>
<%@ include file="include/header.jsp"%>
<link href="resources/css/Order_list/Order_list.css" rel="stylesheet">
<link href="resources/css/Shipping_address/Shipping_address_List.css"
	rel="stylesheet">
</head>
<body>
	<div class="MY_container">
		<div class="MY_nav">
			<div class="H_nav">
				<h2>MY TIT</h2>
			</div>
			<div class="M_nav">
				<h3>MY 정보</h3>
				<ul>
					<li><a href="/Order_list">주문목록/배송조회<br>취소/환불
					</a></li>
					<li><a href="/Info_edit">개인정보확인/수정</a></li>
					<li><a href="/Shipping_address_List">배송지 관리</a></li>
				</ul>
			</div>
		</div>
		<div class="MY_privacy">
			<div class="MY_navcontainer">
				<div class="MY_navbox">
					<p>배송 준비</p>
					<span>0건</span>
				</div>
				<div>
					<i class="bi bi-caret-right fs-3 text-white"></i> <i
						class="bi bi-caret-right-fill fs-3 text-white"></i> <i
						class="bi bi-caret-right fs-3 text-white"></i>
				</div>
				<div class="MY_navbox">
					<p>배송 중</p>
					<span>1건</span>
				</div>
				<div>
					<i class="bi bi-caret-right fs-3 text-white"></i> <i
						class="bi bi-caret-right-fill fs-3 text-white"></i> <i
						class="bi bi-caret-right fs-3 text-white"></i>
				</div>
				<div class="MY_navbox">
					<p>배송 완료</p>
					<span>0건</span>
				</div>
			</div>
			<!-- 여기서부터 바꿀 내용 들어갑니다.-->
			<div class="MY_delivery">
				<div class="Shipping_Card_Box">
					<c:forEach items="${addresses}" var="address">
						<div class="Shipping_Card_Solid">
							<div class="Shipping_Card_Text">
								<div class="Shipping_Card_Title">
									<strong>${address.recive}</strong>
								</div>
								<div>${address.pscode}</div>
								<div>${address.address_road}</div>
								<div>${address.address_detail}</div>
								<div>${address.phonenum}</div>
								<div>${address.request}</div>
								<button class="Shipping_Card_BT"
									onclick="redirectToPage('${address.address_id}')">수정</button>
							</div>
						</div>
					</c:forEach>
					<c:if test="${empty addresses}">
						<script>
							window.onload = function() {
								alert('배송지를 등록하세요');
							};
						</script>
					</c:if>
					<div class="Shipping_BT" onclick="redirectToJSP()">
						<i class="bi bi-plus-lg fs-5"></i>배송지 추가 버튼
					</div>
				</div>
			</div>
		</div>
	</div>
	<script
		src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script src="resources/js/Shipping_address/address.js"></script>
</body>
</html>