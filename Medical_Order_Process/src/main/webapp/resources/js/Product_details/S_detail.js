window.addEventListener('DOMContentLoaded', () => {
  const toggleDescription = document.getElementById('toggleDescription');
  const toggleIcon = document.getElementById('toggleIcon');
  const productDescription = document.getElementById('productDescription');
  

let isDescriptionOpen = false;

toggleDescription.addEventListener('click', () => {
  if (isDescriptionOpen) {
    toggleDescription.textContent = '제품설명 더보기';
    toggleIcon.classList.remove('bi-arrow-up-short');
    toggleIcon.classList.add('bi-arrow-down-short');
    productDescription.style.display = 'none'; // 상세 설명 숨기기
  } else {
    toggleDescription.textContent = '제품설명 닫기';
    toggleIcon.classList.remove('bi-arrow-down-short');
    toggleIcon.classList.add('bi-arrow-up-short');
    productDescription.style.display = 'block'; // 상세 설명 표시
  }
  
  isDescriptionOpen = !isDescriptionOpen;
	});
});