<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
                <th>No</th>
                <th>주문 식별키</th> <!-- list_id (int) -->
                <th>구매자</th> <!-- email_id (varchar)  -->
                <th>구매한 제품명</th> <!-- product_id(varchar) -->
                <th>날짜</th> <!-- 4. 날짜 -->
                <th>병원 이름</th> <!-- 5. 병원 이름 -->
                <th>옵션</th> <!-- 7. 옵션 -->
                <th>현재 재고 / 구매 수량 / 남은 수량</th> <!-- 8. 현재 재고 / 구매 수량 / 남은 수량 -->
            </tr>
            <!-- 게시물이 출력될 영역 -->
            <tr>
                <td>1</td>
                <td>10</td> <!-- 예시 데이터 -->
                <td>buyer@example.com</td> <!-- 예시 데이터 -->
                <td>투명 망토</td> <!-- 예시 데이터 -->
                <td>2023.06.16</td> <!-- 예시 데이터 -->
                <td>병원 이름</td> <!-- 예시 데이터 -->
                <td>옵션</td> <!-- 예시 데이터 -->
                <td>현재 재고 / 구매 수량 / 남은 수량</td> <!-- 예시 데이터 -->
            </tr>
        </table>
    </div>
</body>
<%@ include file="include/Footer.jsp"%>
</html>