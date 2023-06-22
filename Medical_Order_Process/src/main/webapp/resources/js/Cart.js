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

function deleteCartItem(productId) {
	  // 서버로 삭제 요청을 보내는 Ajax 호출을 수행합니다.
	  var xhr = new XMLHttpRequest();
	  xhr.open("POST", "/Cart_delete", true);
	  xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	  xhr.onreadystatechange = function() {
	    if (xhr.readyState === XMLHttpRequest.DONE) {
	      if (xhr.status === 200) {
	        // 삭제가 성공적으로 처리되면 페이지를 새로고침하여 변경된 장바구니 목록을 표시합니다.
	        location.reload();
	      } else {
	        // 삭제가 실패한 경우 에러 처리를 합니다.
	        console.error("상품 삭제 실패");
	      }
	    }
	  };
	  xhr.send("product_id=" + productId);
	}
