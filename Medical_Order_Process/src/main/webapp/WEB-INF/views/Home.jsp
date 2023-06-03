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
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>	<!-- banner slide jQuery -->
	<script src="resources/js/Home.js"></script>
</head>

<header>
  <div class="dropdown">
    <button class="btn btn-danger">
      <i class="bi bi-justify fs-2"></i><br>
      카테고리
    </button>
    <div class="dropdown-content">
      <a href="#">의료소모품</a>
      <a href="#">수술기구</a>
      <a href="#">의료기기</a>
      <a href="#">건강용품</a>
      <a href="#">사무용품</a>
      <a href="#">이벤트</a>
    </div>
  </div>
  <section>
    <div class="I_BOX">
      <h1 class="I_logo">
        <a>
          <img src="resources/img/home/MarshLogo.png" alt="로고" width="174" height="39">
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

<!-- banner slider -->
<div class="slider">
  <div class="slide" style="background-image: url('resources/img/home/item/banner/banner1_n.png');"></div>
  <div class="slide" style="background-image: url('resources/img/home/item/banner/banner2_n.png');"></div>
  <div class="slide" style="background-image: url('resources/img/home/item/banner/banner3_n.png');"></div>
  <div class="slide" style="background-image: url('resources/img/home/item/banner/banner4_n.png');"></div>
  <div class="slide" style="background-image: url('resources/img/home/item/banner/banner5_n.png');"></div>

  <div class="slide-buttons">
    <span class="slide-button" data-slide="0">
      <img src="resources/img/home/item/btn/banner_btn1.png" alt="Button 1">
    </span>
    <span class="slide-button" data-slide="1">
      <img src="resources/img/home/item/btn/banner_btn2.png" alt="Button 2">
    </span>
    <span class="slide-button" data-slide="2">
      <img src="resources/img/home/item/btn/banner_btn3.png" alt="Button 3">
    </span>
    <span class="slide-button" data-slide="3">
      <img src="resources/img/home/item/btn/banner_btn4.png" alt="Button 4">
    </span>
    <span class="slide-button" data-slide="4">
      <img src="resources/img/home/item/btn/banner_btn5.png" alt="Button 5">
    </span>
  </div>
</div>



<!-- group slider -->
<div class="group_slider">
<span class="group_h4">오늘의 </span><span class="group_h4_red">판매자 특가</span>
  <div class="slide-groups">
    <!-- 슬라이드 1 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/1.jpg" alt="1">
      <div class="discount"><img src="resources/img/home/item/group_banner/per.png">지금 20% 할인 중</div>
      <div class="name">국내생산 MB필터 일회용마스크 300매 비말차단 덴탈마스크 </div>
      <div class="price">19,800원</div>
    </div>
    
    <!-- 슬라이드 2 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/2.jpg" alt="1">
      <div class="discount"><img src="resources/img/home/item/group_banner/per.png">지금 30% 할인 중</div>
      <div class="name">KF94 새부리형 마스크 100매 대형 소형 메디케이알 컬러 마스크</div>
      <div class="price">15,800원</div>
    </div>

    <!-- 슬라이드 3 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/3.jpg" alt="1">
      <div class="discount"><img src="resources/img/home/item/group_banner/per.png">지금 5% 할인 중</div>
      <div class="name">일회용 주사기 신창 5cc(100pcs) 멸균처리</div>
      <div class="price">13,900원</div>
    </div>

    <!-- 슬라이드 4 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/4.jpg" alt="1">
      <div class="discount"><img src="resources/img/home/item/group_banner/per.png">지금 15% 할인 중</div>
      <div class="name">인슐린 삭센다 펜니들/주사바늘(침) : 바른케어 4mm (100매)</div>
      <div class="price">15,900원</div>
    </div>
    
    <!-- 슬라이드 5 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/5.jpg" alt="1">
      <div class="discount"><img src="resources/img/home/item/group_banner/per.png">지금 35% 할인 중</div>
      <div class="name">주사기 잉크충전 오일 흡입기 주사침 대형주사기 100mL</div>
      <div class="price">1,350원</div>
    </div>
    
    <!-- 추가 슬라이드 6 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/6.jpg" alt="1">
      <div class="discount"><img src="resources/img/home/item/group_banner/per.png">지금 25% 할인 중</div>
      <div class="name">무료배송 이름새김무료 의사가운/약사가운/실습가운</div>
      <div class="price">25,300원</div>
    </div>
    
    <!-- 추가 슬라이드 7 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/7.jpg" alt="1">
      <div class="discount"><img src="resources/img/home/item/group_banner/per.png">지금 55% 할인 중</div>
      <div class="name">A-01 고급스판 롱가운 빅사이즈 의사가운 / 남여~140</div>
      <div class="price">47,900원</div>
    </div>
    
    <!-- 추가 슬라이드 8 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/8.jpg" alt="1">
      <div class="discount"><img src="resources/img/home/item/group_banner/per.png">지금 9% 할인 중</div>
      <div class="name">상품명신화가운 면100% 14수 수술원피스 특가기획전</div>
      <div class="price">27,400원</div>
    </div>
    
    <!-- 추가 슬라이드 9 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/9.jpg" alt="1">
      <div class="discount"><img src="resources/img/home/item/group_banner/per.png">지금 30% 할인 중</div>
      <div class="name">나가이레벤 의사가운/남성 수술복/진료복/MF8302</div>
      <div class="price">43,300원</div>
    </div>
    
    <!-- 추가 슬라이드 10 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/10.jpg" alt="1">
      <div class="discount"><img src="resources/img/home/item/group_banner/per.png">지금 20% 할인 중</div>
      <div class="name">천연 무공해 살균소독제 바이러스 방역 20리터</div>
      <div class="price">19,900원</div>
    </div>
    
    <!-- 추가 슬라이드 11 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/11.jpg" alt="1">
      <div class="discount"><img src="resources/img/home/item/group_banner/per.png">지금 30% 할인 중</div>
      <div class="name">면거즈/팩거즈/100매/200매/미용거즈/피부거즈</div>
      <div class="price">18,000원</div>
    </div>

    <!-- 추가 슬라이드 12 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/12.jpg" alt="1">
      <div class="discount"><img src="resources/img/home/item/group_banner/per.png">지금 20% 할인 중</div>
      <div class="name">의료용 외과가위(Scissor) 직선 B/B 16.5cm</div>
      <div class="price">10,000원</div>
    </div>

    <!-- 추가 슬라이드 13 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/13.jpg" alt="1">
      <div class="discount"><img src="resources/img/home/item/group_banner/per.png">지금 30% 할인 중</div>
      <div class="name">자외선소독기(520L)DHS-1400(살균)/소독/살균기</div>
      <div class="price">990,000</div>
    </div>

    <!-- 추가 슬라이드 14 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/14.jpg" alt="1">
      <div class="discount"><img src="resources/img/home/item/group_banner/per.png">지금 20% 할인 중</div>
      <div class="name">개무밧드 (뚜껑없는밧드) 6절(28cm 22cm 5.5cm)드레싱</div>
      <div class="price">19,500원</div>
    </div>

    <!-- 추가 슬라이드 15 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/15.jpg" alt="1">
      <div class="discount"><img src="resources/img/home/item/group_banner/per.png">지금 55% 할인 중</div>
      <div class="name">메디위 U자형 어깨보행차 DS-1200 바퀴워커 보행기</div>
      <div class="price">134,900원</div>
    </div>
  </div>
  <div class="prev-button"><img src="resources/img/home/item/group_banner/arrow_l.png"></div>
  <div class="next-button"><img src="resources/img/home/item/group_banner/arrow_r.png"></div>
</div>

</body>

<!-- footer -->
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
    </div>
    
    <div class="footer-section">
      <h3 class="footer-heading">회사 정보</h3>
      <ul class="footer-links">
        <li>상호명 및 호스팅 서비스 제공 : <br>
        Marsh Tit(Corp)</li>
        <li>대표이사 : 강한승, 박대준</li>
        <li>울산광역시 남구 삼산중로100</li>
        <li>사업자 등록번호 : 123-45-67890</li>
        <li>통신판매업신고 : 2023-울산남구-0609</li>
      </ul>
    </div>
    
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
	
  <div class="footer-bottom">
    <p>
      사이버몰 내 판매되는 상품 중에는 Marsh_tit에 등록한 개별 판매자가 판매하는 마켓플레이스(오픈마켓) 상품이 포함되어 있습니다.
마켓플레이스(오픈마켓) 상품의 경우 Marsh_tit은 통신판매중개자이며 통신판매의 당사자가 아닙니다.
Marsh_tit은 마켓플레이스(오픈마켓) 상품, 거래정보 및 거래 등에 대하여 책임을 지지 않습니다.
Marsh_tit은 소비자 보호와 안전거래를 위해 신뢰관리센터(wlsghwns1@naver.com)를 운영하고 있으며, 관련 분쟁이 발생할 경우 별도의 분쟁 처리절차에 의거 분쟁이 처리됩니다.
Copyright © Marsh_tit Corp. 2023-2023 All Rights Reserved.
    </p>
  </div>
</footer>

</html>
