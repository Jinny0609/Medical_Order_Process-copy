<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>제품 상세 페이지</title>
<link href="resources/css/Product_details/style.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<header>
	<div class="dropdown">
		<button class="btn btn-danger">
			<i class="bi bi-justify fs-2"></i><br> 카테고리
		</button>
		<div class="dropdown-content">
			<a href="#">패션의류</a> <a href="#">뷰티</a> <a href="#">디지털/가전</a> <a
				href="#">식품</a> <a href="#">도서</a> <a href="#">스포츠/레저</a>
		</div>
	</div>
	<section>
		<div class="I_BOX">
			<h1 class="I_logo">
				<a> <img src="resources/img/MarshLogo.png"
					alt="쿠팡로고" width="174" height="39">
				</a>
			</h1>
			<div class="search">
				<input class="S_input" type="text" placeholder="검색어 입력"> <img
					class="S_img"
					src="https://s3.ap-northeast-2.amazonaws.com/cdn.wecode.co.kr/icon/search.png">
			</div>
			<ul class="H_ikon">
				<li onclick="redirectMYpage()"><a><i class="bi bi-person fs-2"></i><span>마이 페이지</span></a></li>
				<li><a><i class="bi bi-cart3 fs-2"></i><span>장바구니</span></a></li>
			</ul>
		</div>
	</section>
</header>
<article class="Top_bar">
	<div class="M_box">
		<ul class="M_sub">
			<li>즐겨찾기</li>
			<li>입점신청</li>
		</ul>
		<ul class="M_login">
			<li>로그인</li>
			<li>회원가입</li>
			<li>고객센터</li>
		</ul>
	</div>
</article>
<body>
	<div class="I_container">
		<div class="B_itembox">
			<div>
				<img class="I_img" src="resources/img/Product_details/Jsagi.jpg"
					alt="의료용품이미지">
			</div>
			<div class="I_Detail">
				<div class="I_title">
					<h4>일회용 주사기(D/Syringe)</h4>
				</div>
				<div class="I_ex">
					<span>판매가 </span><span>5,010원</span>
				</div>
				<div class="I_ex">
					배송비 <span>2,500원</span> / 주문시결제(선결제)
				</div>
				<div class="I_ex">
					자체상품코드 <span>2321421</span>
				</div>
				<div class="S_sun"></div>
				<div>
					<select id="option-select" class="form-select"
						aria-label="Default select example">
						<option selected>옵션을 선택하세요</option>
						<option value="1">옵션1: 1cc 25G, 5/8inch 박스(100개)</option>
						<option value="2">옵션2: 1cc 26G, 1/2inch 박스(100개)</option>
						<option value="3">옵션3: 3cc 23G, 1inch 박스(100개)</option>
					</select>
					<table id="product-table" class="hidden-table">
						<tbody id="table-body" class="hidden-table2">
							<!-- 여기에 동적으로 표시될 테이블 내용이 들어갈 자리입니다. -->
						</tbody>
					</table>
					<div class="I_calc">
						<h5>총 합계금액</h5>
						<span>5,010원</span>
					</div>
				</div>
				<div class="I_BT">
					<button type="button" class="btn btn-outline-primary">장바구니
						담기</button>
					<button type="button" class="btn btn-primary">바로 구매</button>
				</div>
			</div>
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
	<script>
		$(document).ready(
				function() {
					$('.dropdown').hover(
							function() {
								$(this).find('.dropdown-content').stop(true,
										true).slideDown(200);
							},
							function() {
								$(this).find('.dropdown-content').stop(true,
										true).slideUp(200);
							});
				});
	</script>
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