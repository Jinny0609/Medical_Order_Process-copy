<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카테고리</title>
<%@ include file="include/header.jsp"%>
<link href="resources/css/Categorie.css" rel="stylesheet"
	type="text/css" />
</head>
<body>
	<div class="navbar_color"></div>
	<div class="Categorie_container">
		<div class="Side_bar">
			<div class="Side_bar_no1">
				<div class="Side_bar_no2">
					<h5 class="Categorie_font">
						<strong>카테고리</strong>
					</h5>
				</div>
				<div class="Side_menu">
					<ul>
						<c:forEach items="${sessionScope.Category}" var="category">
							<li><a onclick="redirectMYCategory('${category.category_id}')">${category.category_name}</a></li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</div>
		<!-- 상품 배열 구간 -->
		<div class="Product_Info">
			<div class="Product_Info2">
				<div>
					<h3>
						<strong>상품 정보</strong>
					</h3>
				</div>
				<div class="Product_color">
					<div class="Serch-sorting">
						<a href="#" class="Serch-font">낮은가격순</a> | <a href="#"
							class="Serch-font">높은가격순</a> | <a href="#" class="Serch-font">판매량순</a>
						| <a href="#" class="Serch-font">최신순</a>
					</div>
				</div>

				<!--상품 전체-->
				<ul>
					<li class="Products"><a>
							<div>
								<img src="resources/img/home/item/group_banner/7.jpg">
							</div>
							<div class="Texts">
								<div class="discount">
									<img src="resources/img/home/item/group_banner/per.png">지금
									20% 할인 중
								</div>
								<div class="Products_Text">
									<div class="Products_font">A-01 고급스판 롱가운 빅사이즈 의사가운 /
										남여~140</div>
									<div>47,900원</div>
								</div>
							</div>
					</a></li>
					<li class="Products"><a>
							<div>
								<img src="resources/img/home/item/group_banner/7.jpg">
							</div>
							<div class="Texts">
								<div class="discount">
									<img src="resources/img/home/item/group_banner/per.png">지금
									20% 할인 중
								</div>
								<div class="Products_Text">
									<div class="Products_font">A-01 고급스판 롱가운 빅사이즈 의사가운 /
										남여~140</div>
									<div>47,900원</div>
								</div>
							</div>
					</a></li>
					<li class="Products"><a>
							<div>
								<img src="resources/img/home/item/group_banner/7.jpg">
							</div>
							<div class="Texts">
								<div class="discount">
									<img src="resources/img/home/item/group_banner/per.png">지금
									20% 할인 중
								</div>
								<div class="Products_Text">
									<div class="Products_font">A-01 고급스판 롱가운 빅사이즈 의사가운 /
										남여~140</div>
									<div>47,900원</div>
								</div>
							</div>
					</a></li>
					<li class="Products"><a>
							<div>
								<img src="resources/img/home/item/group_banner/7.jpg">
							</div>
							<div class="Texts">
								<div class="discount">
									<img src="resources/img/home/item/group_banner/per.png">지금
									20% 할인 중
								</div>
								<div class="Products_Text">
									<div class="Products_font">A-01 고급스판 롱가운 빅사이즈 의사가운 /
										남여~140</div>
									<div>47,900원</div>
								</div>
							</div>
					</a></li>
					<li class="Products"><a>
							<div>
								<img src="resources/img/home/item/group_banner/7.jpg">
							</div>
							<div class="Texts">
								<div class="discount">
									<img src="resources/img/home/item/group_banner/per.png">지금
									20% 할인 중
								</div>
								<div class="Products_Text">
									<div class="Products_font">A-01 고급스판 롱가운 빅사이즈 의사가운 /
										남여~140</div>
									<div>47,900원</div>
								</div>
							</div>
					</a></li>
					<li class="Products"><a>
							<div>
								<img src="resources/img/home/item/group_banner/7.jpg">
							</div>
							<div class="Texts">
								<div class="discount">
									<img src="resources/img/home/item/group_banner/per.png">지금
									20% 할인 중
								</div>
								<div class="Products_Text">
									<div class="Products_font">A-01 고급스판 롱가운 빅사이즈 의사가운 /
										남여~140</div>
									<div>47,900원</div>
								</div>
							</div>
					</a></li>
					<li class="Products"><a>
							<div>
								<img src="resources/img/home/item/group_banner/7.jpg">
							</div>
							<div class="Texts">
								<div class="discount">
									<img src="resources/img/home/item/group_banner/per.png">지금
									20% 할인 중
								</div>
								<div class="Products_Text">
									<div class="Products_font">A-01 고급스판 롱가운 빅사이즈 의사가운 /
										남여~140</div>
									<div>47,900원</div>
								</div>
							</div>
					</a></li>
					<li class="Products"><a>
							<div>
								<img src="resources/img/home/item/group_banner/7.jpg">
							</div>
							<div class="Texts">
								<div class="discount">
									<img src="resources/img/home/item/group_banner/per.png">지금
									20% 할인 중
								</div>
								<div class="Products_Text">
									<div class="Products_font">A-01 고급스판 롱가운 빅사이즈 의사가운 /
										남여~140</div>
									<div>47,900원</div>
								</div>
							</div>
					</a></li>
				</ul>
			</div>
		</div>
	</div>
</body>
<%@ include file="include/Footer.jsp"%>
</html>