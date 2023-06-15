// 파일 선택 트릭
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
	  var input = document.getElementById("priceInput");
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
    var countInput = document.getElementById('countInput');
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

//Check the input field every 100 milliseconds
setInterval(checkCount, 100);

//옵션에 대한 함수 시작
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

//전송버튼 이벤트
function submitForm(event) {
    event.preventDefault(); // 폼의 기본 동작인 페이지 새로고침을 방지합니다.
    var url = "/Product_add"// 요청을 보낼 URL
    
    var imageInput = document.getElementById('imageInput');
    var nameInput = document.getElementById('nameInput').value;
    var priceInput = document.getElementById('priceInput').value;
    var countInput = document.getElementById('countInput').value;
    
    var productInfo = {
	    productName: nameInput,
	    productPrice: priceInput,
	    productCount: countInput,
	    // 여기에 추가 필드가 있으면 계속 추가
	};

    var formData = new FormData();
    // formData.append('product_image', imageInput.files[0]); 나중에 테스트하려고 주석처리함 2023-06-14 오전 10:15
    
//    formData.append('product_name', nameInput);
//    formData.append('product_price', priceInput);
//    formData.append('product_count', countInput);
    
    // ProductInfo 객체를 JSON 문자열로 변환하여 폼 데이터에 추가
    formData.append('productInfo', JSON.stringify(productInfo));
    
//    // 옵션 데이터를 배열로 저장 - 옵션 나중에 테스트하려고 주석처리함 2023-06-14 오전 10:15
//    let options = [];
//    for(let i = 1; i <= optionCounter; i++) {
//      let optionValue = document.getElementById('option_' + i).value;
//      options.push(optionValue);
//    }
//    // 옵션 데이터를 JSON 문자열로 변환하여 폼 데이터에 추가
//    formData.append('product_option', JSON.stringify(options));
//    formData.append('options', JSON.stringify(options)); 
    
    fetch(url, {
        method: 'POST',
        body: formData,
    })
    .then(response => response.json())
    .then(data => console.log(data))
    .catch(error => console.error('Error:', error)); // 에러가 발생하면 에러를 콘솔에 출력합니다.
  
    alert('제품이 등록되었습니다.');

    // 전송 후 전체 폼 초기화 -> 사실 다른페이지로 이동하면 필요없음 나중에 처리
    event.target.reset();
//    document.getElementById('imagePreviewContainer').innerHTML = '';	나중에 테스트하려고 주석처리함 2023-06-14 오전 10:15
}

//취소 누를때 이미지 + 옵션 초기화 시키는 함수
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


//취소 버튼 클릭 시 form을 초기화하고 이미지 미리보기 초기화
document.getElementById("resetBtn").addEventListener("click", function() {
resetForm(); // 이미지 미리보기 초기화
//document.getElementById("imageInput").onchange(); // 이미지 input 값 초기화
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
            
            // 선택된 카테고리를 해당하는 숫자로 변환하여 hidden input의 value에 저장합니다.
            var selectedCategory = target.getAttribute('data-value');
            var categoryId = categoryMap[selectedCategory];
            hiddenInput.value = categoryId;
            
            optionsList.style.display = 'none';
            isDropdownOpen = false;
            e.stopPropagation();  // 이벤트 전파를 멈추는 코드를 추가(이벤트 버블링 : 해당 이벤트가 상위의 요소로 전달)
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


