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
  
// 전송버튼 이벤트
  function submitForm(event) {
	  event.preventDefault(); // 폼의 기본 동작인 페이지 새로고침을 방지합니다.

	  var imageInput = document.getElementById('imageInput');
	  var nameInput = document.getElementById('nameInput').value;
	  var priceInput = document.getElementById('priceInput').value;

	  var formData = new FormData();
	  formData.append('image', imageInput.files[0]);
	  formData.append('name', nameInput);
	  formData.append('price', priceInput);

	  // 서버로 이미지 파일과 함께 데이터를 전송합니다.
	  // AJAX 또는 폼 전송 방식을 사용하여 서버에 전송할 수 있습니다.

	  // 전송 후에 필요한 동작을 수행할 수 있습니다.
	  alert('제품이 등록되었습니다.');

	  // 전체 폼 초기화
	  event.target.reset();
	  document.getElementById('imagePreviewContainer').innerHTML = '';
	}
  
//취소 누를때 이미지 초기화 시키는 함수
function resetForm() {
  document.getElementById("imageInput").value = "";
  document.getElementById("imagePreviewContainer").innerHTML = "";
}

// 취소 버튼 클릭 시 form을 초기화하고 이미지 미리보기 초기화
document.getElementById("resetBtn").addEventListener("click", function() {
  resetForm(); // 이미지 미리보기 초기화
  document.getElementById("imageInput").onchange(); // 이미지 input 값 초기화
});


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


// 옵션에 대한 함수 시작
let optionCounter = 0; // 옵션 카운터 변수

function addOption() {
  optionCounter++; // 옵션 카운터 증가

  // 옵션 추가를 위한 HTML 요소 생성
  let optionDiv = document.createElement("div");
  optionDiv.id = "optionDiv_" + optionCounter;

  let optionLabel = document.createElement("label");
  optionLabel.innerHTML = "옵션 : &nbsp;";	// 옵션 : &nbsp -> 띄어쓰기

  let optionInput = document.createElement("input");
  optionInput.type = "text";
  optionInput.id = "option_" + optionCounter;

  let removeButton = document.createElement("button");
  removeButton.innerHTML = "X";
  removeButton.type = "button"; // 버튼의 타입을 "button"으로 설정
  removeButton.onclick = new Function('removeOption(' + optionCounter + ')');

  // 생성한 HTML 요소를 optionContainer에 추가
  let optionContainer = document.getElementById("optionContainer");
  optionDiv.appendChild(optionLabel);
  optionDiv.appendChild(optionInput);
  optionDiv.appendChild(removeButton);
  optionContainer.appendChild(optionDiv);
}

function removeOption(optionId) {
	  let optionDiv = document.querySelector("#optionContainer div[id='optionDiv_" + optionId + "']");
	  if (optionDiv) {
	    optionDiv.remove();
	  }
	}