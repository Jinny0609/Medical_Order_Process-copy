function execDaumPostcode() {
	new daum.Postcode({
		oncomplete : function(data) {
			document.getElementById('zip-code').value = data.zonecode;
			document.getElementById('address-1').value = data.address;
		}
	}).open();
}

// 배송지 추가버튼 누를시 배송지 정보 등록페이지 이동
function redirectToJSP() {
	window.location.href = '/Shipping_address_New';
}

function redirectToPage() {
	window.location.href = '/Shipping_address_Edit';
}