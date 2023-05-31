<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page session="false" %>
<html>
<head>
	<title>Marsh Tit Medical</title>
	<link rel="stylesheet" type="text/css" href="resources/css/Home.css">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css"><!-- 헤더  -->
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"><!-- 헤더  --> 
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
	<script src="resources/js/Home.js"></script>
</head>

<header>
  <div class="dropdown">
    <button class="btn btn-danger">
      <i class="bi bi-justify fs-2"></i><br>
      카테고리
    </button>
    <div class="dropdown-content">
      <a href="#">패션의류</a>
      <a href="#">뷰티</a>
      <a href="#">디지털/가전</a>
      <a href="#">식품</a>
      <a href="#">도서</a>
      <a href="#">스포츠/레저</a>
    </div>
  </div>
  <section>
    <div class="I_BOX">
      <h1 class="I_logo">
        <a>
          <img src="resources/img/home/coupang.png" alt="쿠팡로고" width="174" height="39">
        </a>
      </h1>
      <div class="search">
        <input class="S_input" type="text" placeholder="검색어 입력">
        <img class="S_img" src="https://s3.ap-northeast-2.amazonaws.com/cdn.wecode.co.kr/icon/search.png">
      </div>
      <ul class="H_ikon">
        <li><a><i class="bi bi-person fs-2"></i><span>마이 페이지</span></a></li>
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

<div class="product-container">
  <div class="product">
    <img src="resources/img/home/item/disinfectant.png" alt="disinfectant">
    <h3 class="product-name">disinfectant</h3>
    <p class="product-price">Price : 99$</p>
  </div>
  
  <!-- 다른 제품들도 동일한 구조로 추가 -->
</div>

</body>

<footer>
  <div class="footer-container">
    <div class="footer-section">
      <h3 class="footer-heading">고객센터</h3>
      <ul class="footer-links">
        <li><a href="#">자주 묻는 질문</a></li>
        <li><a href="#">1:1 문의</a></li>
        <li><a href="#">고객의 소리</a></li>
        <li><a href="#">인재 채용 안내</a></li>
      </ul>
    <p>
	        상호명 및 호스팅 서비스 제공 : 쿠팡(주)<br>
	        대표이사 : 강한승, 박대준<br>
	        서울시 송파구 송파대로 570<br>
	        사업자 등록번호 : 120-88-00767<br>
	        통신판매업신고 : 2017-서울송파-0680<br>
        <a href="#">사업자정보 확인</a> 
    </p>
    <p>
        365고객센터 | 전자금융거래분쟁처리담당<br>
        1577-7011 (유료)<br>
		서울시 송파구 송파대로 570<br>
        email : help@coupang.com<br>
    </p>
    <p>    
	        우리은행 채무지급보증 안내<br>
	        당사는 고객님이 현금 결제한 금액에 대해<br>
	        우리은행과 채무지급보증 계약을 체결하여<br>
	        안전거래를 보장하고 있습니다.<br>
	        서비스 가입사실 확인 >
    </p>
    </div>
    
    <!-- 다른 섹션들도 동일한 구조로 추가 -->
    
    <div class="footer-section">
      <h3 class="footer-heading">팔로우하기</h3>
      <ul class="footer-social">
        <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
        <li><a href="#"><i class="fab fa-instagram"></i></a></li>
        <li><a href="#"><i class="fab fa-youtube"></i></a></li>
        <li><a href="#"><i class="fab fa-twitter"></i></a></li>
      </ul>
    </div>
  </div>
</footer>
</html>
