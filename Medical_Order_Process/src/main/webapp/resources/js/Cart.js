window.onload = function() {
	  // 전체 선택을 위한 체크박스 요소
	  var selectAllCheckbox = document.querySelector('thead input[type="checkbox"]');
	  // 개별 상품 선택을 위한 체크박스 요소들
	  var checkboxes = document.querySelectorAll('tbody input[type="checkbox"]');

	  // 전체 선택 체크박스를 클릭했을 때 이벤트 처리
	  selectAllCheckbox.addEventListener('change', function() {
	    var isChecked = this.checked;

	    // 개별 상품 체크박스들의 상태를 변경
	    checkboxes.forEach(function(checkbox) {
	      checkbox.checked = isChecked;
	    });
	  });
	};

	function updatePrice(input, price) {
        var quantity = input.value;

        var totalPrice = quantity * price;
        var priceElement = input.parentNode.parentNode.nextElementSibling.querySelector('.Price');
        priceElement.textContent = totalPrice + '원';
    }