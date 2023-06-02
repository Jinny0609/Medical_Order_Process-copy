<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
<%@ include file="include/header.jsp" %> 
<link href="resources/css/User_info/User_css.css" rel="stylesheet">
</head>
<body>
    <div class="MY_container">
        <div class="MY_nav">
            <div class="H_nav"><h2>MY TIT</h2></div>
            <div class="M_nav">
                <h3>MY 정보</h3>
                <ul>
                    <li><a href="#">주문목록/배송조회<br>취소/환불</a></li>
                    <li><a href="#">개인정보확인/수정</a></li>
                    <li><a href="#">배송지 관리</a></li>
                </ul>
            </div>
        </div>
        <div class="MY_privacy">
            <div class="MY_navcontainer">
            <div class="MY_navbox"><p>배송 준비</p><span>0건</span></div>
            <div class="MY_navbox"><p>배송 중</p><span>1건</span></div>
            <div class="MY_navbox"><p>배송 완료</p><span>0건</span></div>
            </div>
        <!-- 여기서부터 바꿀 내용 들어갑니다.-->
        <div class="MY_delivery">
            <strong>주문목록</strong>
            <div class="MY_search">
                <input type="text" placeholder="제품 목록 입력">
                <img src="https://s3.ap-northeast-2.amazonaws.com/cdn.wecode.co.kr/icon/search.png">
              </div>
              <!--  여기서부터 제품 목록 아마 반복문 써야될거같은데-->
            <div class="MY_deliverypage">
                <div class="MY_deliveryheader"><strong>배송상품</strong></div>
                <div class="MY_deliverylistbox">
                    <h3>2023.06.01 주문</h3>
                    <div class="MY_deliverylist">
                        <div style="margin-top: 15px; margin-left:15px;">
                            <strong>배송중</strong>
                            <div class="MY_deliveryGoodsbox">
                                <div class="MY_deliveryGoods1"><img src="img/Jsagi.jpg"></div>
                                <div class="MY_deliveryGoods2">
                                    <a>일회용주사기</a>
                                    <div class="MY_deliveryGoods3"><span>5,010원</span><button>장바구니 담기</button></div>
                                </div>
                            </div>
                        </div>
                        <div class="MY_delivery_BTBOX">
                            <button class="MY_delivery_BT1">배송조회</button>
                            <button class="MY_delivery_BT2">반품 신청하기</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        </div>
    </div>
</body>
</html>