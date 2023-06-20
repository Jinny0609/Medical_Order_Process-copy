<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cart Page</title>
<link href="resources/css/Cart.css" rel="stylesheet" type="text/css" />
<script src="resources/js/Cart.js"></script>
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
		<div>
			<img class="Cartimg" src="resources/img/Cart/Cart.png">
		</div>
		<table class="Cart_list">
			<form>
				<thead>
					<tr>
						<td><input type="checkbox"></td>
						<td colspan="2">상품정보</td>
						<td>옵션</td>
						<td>상품금액</td>
						<td>배송비</td>
					</tr>
				</thead>
			<tbody>
				<tr class="Cart_list_detail">
					<td><input type="checkbox"></td>
					<td><img class="Goods" src="resources/img/Cart/medical.png"
						alt="magic keyboard"></td>
					<td><a href="#">그린몰 공식 스토어</a><span
						class="Cart_list_smartstore"> 그린몰</span>
						<p>${product_name}</p> <span class="Price">${product_price}원</span></td>
					<td>
						<div class="Cart_modify">
							<p>${cart_option}</p>
							<input type="number" min="1" max="40" step="1" value="1"
								onchange="updatePrice(this, ${product_price})" /> <br />
						</div>
					</td>
					<td><span class="Price"></span><br></td>
					<td>2,500원</td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="3"><button class="Cart_list_optionbtn">선택상품
							삭제</button>
						<button class="Cart_list_optionbtn">선택상품 찜</button></td>
					<td><label>선택 상품 금액 : </label></td>
					<td><label>총 배송비 : 2,500 원</label></td>
					<td><label>주문 금액 : </label></td>
				</tr>
			</tfoot>
			</form>
		</table>
		<div class="Cart_mainbtns">
			<button class="Cart_bigorderbtn left" onclick="window.location.href='/'">쇼핑 계속하기</button>
			<button class="Cart_bigorderbtn right">주문하기</button>
		</div>
	</section>
</body>

</html>