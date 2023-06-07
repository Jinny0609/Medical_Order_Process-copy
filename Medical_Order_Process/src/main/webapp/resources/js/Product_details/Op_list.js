const optionSelect = document.getElementById('option-select');
const tableContainer = document.getElementById('table-container');
const closeButton = document.getElementById('close-button');
const tableBody = document.getElementById('table-body');
let currentTableRows = [];

optionSelect.addEventListener('change', () => {
  const selectedOption = optionSelect.value;

  // 선택한 옵션에 따라 테이블 내용 업데이트
  updateTable(selectedOption);
});

function updateTable(selectedOption) {
  // 중복 테이블 확인
  const existingRows = currentTableRows.filter(row => row.getAttribute('data-option') === selectedOption);

  if (existingRows.length === 0) {
    // 선택한 옵션에 대한 테이블이 없으면 새로운 행 추가
    let newRow = document.createElement('tr');
    newRow.setAttribute('data-option', selectedOption);
    newRow.classList.add('table-row'); // CSS 클래스 추가

    switch (selectedOption) {
      case '1':
        newRow.innerHTML = `
          <td>옵션1: 1cc 25G, 5/8inch 박스(100개)</td>
          <td>
            <div class="quantity">
              <button class="decrease-btn">-</button>
              <input type="text" class="quantity-input" value="1">
              <button class="increase-btn">+</button>
            </div>
          </td>
          <td>가격1</td>
          <td><button class="delete-btn">X</button></td>
        `;
        break;
      case '2':
        newRow.innerHTML = `
          <td>옵션2: 1cc 26G, 1/2inch 박스(100개)</td>
          <td>
            <div class="quantity">
              <button class="decrease-btn">-</button>
              <input type="text" class="quantity-input" value="1">
              <button class="increase-btn">+</button>
            </div>
          </td>
          <td>가격2</td>
          <td><button class="delete-btn">X</button></td>
        `;
        break;
      case '3':
        newRow.innerHTML = `
          <td>옵션3: 3cc 23G, 1inch 박스(100개)</td>
          <td>
            <div class="quantity">
              <button class="decrease-btn">-</button>
              <input type="text" class="quantity-input" value="1">
              <button class="increase-btn">+</button>
            </div>
          </td>
          <td>가격3</td>
          <td><button class="delete-btn">X</button></td>
        `;
        break;
      default:
        return; // 선택된 옵션이 없으면 테이블을 업데이트하지 않습니다.
    }

    currentTableRows.push(newRow);
    tableBody.appendChild(newRow);
  }

  // 선택 창 초기화
  optionSelect.selectedIndex = 0;
}
// 수량 토글 버튼 이벤트 처리
tableBody.addEventListener('click', (event) => {
  if (event.target.classList.contains('decrease-btn')) {
    const quantityInput = event.target.nextElementSibling;
    let currentQuantity = parseInt(quantityInput.value);
    if (currentQuantity > 1) {
      quantityInput.value = --currentQuantity;
    }
  }

  if (event.target.classList.contains('increase-btn')) {
    const quantityInput = event.target.previousElementSibling;
    let currentQuantity = parseInt(quantityInput.value);
    quantityInput.value = ++currentQuantity;
  }

  if (event.target.classList.contains('delete-btn')) {
    const row = event.target.parentNode.parentNode;
    tableBody.removeChild(row);
    const option = row.getAttribute('data-option');
    currentTableRows = currentTableRows.filter(row => row.getAttribute('data-option') !== option);
  }
});

// 닫기 버튼 클릭 이벤트 처리
closeButton.addEventListener('click', () => {
  tableBody.innerHTML = '';
  currentTableRows = [];
});

// 마이정보 이동
function redirectMYpage() {
	window.location.href = '/Shipping_address_List';
}