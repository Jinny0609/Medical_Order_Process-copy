var optionPrices = {};

function toggleOptionList() {
  var optionList = document.getElementById("optionList");
  var optionLabel = document.querySelector(".option-label");

  if (optionList.style.display === "none") {
    optionList.style.display = "block";
    optionLabel.textContent = "옵션 ▲";
  } else {
    optionList.style.display = "none";
    optionLabel.textContent = "옵션 ▼";
  }
}

function toggleOption(li, price) {
  var optionText = li.textContent;
  var optionContainer = document.getElementById("optionList");
  var optionLabel = document.querySelector(".option-label");

  var selectedOption = document.querySelector(".option-item[data-option='" + optionText + "']");

  if (!selectedOption) {
    li.classList.add("selected");
    createQuantityInput(li, price);
    optionPrices[optionText] = price;
  }

  calculatePrice();

  optionContainer.style.display = "none";
  optionLabel.textContent = "옵션 ▼";
}

function createQuantityInput(li, price) {
  var quantityContainer = document.getElementById("quantityContainer");
  var optionItem = document.createElement("div");
  optionItem.classList.add("option-item");
  optionItem.dataset.option = li.textContent;
  optionItem.innerHTML = `
    <label class="quantity-label">${li.textContent}</label>
    <input class="quantity-input" type="number" min="1" value="1" onchange="calculatePrice()" data-option="${li.textContent}" data-price="${price}">
    <button class="remove-button" onclick="removeQuantityInput('${li.textContent}')">X</button>
  `;

  quantityContainer.appendChild(optionItem);
}

function removeQuantityInput(optionText) {
  var quantityContainer = document.getElementById("quantityContainer");
  var optionItem = document.querySelector(".option-item[data-option='" + optionText + "']");

  if (optionItem) {
    quantityContainer.removeChild(optionItem);
    delete optionPrices[optionText];
  }

  if (quantityContainer.childElementCount === 0) {
    quantityContainer.innerHTML = "";
  }

  calculatePrice();
}

function calculatePrice() {
  var quantityInputs = document.getElementsByClassName("quantity-input");
  var totalPrice = 0;

  for (var i = 0; i < quantityInputs.length; i++) {
    var input = quantityInputs[i];
    var price = parseInt(input.getAttribute("data-price"));
    var quantity = parseInt(input.value);

    totalPrice += price * quantity;
  }

  document.getElementById("price").textContent = totalPrice;

  var priceContainer = document.getElementById("priceContainer");

  if (totalPrice > 0) {
    priceContainer.style.display = "block";
  } else {
    priceContainer.style.display = "none";
  }
}

// 마이정보 이동
function redirectMYpage() {
	window.location.href = '/Shipping_address_List';
}