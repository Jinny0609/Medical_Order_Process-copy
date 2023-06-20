//파일 선택 트릭
document.addEventListener('DOMContentLoaded', (event) => {
  document.getElementById('imageInput').onchange = function (event) {
    previewImage(event);
    document.getElementById('fileText').value = event.target.files[0].name;
    
    // 선택된 파일을 업로드합니다.
    var file = event.target.files[0];
    uploadImageFile(file, function(response) {
      console.log('Image uploaded successfully!');
      console.log(response);  // 업로드에 성공했을 때의 응답을 로그에 출력합니다.
    }, function(jqXHR, textStatus, errorThrown) {
      console.log('Failed to upload image: ' + textStatus);
    });
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
  var countInput = document.getElementById('productCount');
  var count = parseInt(countInput.value);

  if (isNaN(count)) {
    countInput.value = '';
  } else if (count > 30) {
    var errorMessage = document.getElementById('countErrorMessage');
    errorMessage.style.display = 'inline';
    setTimeout(function() {
      errorMessage.style.display = 'none';
      countInput.value = 30;
    }, 1000);
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
//  optionInput.name = "option_name_" + optionCounter; // 각 옵션 필드에 고유한 이름 부여

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

//새로 수정한 saveOption 함수
function saveOption(optionId) {
  let optionInputs = document.getElementsByName('option_name[]');
  let optionNames = Array.from(optionInputs).map((input) => input.value);

  // 옵션 정보를 서버로 보내는 AJAX 또는 fetch 요청을 작성합니다.
  var xhr = new XMLHttpRequest();
  xhr.open("POST", "/Product_add", true); // 컨트롤러의 URL을 지정합니다.
  xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");

  var data = {
    optionNames: optionNames
  };

  xhr.onreadystatechange = function() {
    if (xhr.readyState === 4 && xhr.status === 200) {
      // 요청이 성공적으로 처리되었을 때의 로직을 작성합니다.
      console.log(xhr.responseText);
    }
  };

  xhr.send(JSON.stringify(data));
}


// 쉼표, + 카테고리 미선택 시 발생하는 오류 해결 하기 위해 추가
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

	  // 카테고리가 선택되었으며, 가격 형식이 맞춰졌다면 form을 제출합니다.
	  document.getElementById("product_form").submit();
	}


