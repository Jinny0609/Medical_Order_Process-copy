<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Document</title>
<%@ include file="include/header.jsp"%>
<link href="resources/css/Order_list/Order_list.css" rel="stylesheet">
<link href="resources/css/Shipping_address/Shipping_address_New.css"
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
			<form action="/saveAddress" method="get">
			<div class="MY_delivery">
				<div class="MY_jeongbo_BOX">
					<div class="MY_jeongbo_IKON">
						<i class="bi bi-person-circle fs-3"></i>
					</div>
					<div>
						<input type="text" name="recive" class="MY_jeongbo_INPUT" placeholder="받는 사람">
					</div>
				</div>
				<div class="MY_jeongbo_BOX">
					<div class="MY_jeongbo_IKON">
						<i class="bi bi-geo-alt fs-3"></i>
					</div>
					<div>
						<div class="MY_jeongbo_INPUT" id="MY_jeongbo_UPAN">
							<input type="text" name="pscode" id="zip-code" placeholder="우편번호"> <input
								type="button" class="MY_jeongbo_BT" onclick="execDaumPostcode()"
								value="우편번호 찾기">
						</div>
						<div>
							<input type="text" name="address_road" class="MY_jeongbo_INPUT" id="address-1"
								placeholder="도로명주소">
						</div>
						<div>
							<input type="text" name="address_detail" class="MY_jeongbo_INPUT" id="address-2"
								placeholder="상세주소">
						</div>
					</div>
				</div>
				<div class="MY_jeongbo_BOX">
					<div class="MY_jeongbo_IKON">
						<i class="bi bi-telephone fs-3"></i>
					</div>
					<div>
						<input type="text" name="phonenum" class="MY_jeongbo_INPUT" placeholder="휴대폰 번호">
					</div>
				</div>
				<div class="MY_jeongbo_BOX">
					<div class="MY_jeongbo_IKON">
						<i class="bi bi-chat-left-dots fs-3"></i>
					</div>
					<div>
						<input type="text" name="request" class="MY_jeongbo_INPUT"
							placeholder="배송시 요청 사항">
					</div>
				</div>
				<button class="MY_jeongbo_SAVE" type="submit">저장</button>
			</div>
			</form>
		</div>
	</div>
	<script
		src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script src="resources/js/Shipping_address/address.js"></script>
</body>
</html>