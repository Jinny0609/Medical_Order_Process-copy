//파일 선택 트릭
document.addEventListener('DOMContentLoaded', (event) => {
  document.getElementById('imageInput').onchange = function (event) {
    previewImage(event);
    document.getElementById('fileText').value = event.target.files[0].name;
  };
  
  document.querySelector('.custom-file-input button').addEventListener('click', function () {
    document.getElementById('imageInput').click();
  });
});

// 이미지 미리보기
function previewImage(event) {
  var imageInput = event.target;
  var imagePreviewContainer = document.getElementById('imagePreviewContainer');

  // 이미지 파일이 선택되었는지 확인합니다.
  if (imageInput.files && imageInput.files[0]) {
    var reader = new FileReader();

    reader.onload = function (e) {
      var img = document.createElement('img');
      img.src = e.target.result;

      // 이미지의 크기를 조정하여 미리보기합니다.
      img.style.maxWidth = '200px';
      img.style.maxHeight = '200px';

      imagePreviewContainer.innerHTML = '';
      imagePreviewContainer.appendChild(img);
    }

    reader.readAsDataURL(imageInput.files[0]);
  }
}

// 가격 입력 단위 구분(숫자만 입력가능)
function formatPrice() {
  var input = document.getElementById("productPrice");
  var value = input.value;

  // 쉼표를 제외한 숫자만 추출합니다.
  var number = value.replace(/[^0-9]/g, "");

  // 3자리마다 쉼표를 추가합니다.
  var formattedPrice = number.replace(/\B(?=(\d{3})+(?!\d))/g, ",");

  // 입력 필드에 포맷된 가격을 설정합니다.
  input.value = formattedPrice;
}

// 최대 수량에 대한 함수
window.checkCount = function() {
	  var countInput = document.getElementById('optionCount');
	  var count = parseInt(countInput.value);

	  var errorMessage = document.getElementById('optionCountErrorMessage'); // 아이디를 'optionCountErrorMessage'로 통일

	  if (isNaN(count)) {
	    countInput.value = '';
	  } else if (count > 30) {
	    errorMessage.style.display = 'inline';
	    setTimeout(function() {
	      errorMessage.style.display = 'none';
	      countInput.value = 30;
	    }, 1000);
	  } else {
	    errorMessage.style.display = 'none'; // 수량이 30 이하일 때 에러 메시지를 숨깁니다.
	  }
	};

// Check the input field every 100 milliseconds
setInterval(checkCount, 100);

// 옵션에 대한 함수 시작
let optionCounter = 0; // 옵션 카운터 변수

function addOption() {
  optionCounter++; // 옵션 카운터 증가

  // 옵션 추가를 위한 HTML 요소 생성
  let optionDiv = document.createElement("div");
  optionDiv.id = "optionDiv_" + optionCounter;

  let optionLabel = document.createElement("label");
  optionLabel.innerHTML = "옵션 : &nbsp;";
  
  let optionInput = document.createElement("input");
  optionInput.type = "text";
  optionInput.id = "option_" + optionCounter;
  optionInput.name = "optionNames"; // 각 옵션 필드에 동일한 이름 부여
  
  /* 수량 : 표시를 위한 라벨 추가  */
  let countLabel = document.createElement("label");
  countLabel.innerHTML = "수량 : &nbsp;";
  
  /* 옵션에 대한 수량 추가된 부분 */
  let countInput  = document.createElement("input"); // 수량 입력 필드 생성
  countInput.type = "number";
  countInput.id = "optionCount_" + optionCounter;
  countInput.name = "optionCounts"; // 각 수량 필드에 동일한 이름 부여

  let removeButton = document.createElement("button");
  removeButton.innerHTML = "X";
  removeButton.type = "button";
  removeButton.onclick = function() {
    removeOption(optionDiv.id);
  };
  // removeButton style
  removeButton.style.width = "30px";
  removeButton.style.height = "30px";
  removeButton.style.marginLeft = "14px";
  removeButton.style.border = "none";
  removeButton.style.borderRadius = "14px";
  removeButton.style.boxShadow = "1px 1px 3px rgba(0, 0, 0, 0.2)";

  // 생성한 HTML 요소를 addedOptionsContainer에 추가
  let addedOptionsContainer = document.getElementById("addedOptionsContainer");
  optionDiv.appendChild(optionLabel);
  optionDiv.appendChild(optionInput);
  optionDiv.appendChild(countLabel);
  optionDiv.appendChild(countInput); // 추가된 수량 입력 필드
  optionDiv.appendChild(removeButton);
  addedOptionsContainer.appendChild(optionDiv);
}

// 옵션 제거 함수
function removeOption(optionId) {
  let optionDiv = document.getElementById(optionId);
  if (optionDiv) {
    optionDiv.remove();
  }
}

// 취소 누를 때 이미지 + 옵션 초기화 시키는 함수
function resetForm() {
  document.getElementById("imageInput").value = "";
  document.getElementById("imagePreviewContainer").innerHTML = "";

  // 옵션 초기화
  var addedOptionsContainer = document.getElementById("addedOptionsContainer");
  if (addedOptionsContainer) {
    while (addedOptionsContainer.firstChild) {
      addedOptionsContainer.firstChild.remove();
    }
  }
  optionCounter = 0; // 옵션 카운터를 0으로 초기화합니다.

  // 카테고리 선택 초기화
  var selectedOption = document.querySelector('.selected');
  var hiddenInput = document.querySelector('#categoryInput');
  selectedOption.textContent = 'Select a category';
  hiddenInput.value = '';
}

// 취소 버튼 클릭 시 form을 초기화하고 이미지 미리보기 초기화
document.getElementById("resetBtn").addEventListener("click", function() {
  resetForm(); // 이미지 미리보기 초기화
});


//카테고리와 해당하는 숫자를 매핑한 객체를 생성
var categoryMap = {
    '의료소모품': 1,
    '수술기구': 2,
    '의료기기': 3,
    '건강용품': 4,
    '사무용품': 5
};

//카테고리 drop down 함수 시작
document.addEventListener("DOMContentLoaded", function() {
  var selectWrapper = document.querySelector('.select-wrapper');
  var selectedOption = selectWrapper.querySelector('.selected');
  var optionsList = selectWrapper.querySelector('.options');
  var hiddenInput = document.querySelector('#categoryInput');
  var isDropdownOpen = false;

  selectWrapper.addEventListener('click', function() {
    isDropdownOpen = !isDropdownOpen;
    if (isDropdownOpen) {
      optionsList.style.display = 'block';
    } else {
      optionsList.style.display = 'none';
    }
  });

  optionsList.addEventListener('click', function(e) {
    var target = e.target;
    if (target.tagName.toLowerCase() === 'li') {
      selectedOption.textContent = target.textContent;

      // 선택된 카테고리 값을 해당하는 숫자로 변환하여 hidden input의 value에 저장합니다.
      var selectedCategory = target.getAttribute('data-value');
      var categoryId = categoryMap[selectedCategory];
      hiddenInput.value = categoryId;

      optionsList.style.display = 'none';
      isDropdownOpen = false;
      e.stopPropagation();
    }
  });

  document.addEventListener('click', function(e) {
    var target = e.target;
    if (!selectWrapper.contains(target) && isDropdownOpen) {
      optionsList.style.display = 'none';
      isDropdownOpen = false;
    }
  });
});

function submitForm(event) {
	  event.preventDefault();

	  var categoryInput = document.getElementById("categoryInput");

	  console.log(categoryInput.value); // 카테고리 값 출력

	  // 카테고리 선택을 확인
	  if (!categoryInput.value) {
	    alert("카테고리를 선택해주세요.");
	    return; // 카테고리가 선택되지 않았다면 함수를 종료합니다.
	  }

	  var input = document.getElementById("productPrice");
	  var value = input.value;

	  // 쉼표를 제외한 숫자만 추출합니다.
	  var number = value.replace(/,/g, "");

	  // 숫자형태의 가격을 입력 필드에 설정합니다.
	  input.value = number;

	  // 파일을 선택합니다.
	  var fileInput = document.getElementById("imageInput");
	  var file = fileInput.files[0];

	  // 카테고리가 선택되었으며, 가격 형식이 맞춰졌다면 form을 제출합니다.
	  document.getElementById("product_form").submit();
	}
