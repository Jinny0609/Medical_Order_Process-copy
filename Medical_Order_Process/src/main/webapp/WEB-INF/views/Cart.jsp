<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cart Page</title>
<link href="resources/css/Cart.css" rel="stylesheet" type="text/css" />
<script src="resources/js/Cart.js"></script>
<script>
    function deleteCartItem(productId) {
        if (confirm("정말로 상품을 삭제하시겠습니까?")) {
            location.href = "<c:url value='/Cart_delete?product_id=' />" + productId;
        }
    }
</script>
</head>
<body>
	<a href="/"><img class="Coupang" src="resources/img/MarshLogo.png"
		alt="쿠팡로고"></a>
	<section class="Cart">
		<div class="Cart_information">
			<ul>
				<li>장바구니 상품은 최대 30일간 저장됩니다.</li>
				<li>가격, 옵션 등 정보가 변경된 경우 주문이 불가할 수 있습니다.</li>
				<li>오늘출발 상품은 판매자 설정 시점에 따라 오늘출발 여부가 변경될 수 있으니 주문 시 꼭 다시 확인해 주시기
					바랍니다.</li>
			</ul>
		</div>
		<div style="display: flex; justify-content: space-between;">
			<img class="Cartimg" src="resources/img/Cart/Cart1.png"  />
			<img class="Cartimg1" src="resources/img/Cart/Cart2.png"/>
		</div>
		<form action="/Cart_delete" method="GET">
			<table class="Cart_list">
				<thead>
					<tr>
						<td colspan="2"></td>
						<td colspan="1">상품정보</td>
						<td>옵션</td>
						<td>상품금액</td>
						<td>배송비</td>
						<td>삭제</td>
					</tr>
				</thead>
				<tbody>
					<!-- 상품 목록 반복문 -->
					<c:forEach items="${CartList}" var="cartItem">
						<tr class="Cart_list_detail">
							<td></td>
							<td><img class="Goods" src="${cartItem.image_path}"
								alt="magic keyboard"></td>
							<td><a href="#">그린몰 공식 스토어</a><span
								class="Cart_list_smartstore"> 그린몰</span>
								<p>${cartItem.product_name}</p> <span class="Price"
								data-price="${cartItem.product_price}">${cartItem.product_price}원</span>
							</td>
							<td>
								<div class="Cart_modify">
									<p>${cartItem.cart_option}</p>
									<input type="number" min="1" max="40" step="1"
										value="${cartItem.product_count}"
										onchange="calculateTotalPrice()" /> <br />
								</div>
							</td>
							<td><span class="SubTotal">${cartItem.product_count * cartItem.product_price}원</span><br></td>
							<td>2,500원</td>
							<td colspan="2"class="Cart_delete">
								<a onclick="deleteCartItem(${cartItem.product_id})"><input type="button" value="상품삭제"class="Button Login"></a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
				<tfoot>
					<tr>
						<td colspan="2"></td>
						<td><label>선택 상품 금액 : <span
								id="totalPrice"></span></label></td>
						<td colspan="1"><label>총 배송비 : 2,500 원</label></td>
						<td colspan="2"><label>주문 금액 : <span id="orderPrice"></span></label></td>
						<td></td>
					</tr>
				</tfoot>
			</table>
		</form>
		<div class="Cart_mainbtns">
			<button class="Cart_bigorderbtn left"
				onclick="window.location.href='/'">쇼핑 계속하기</button>
			<button class="Cart_bigorderbtn right"
				onclick="window.location.href='/Checkout'">주문하기</button>
		</div>
	</section>
</body>

</html>