<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="resources/css/Checkout/Checkout.css" rel="stylesheet">
</head>
<header>
    <div class="H_BOX">
        <a href="#"><img src="resources/img//MarshLogo.png"></a>
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
                            <td>홍길동</td>
                        </tr>
                        <tr>
                            <th>이메일</th>
                            <td>abcd@naver.com</td>
                        </tr>
                        <tr>
                            <th>휴대폰 번호</th>
                            <td>010-1111-1234</td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="UserForm_BOX">
                <div class="UserForm_header"><h3>받는사람정보</h3><button class="UserForm_BT1">배송지변경</button></div>
                <table>
                    <tbody>
                        <tr>
                            <th>이름</th>
                            <td>홍길동</td>
                        </tr>
                        <tr>
                            <th>배송주소</th>
                            <td>울산광역시 삼산동 칼국수 뚝배기 4층</td>
                        </tr>
                        <tr>
                            <th>연락처</th>
                            <td>010 - 1111 - 1234</td>
                        </tr>
                        <tr>
                            <th>배송 요청사항</th>
                            <td>문 앞 <button class="UserForm_BT1">변경</button></td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <h3>배송물품</h3>
            <div class="UserForm_Item">
                <div>오뚜기 콕콕콕 치즈볶이 95g, 24개</div>
                <div>수량 1개 / 무료배송</div>
            </div>
            <div class="UserForm_BOX">
                <h3>결제정보</h3>
                <table>
                    <tbody>
                        <tr>
                            <th>총상품가격</th>
                            <td>0원</td>
                        </tr>
                        <tr>
                            <th>배송비</th>
                            <td>0원</td>
                        </tr>
                        <tr>
                            <th>총결제금액</th>
                            <td>0원</td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="UserForm_BTBOX"><button class="UserForm_BT2">결제하기</button><button class="UserForm_BT3">취소하기</button></div>
        </div>
    </div>
</body>
</html>