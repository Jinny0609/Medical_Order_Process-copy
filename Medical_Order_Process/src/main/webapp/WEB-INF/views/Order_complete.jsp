<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 완료</title>
<%@ include file="include/header.jsp" %> 
<link href="resources/css/User_info/User_css.css" rel="stylesheet">
<link href="resources/css/Order_complete.css" rel="stylesheet">
</head>
<body>
	<div class="Order_complete_container">
		<h3 class="Order_complete_h3">주문완료</h3>
		<div class="hr_blue"></div>
		<span class="group_h4_blue">주문이 완료</span><span class="group_h4">되었습니다. 감사합니다!</span><br>
		<span>주문일 2023-06-04</span>	<span>주문번호 1234567890</span><br>
		<img src="" class="continue_shopping"alt="계속 쇼핑하기>">
		<div class="hr_gray"></div>
		
		<div class="info_container">
			<div class="info-wrapper">
				<h3>받는사람 정보</h3>
				<div class="info-content-wrapper">
					<div class="info-content">
						<span class="info-label">이름:</span> <span class="info-value">John Doe</span>
					</div>
					<div class="info-content">
						<span class="info-label">휴대폰 번호:</span> <span class="info-value">010-1234-5678</span>
					</div>
					<div class="info-content">
						<span class="info-label">연락처:</span> <span class="info-value">john.doe@example.com</span>
					</div>
					<div class="info-content">
						<span class="info-label">배송 주소:</span> <span class="info-value">서울시 강남구 123번지</span>
					</div>
					<div class="info-content">
						<span class="info-label">배송 요청 사항:</span> <span class="info-value">문 앞에 두고 가주세요</span>
					</div>
				</div>
			</div>
			
			<div class="info-wrapper">
					<h3>결제 정보</h3>
				<div class="info-content-wrapper">
					<div class="info-content">
						<span class="info-label">주문금액:</span> <span class="info-value">230,000원</span>
					</div>
					<div class="info-content">
						<span class="info-label">쿠폰할인:</span> <span class="info-value">- 0원</span>
					</div>
					<div class="info-content">
						<span class="info-label">배송비:</span> <span class="info-value">0원</span>
					</div>
					<hr>
					<div class="info-content">
						<span class="info-label">총 결제금액:</span> <span class="info-value">Marsh페이(계좌이체) 230,000원</span>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>