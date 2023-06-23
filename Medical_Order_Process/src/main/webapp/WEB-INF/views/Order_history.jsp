<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<%@ include file="include/header.jsp"%>
<meta charset="UTF-8">
<title>관리자 페이지</title>
<link rel="stylesheet" type="text/css" href="resources/css/Order_history/Order_history.css">
</head>
<body>
    <div class="MainWrapper">
        <table>
            <!-- 게시판 제목 -->
            <tr class="Header">
                <th colspan="9" class="Header2">관리자 페이지</th>
            </tr>
            <!-- 게시판 목록 -->
            <tr>
                <!-- 검색 폼 영역 -->
                <td colspan="9">
                    <select>
                        <option value='A'>상품명</option>
                        <option value='T'>날짜</option>
                        <option value='C'>유저 아이디</option>
                    </select>
                    <input type="text" />
                    <button type="button" class="Button Login">검색</button>
                </td>
            </tr>
            <tr>
                <th>주문 번호</th> <!-- list_id (int) -->
                <th>구매자</th> <!-- email_id (varchar)  -->
                <th>구매한 제품명</th> <!-- product_id(varchar) -> 제품이름-->
                <th>옵션</th> <!-- 6. option_name(VARCHAR) -->
                <th>병원 이름</th> <!-- 5. hospital_info테이블의 hname(varchar) 병원명 사용	 -->
                <th>날짜</th> <!-- 4. product_saledate(datetime)  -->
                <th>구매 수량</th>
                <th>남은 수량</th> 
                <!-- 7. 구매 수량 / 남은 수량 -->
<!-- 등록할때 수량 가져와서(product_info)의 수량 > 저장한 order_list에 있는 수량 minus > 남은 값(product_info) View에 값을 보여줌 -->
            </tr>
            <!-- 게시물이 출력될 영역 -->
            <c:forEach var="order" items="${orderList}">
			    <tr>
			        <td>${order.list_id}</td>
			        <td>${order.name}</td>
			        <td>${order.product_name}</td>
			        <td>${order.option_name}</td>
			        <td>${order.hospital_name}</td>
			        <td>${order.purchase_date}</td>
			        <td>${order.purchase_quantity}</td>
			        <td>${order.remaining_quantity}</td>
			    </tr>
			</c:forEach>
        </table>
    </div>
</body>
<%@ include file="include/Footer.jsp"%>
</html>