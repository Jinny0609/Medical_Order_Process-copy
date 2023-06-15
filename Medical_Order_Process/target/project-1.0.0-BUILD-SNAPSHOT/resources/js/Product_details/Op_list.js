$(document).ready(
				function() {
					$('.dropdown').hover(
							function() {
								$(this).find('.dropdown-content').stop(true,
										true).slideDown(200);
							},
							function() {
								$(this).find('.dropdown-content').stop(true,
										true).slideUp(200);
							});
				});

var optionPrices = {};

function toggleOptionList() {
  var optionList = document.getElementById("optionList");
  var optionLabel = document.querySelector(".option-label");

  if (optionList.style.display === "none") {
    optionList.style.display = "block";
    optionLabel.textContent = "옵션 ▲";
  } else {
    optionList.style.display = "none";
    optionLabel.textContent = "옵션 ▼";
  }
}

function toggleOption(li, price) {
  var optionText = li.textContent;
  var optionContainer = document.getElementById("optionList");
  var optionLabel = document.querySelector(".option-label");

  var selectedOption = document.querySelector(".option-item[data-option='" + optionText + "']");

  if (!selectedOption) {
    li.classList.add("selected");
    createQuantityInput(li, price);
    optionPrices[optionText] = price;
  }

  calculatePrice();

  optionContainer.style.display = "none";
  optionLabel.textContent = "옵션 ▼";
}

function createQuantityInput(li, price) {
  var quantityContainer = document.getElementById("quantityContainer");
  var optionItem = document.createElement("div");
  optionItem.classList.add("option-item");
  optionItem.dataset.option = li.textContent;
  optionItem.innerHTML = `
    <label class="quantity-label">${li.textContent}</label>
    <input class="quantity-input" type="number" min="1" value="1" onchange="calculatePrice()" data-option="${li.textContent}" data-price="${price}">
    <button class="remove-button" onclick="removeQuantityInput('${li.textContent}')">X</button>
  `;

  quantityContainer.appendChild(optionItem);
}

function removeQuantityInput(optionText) {
  var quantityContainer = document.getElementById("quantityContainer");
  var optionItem = document.querySelector(".option-item[data-option='" + optionText + "']");

  if (optionItem) {
    quantityContainer.removeChild(optionItem);
    delete optionPrices[optionText];
  }

  if (quantityContainer.childElementCount === 0) {
    quantityContainer.innerHTML = "";
  }

  calculatePrice();
}

function calculatePrice() {
  var quantityInputs = document.getElementsByClassName("quantity-input");
  var totalPrice = 0;

  for (var i = 0; i < quantityInputs.length; i++) {
    var input = quantityInputs[i];
    var price = parseInt(input.getAttribute("data-price"));
    var quantity = parseInt(input.value);

    totalPrice += price * quantity;
  }

  document.getElementById("price").textContent = totalPrice;

  var priceContainer = document.getElementById("priceContainer");

  if (totalPrice > 0) {
    priceContainer.style.display = "block";
  } else {
    priceContainer.style.display = "none";
  }
}


// 로그인 페이지 이동
function redirectMYLogin() {
	window.location.href = '/Login';
}

// 회원가입이동
function redirectMYSign_up() {
	window.location.href = '/Sign_up';
}

// 카테고리 이동
function redirectMYCategorie() {
	window.location.href = '/Categorie';
}

// 로그인시 마이정보/장바구니 이동가능
function redirectMYpage() {
	  fetch('/getUserID', {
	    method: 'POST',
	    credentials: 'include', // 세션 쿠키를 포함하여 요청 보내기
	    headers: {
	      'Content-Type': 'application/json'
	    },
	    body: JSON.stringify({}) // 필요한 경우 요청 본문에 데이터를 전달
	  })
	  .then(response => response.json())
	  .then(data => {
	    const user_id = data.user_id;
	    if (user_id) {
	      window.location.href = "/Order_list";
	    } else {
	      // user_id 값이 없을 때 처리
	    	alert("로그인 후 이용 가능합니다");
	    }
	  })
	  .catch(error => {
	    console.log('Error:', error);
	  });
	}

	function redirectMYCart() {
	  fetch('/getUserID', {
	    method: 'POST',
	    credentials: 'include', // 세션 쿠키를 포함하여 요청 보내기
	    headers: {
	      'Content-Type': 'application/json'
	    },
	    body: JSON.stringify({}) // 필요한 경우 요청 본문에 데이터를 전달
	  })
	  .then(response => response.json())
	  .then(data => {
	    const user_id = data.user_id;
	    if (user_id) {
	      window.location.href = "/Cart";
	    } else {
	      // user_id 값이 없을 때 처리
	    	alert("로그인 후 이용 가능합니다");
	    }
	  })
	  .catch(error => {
	    console.log('Error:', error);
	  });
	}
	
	// 로그인시 닉네임 로그아웃버튼 보임
	window.onload = function() {
	    var nameElement = document.getElementById("name");
	    var loginBtnElement = document.getElementById("login_btn");
	    var signupBtnElement = document.getElementById("signup_btn");
	    var userInfoElement = document.getElementById("user_info");
	    var userInfo2Element = document.getElementById("user_info2");
	  
	    fetch('/getUserID', {
	        method: 'POST',
	        credentials: 'include',
	        headers: {
	        	'Content-Type': 'application/json; charset=UTF-8' // 인코딩 설정 추가
	        },
	        body: JSON.stringify({})
	    })
	    .then(response => response.json())
	    .then(data => {
	    	const name = data.name;
	        const user_id = data.user_id;
	        if (user_id) {
	        	console.log(user_id)
	            nameElement.innerText = name;
	            loginBtnElement.style.display = "none";
	            signupBtnElement.style.display = "none";
	            userInfoElement.style.display = "block";
	            userInfo2Element.style.display = "block";
	        } else {
	            nameElement.innerText = "";
	            loginBtnElement.style.display = "block";
	            signupBtnElement.style.display = "block";
	            userInfoElement.style.display = "none";
	            userInfo2Element.style.display = "none";
	        }
	    })
	    .catch(error => {
	        console.log('Error:', error);
	    });
	}
	
	// 로그아웃 버튼 클릭 시 세션 값 제거 후 페이지 새로고침
	function logout() {
		window.location.href = '/Logout';
		alert("로그아웃되었습니다.");
	}