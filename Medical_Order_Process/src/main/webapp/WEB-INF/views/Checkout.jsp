<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="gmt.medical.model.Shipping_address"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="resources/css/Checkout/Checkout.css" rel="stylesheet">
</head>
<header>
	<div class="H_BOX">
		<a href="/"><img src="resources/img//MarshLogo.png"></a>
	</div>
</header>
<body>
	<div class="UserForm_container">
		<div class="UserForm_table">
			<div class="UserForm_line">
				<h2>주문/결제</h2>
			</div>
			<div class="UserForm_BOX">
				<h3>구매자정보</h3>
				<table>
					<tbody>
						<tr>
							<th>이름</th>
							<td><%=session.getAttribute("User_data_name")%></td>
						</tr>
						<tr>
							<th>이메일</th>
							<td><%=session.getAttribute("User_data_email_id")%></td>
						</tr>
						<tr>
							<th>휴대폰 번호</th>
							<td><%=session.getAttribute("User_data_phonenum")%></td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="UserForm_BOX">
				<div class="UserForm_header">
					<h3>받는사람정보</h3>
					<button class="UserForm_BT1">배송지변경</button>
				</div>
				<table>
					<tbody>
						<tr>
							<th>이름</th>
							<td><%=((Shipping_address) session.getAttribute("Address")).getRecive()%></td>
						</tr>
						<tr>
							<th>배송주소</th>
							<td><%=((Shipping_address) session.getAttribute("Address")).getAddress_road()%><br><%=((Shipping_address) session.getAttribute("Address")).getAddress_detail()%></td>
						</tr>
						<tr>
							<th>연락처</th>
							<td><%=((Shipping_address) session.getAttribute("Address")).getPhonenum()%></td>
						</tr>
						<tr>
							<th>배송 요청사항</th>
							<td><%=((Shipping_address) session.getAttribute("Address")).getRequest()%>
								<button class="UserForm_BT1">변경</button></td>
						</tr>
					</tbody>
				</table>
			</div>
			<h3>배송물품</h3>
			<form action="/Order_complete" method="GET" id="orderForm">
				<div class="UserForm_Item">
					<c:forEach items="${OtherControllerCartList}" var="item">
						<div class="UserForm_Item_Data">
							<div>
								<img class="UserForm_Item_IMG" src="${item.image_path}"
									alt="의료용품이미지">
							</div>
							<div>${item.product_name}</div>
							<div>${item.cart_option}</div>
							<div>수량 ${item.product_count}개</div>
							<input type="hidden" name="product_id" value="${item.product_id}">
							<input type="hidden" name="product_name"
								value="${item.product_name}"> <input type="hidden"
								name="cart_option" value="${item.cart_option}">
						</div>
					</c:forEach>
				</div>
				<div class="UserForm_BOX">
					<h3>결제정보</h3>
					<table>
						<tbody>
							<tr>
								<th>총상품가격</th>
								<td><c:set var="totalPrice" value="0" /> <c:set
										var="totalQuantity" value="0" /> <c:forEach
										items="${OtherControllerCartList}" var="cartItem">
										<input type="hidden" name="product_count"
											value="${cartItem.product_count}">
										<input type="hidden" name="product_price"
											value="${cartItem.product_price}">
										<c:set var="itemPrice"
											value="${cartItem.product_count * cartItem.product_price}" />
										<c:set var="totalPrice" value="${totalPrice + itemPrice}" />
										<c:set var="totalQuantity"
											value="${totalQuantity + cartItem.product_count}" />
									</c:forEach>${totalPrice}원</td>
							</tr>
							<tr>
								<th>배송비</th>
								<td>2,500원</td>
							</tr>
							<tr>
								<th>총결제금액</th>
								<td>${totalPrice + 2500}원</td>
							</tr>
						</tbody>

					</table>
				</div>
				<div class="UserForm_BTBOX">
					<button type="submit" class="UserForm_BT2">결제하기</button>
<!-- 					<button class="UserForm_BT3" onclick="goBack()">취소하기</button> -->
				</div>
			</form>
		</div>
	</div>
	<script>
// 		function goBack() {
// 			history.back();
// 		}

// 		window.onload = function() {
// 			document.getElementById("orderForm").onsubmit = function() {
// 				return false;
// 			};
// 		};
	</script>
</body>
</html>