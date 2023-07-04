Green marsh tit_team final project : Medical_Order_Process(Supplier Perspective) 

IOT 기반 정보 대시보드 구현 프로젝트 (환자 생체 데이터 24시간 모니터링 대시보드)

[프로젝트 주제 선정 이유] : 

[개발 소요 시간] 5.26 ~ 6.27

[개발 환경] 
Eclipse, Java 1.8, Mysql(Mybatis & HikariCP)

[협업 도구]
Notion, Github

[개발 순서]
프로젝트 계획 : 수행 계획, 일정 계획, 요구사항 정의 및 역할 분배
프로젝트 실행 : 

[프로젝트 결과]
**메인페이지**
배너 슬라이드 & 그룹 슬라이드를 
구현한 메인 페이지 입니다.

주요 기능 :
로그인&회원가입,Mypage, 
Cart, Category ,이동 기능 구현.
관리자 로그인 시 관리자 페이지로 이동 버튼 표시하여 이동 기능 구현.
![image](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/f63fe759-d7ca-4551-ac2a-bcac8ebc0e87)

메인 (gif) 넣기

**로그인 페이지**
쇼핑몰 사용을 위한 로그인 페이지

주요 기능 :
아이디 비밀번호 유효성 검사를 통해  DB에 저장된 아이디만 로그인
아이디 기억하기 기능
비밀번호 찾기 기능
아이디(이메일)찾기 기능(예정)

**회원가입 페이지**
로그인을 하기전 유저 회원가입 페이지

주요 기능 :
유저 정보를 인풋 창으로 입력받아 저장
병원 코드를 이용해 유효성 검사를 거친 뒤 병원 정보 저장

![image](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/9a1c749a-bda8-4e69-a9b8-b00a3e1c0ea4)

로그인, 회원가입(gif) 넣기

**주문 목록 페이지**
로그인 후 마이 페이지 이동 시 처음 보여지는 상품 리스트 페이지

주요 기능 : 
구매 상품 리스트 확인
![image](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/be45975f-a2b2-4399-bd69-cfb536872584)

**배송지 관리 페이지**
회원의 배송지를 관리하는 페이지

주요 기능 :
 배송지 추가,수정,삭제
저장한 배송지 리스트 출력

![image](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/403c6356-9381-4b10-a629-87f3fcf3b4b0)

**배송지 추가 페이지**
배송지 추가 버튼 클릭 시 이동되는 페이지

 주요 기능 : 
사용자가 배송지 정보를 입력하여 저장
다음 우편API기능을 활용하여 우편번호 검색 구현

![image](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/9fceeb6f-e75d-4bbf-ac06-725d6324bbaf)

(배송지 추가페이지 gif 추가)

**회원 정보 수정 페이지**
개인정보 확인/수정 버튼을 클릭시 
이동되는 페이지

주요 기능 : 
회원정보 수정 전 비밀번호 검증을 통해 
유저의 정보를 변경
![image](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/0e34d16c-0112-45a6-bb91-13639331eb7e)

**카테고리 페이지**
카테고리별로 분류한 상품 페이지

주요 기능 : 
nav 바의 카테고리 선택 시 상품 분류
상품 선택 시 상품 데이터를 상세 페이지로 전달
![image](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/44ce6983-c12a-4067-9347-7cf5e5c11039)

(카테고리 gif 추가)

**상품 상세보기**
카테고리 페이지에서 상품을 클릭했을때이동되는 페이지

주요 기능 : 
옵션과 갯수를 선택 후 장바구니에 담거나 
바로 구매 할 수 있도록 구현
![image](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/8ec3f491-b5fe-4907-a66e-6627af3a16db)
![image](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/c91d030a-ef7f-41c3-82e0-de2fca05e5f5)

**장바구니 페이지**
장바구니에 저장한 상품을 볼 수 있는 페이지

주요 기능 : 
 1. 장바구니에 저장한 상품 수량 조절
 2. 장바구니 상품 삭제
 3. 장바구니 상품 주문
![image](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/f0994f88-dfb5-4052-8a7a-53404a0f274b)

**체크아웃 페이지**
장바구니에서 물건을 구매 시 or 제품 페이지에서 바로 구매 시 이동되는 페이지

주요 기능 : 
 1.구매 요청한 상품과 구매자의 정보를 확인한 후 최종 구매 요청
 2. 배송지 변경 (예정)
![image](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/2829bd82-52b2-4bf8-80a7-2ef9cc0f70b3)

**구매 확인 페이지**
상품 구매 확정 시 보여지는 페이지

주요 기능 : 
 1. 주문자의 정보 표시
 2. 결제 금액 표시
 3. 쇼핑 홈 돌아가기
![image](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/efa2e2ca-9805-4d03-b221-fa870518b92c)

구매확정까지 gif 추가

**관리자 리스트 페이지**
관리자 리스트 페이지(관리자 로그인 필요)

주요 기능 : 
상품 관리 리스트 페이지 이동
쇼핑몰 물품 등록 페이지 이동
![image](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/5d8334b3-4d47-43db-8dac-25feb8760815)

**관리자 리스트 페이지**
관리자 상품 관리 페이지 

주요 기능 : 
관리자 리스트를 통해 구매자, 제품 ,구매한 사용자의 소속(병원), 날짜, 수량,재고 확인가능

 * 데이터를 활용 하여 차트 구현 가능
어느 병원에서 어느 상품을 어느정도 구매했는지, 많이 팔리는 제품

![image](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/7d33de42-6678-4e73-8369-5898d6dcb5f3)

**관리자 상품 등록 페이지**
관리자 상품 관리 페이지 

주요 기능 : 
관리자(공급자)가 직접 상품을 추가 하여 쇼핑몰에 등록 기능 구현
![image](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/c9e9141a-0e28-4ae9-854c-03ef0b76b1b3)

마무리한거 gif 추가

[ERD]
![image](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/c0eb6fac-6d01-4e83-a4e8-d80dd4a743cf)



[개발 후기] 
진호준 : 
