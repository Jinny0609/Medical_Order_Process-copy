<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>제품 상세 페이지</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css">
<link href="resources/css/Product_details/style.css" rel="stylesheet">
</head>
<header>
	<div class="dropdown">
		<button class="btn btn-danger" onclick="redirectMYCategorie()">
			<i class="bi bi-justify fs-2"></i><br> 카테고리
		</button>
		<div class="dropdown-content">
			<a href="#">의료소모품</a> <a href="#">수술기구</a> <a href="#">의료기기</a> <a
				href="#">건강용품</a> <a href="#">사무용품</a>
		</div>
	</div>
	<section>
		<div class="I_BOX">
			<h1 class="I_logo">
				<a href="/"> <img src="resources/img/MarshLogo.png"
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
				<li onclick="redirectMYCart()"><a><i class="bi bi-cart3 fs-2"></i><span>장바구니</span></a></li>
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
			<li onclick="redirectMYLogin()">로그인</li>
			<li onclick="redirectMYSign_up()">회원가입</li>
			<li>고객센터</li>
		</ul>
	</div>
</article>
<body>
	<!-- header.jsp의 내용 -->

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