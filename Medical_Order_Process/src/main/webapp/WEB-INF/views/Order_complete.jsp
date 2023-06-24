<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
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
		<div class="spacer"></div>
		<span class="vertical-line">주문일 : <fmt:formatDate value="${orderCompleteInfo.purchaseDate}" pattern="yyyy년 MM월 dd일 HH:mm:ss (E)" timeZone="Asia/Seoul" /></span> 
    	<span>주문번호 : ${orderCompleteInfo.listId}</span><br>
		<img src="resources/img/Order_complete/continue_shopping.png" class="continue_shopping" alt="계속 쇼핑하기>">
		<div class="hr_gray"></div>
		
		<div class="info_container">
			<div class="info-wrapper">
				<h3>받는사람 정보</h3>
				<div class="info-content-wrapper">
					<div class="info-content">
					    <span class="info-label">이름:</span> <span class="info-value">${orderCompleteInfo.name}</span>
					</div>
					<div class="info-content">
					    <span class="info-label">휴대폰 번호:</span> <span class="info-value">${orderCompleteInfo.phonenum}</span>
					</div>
					<div class="info-content">
					    <span class="info-label">배송 주소 :</span> <span class="info-value">${orderCompleteInfo.addressRoad}</span>
					</div>
					<div class="info-content">
					    <span class="info-label">배송 주소 상세:</span> <span class="info-value">${orderCompleteInfo.addressDetail}</span>
					</div>
					<div class="info-content">
					    <span class="info-label">배송 요청 사항:</span> <span class="info-value">${orderCompleteInfo.request}</span>
					</div>
				</div>
			</div>
			
			<div class="info-wrapper">
					<h3>결제 정보</h3>
				<div class="info-content-wrapper">
					<div class="info-content">
					    <span class="info-label">주문금액:</span> <span class="info-value">${totalPriceWithoutDelivery}원</span>
					</div>
					<div class="info-content">
						<span class="info-label">배송비:</span> <span class="info-value">2500원</span>
					</div>
					<hr>
					<div class="info-content">
					    <span class="info-label">총 결제금액:</span> <span class="info-value">${totalPrice}원</span>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>