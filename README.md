Green marsh tit_team final project : Medical_Order_Process(Supplier Perspective) 
의료용품 수주 프로젝트 (공급사 관점)

[프로젝트 주제 선정 이유]
개인적으로 쇼핑몰을 만드려고 했었는데 의료용품 수주 프로젝트를 통해서 우리가 자주 사용하는 쿠팡 사이트와 비슷하게 만들어 보고,
공급자 관점에서의 기능을 추가해서 만들면 괜찮을것 같아서 위와 같은 주제를 정하게 되었습니다.

[개발 소요 시간] 5.26 ~ 6.27

[개발 환경] 
Eclipse, Java 1.8, Mysql(Mybatis & HikariCP)

[협업 도구]
Notion, Github

[개발 순서]
프로젝트 계획 → 설계 → 구현 → 평가(테스트) → 완료

프로젝트 계획 단계에서는 프로젝트 수행 계획, 일정 계획, 요구사항 정의 및 역할 분배를 실시하였습니다.
설계단계에서는 전체적인 디자인과 Database 설계를 진행하였고 이를 노션으로 문서로 만들어서 팀과 공유했습니다.
구현단계에서는 작업이 완료된 결과물에 대해서 문서화하면서 개발을 진행하였습니다.
평가 단계에서는 개인이 작업한 결과에 대해 코드의 기능을 검증하고 테스트하였습니다.
완료 단계에서는 프로젝트를 종료하며 결과물에 대한 회고를 팀에서 진행하였습니다.

[프로젝트 결과]
**메인페이지**
배너 슬라이드 & 그룹 슬라이드를 
구현한 메인 페이지 입니다.

주요 기능 :
로그인&회원가입,Mypage, 
Cart, Category ,이동 기능 구현.
관리자 로그인 시 관리자 페이지로 이동 버튼 표시하여 이동 기능 구현.
![image](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/f63fe759-d7ca-4551-ac2a-bcac8ebc0e87)

![메인페이지](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/17a2692e-41bd-4188-8a83-4206649380bf)

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

![회원가입](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/62feb2ea-6f29-4c0f-afe8-259005dade75)


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

![배송지 정보, 장바구니](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/046abe40-0267-49e7-8d4c-666f5cf84f5d)

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

![카테고리](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/66bee097-ac13-49fb-8309-d3550fe5b83a)

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

![바로 주문 하기](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/6ed41d0e-28ee-4f29-8bbb-c8ece8bd96a7)


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

[ERD]
![image](https://github.com/Jinny0609/Medical_Order_Process-copy/assets/71204918/c0eb6fac-6d01-4e83-a4e8-d80dd4a743cf)

[프로젝트를 마치며] 
진호준 : 팀으로 작업하는 마지막 프로젝트였는데 팀원 모두 열심히 노력해서 잘 만들어진것 같습니다.
다들 주말까지 필요한 기능을 추가 작업하느라 정말 고생많았습니다. 하지만 발표 준비로 인해 작업 시간이 부족하다고 느끼는 점이 조금 아쉬웠습니다. 그래도 여전히 우리 프로젝트는 훌륭한 완성도를 갖추고 있습니다.
팀원들의 열정과 기여에 진심으로 감사드립니다. 팀원으로서의 역할을 충실히 수행하고, 팀의 목표를 위해 최선을 다한 모습이 정말 멋졌습니다. 
우리가 이룬 성과에 대해 자부심을 가지고, 함께 힘들고 즐거운 순간을 나누었습니다.
앞으로도 함께 다른 프로젝트를 수행하게 된다면, 더욱 훌륭한 결과물을 만들어내기를 기대합니다. 팀원분과 함께 일하게 되어 영광이었고, 앞으로의 모든 도전에 항상 응원하겠습니다. 다시 한번 감사의 말씀을 전하며, 앞으로도 좋은 개발자로 남기를 바랍니다. 감사합니다.
