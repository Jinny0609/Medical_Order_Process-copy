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
	
	//상품 총합
	 document.addEventListener("DOMContentLoaded", function() {
	        calculateTotalPrice();
	    });

	    function calculateTotalPrice() {
	        var total = 0;
	        var items = document.querySelectorAll('.Cart_list_detail');
	        items.forEach(function(item) {
	            var priceElement = item.querySelector('.Price');
	            var countElement = item.querySelector('input[type="number"]');
	            var price = parseInt(priceElement.dataset.price);
	            var count = parseInt(countElement.value);
	            var subTotalElement = item.querySelector('.SubTotal');
	            var subTotal = price * count;

	            subTotalElement.textContent = subTotal.toLocaleString() + '원';
	            total += subTotal;
	        });

	        var totalPriceElement = document.getElementById('totalPrice');
	        var orderPriceElement = document.getElementById('orderPrice');

	        totalPriceElement.textContent = total.toLocaleString() + '원';
	        orderPriceElement.textContent = (total + 2500).toLocaleString() + '원';
	    }
}	    