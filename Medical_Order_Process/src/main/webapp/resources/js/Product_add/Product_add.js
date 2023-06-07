function toggleSelect() {
    var toggleBtn = document.getElementById('toggleBtn');
    var categoryList = document.getElementById('categoryList');

    if (toggleBtn.style.backgroundColor === '#0099FF') {
      toggleBtn.style.backgroundColor = ''; // 기본 색상으로 변경
      categoryList.style.display = 'none'; // 숨김
    } else {
      toggleBtn.style.backgroundColor = '#0099FF'; // 하늘색으로 변경
      categoryList.style.display = 'block'; // 보이기
    }
  }

  function selectCategoryItem(category) {
    var categoryList = document.getElementById('categoryList');
    var items = categoryList.getElementsByTagName('li');

    for (var i = 0; i < items.length; i++) {
      items[i].classList.remove('selected'); // 모든 항목에서 선택된 스타일 제거
    }

    var selectedItem = event.target;
    selectedItem.classList.add('selected'); // 선택된 항목에 스타일 추가
  }
  
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
	  document.getElementById('imageInput').value = '';
	  document.getElementById('nameInput').value = '';
	  document.getElementById('priceInput').value = '';
	  document.querySelector('#categoryList .selected').classList.remove('selected');
}
