document.addEventListener("DOMContentLoaded", function() {
  // banner slider[start]
  let slides = Array.from(document.querySelectorAll('.slide'));
  let currentSlide = 0;
  let slideButtons = Array.from(document.querySelectorAll('.slide-button'));

  slideButtons[currentSlide].classList.add('active-button');

  slideButtons.forEach((button, index) => {
    button.addEventListener('mouseover', function() {
      slideButtons[currentSlide].classList.remove('active-button');

      let targetSlide = parseInt(button.getAttribute('data-slide'));
      slides[currentSlide].style.opacity = 0;
      currentSlide = targetSlide;
      slides[currentSlide].style.opacity = 1;

      slideButtons.forEach((btn) => {
        btn.classList.remove('active-button');
      });
      slideButtons[currentSlide].classList.add('active-button');
    });

    button.addEventListener('mouseover', function() {
      clearInterval(timer);
    });

    button.addEventListener('mouseout', function() {
      timer = setInterval(function() {
        slides[currentSlide].style.opacity = 0;
        slideButtons[currentSlide].classList.remove('active-button');

        currentSlide = (currentSlide + 1) % slides.length;
        slides[currentSlide].style.opacity = 1;

        slideButtons.forEach((btn) => {
          btn.classList.remove('active-button');
        });
        slideButtons[currentSlide].classList.add('active-button');
      }, 5000);
    });
  });

  let timer = setInterval(function() {
    slides[currentSlide].style.opacity = 0;
    slideButtons[currentSlide].classList.remove('active-button');

    currentSlide = (currentSlide + 1) % slides.length;
    slides[currentSlide].style.opacity = 1;

    slideButtons.forEach((btn) => {
      btn.classList.remove('active-button');
    });
    slideButtons[currentSlide].classList.add('active-button');
  }, 5000);
  
  // group_slider[start]
  let slideIndex = 0;  // 현재 보고 있는 슬라이드의 인덱스
  const slideGroups = document.querySelector('.slide-groups');
  const groupSlides = document.querySelectorAll('.group_slide');

  // 다음 버튼 클릭 이벤트
  document.querySelector('.next-button').addEventListener('click', () => {
    if(slideIndex < groupSlides.length - 5) {  // 5장이 최대로 보여지므로, 마지막에서 5장 이전까지만 움직이게 합니다.
      slideIndex++;
      slideGroups.style.transform = `translateX(${-180 * slideIndex}px)`;
      // 한 장당 160px, 슬라이드 사이 간격이 20px이므로 총 180px만큼 이동합니다.
    }
  });

  // 이전 버튼 클릭 이벤트
  document.querySelector('.prev-button').addEventListener('click', () => {
    if(slideIndex > 0) {
      slideIndex--;
      slideGroups.style.transform = `translateX(${-180 * slideIndex}px)`;
    }
  });

});
