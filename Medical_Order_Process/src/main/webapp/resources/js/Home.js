document.addEventListener("DOMContentLoaded", function() {
  let slideIndex = 0;
  const slides = document.getElementsByClassName('slide');

  function showSlide() {
    for (let i = 0; i < slides.length; i++) {
      slides[i].style.opacity = 0;
    }
    slides[slideIndex].style.opacity = 1;
    slideIndex = (slideIndex + 1) % slides.length;
  }

  showSlide();
  setInterval(showSlide, 3000); // 3초마다 슬라이드 이미지 변경
});
