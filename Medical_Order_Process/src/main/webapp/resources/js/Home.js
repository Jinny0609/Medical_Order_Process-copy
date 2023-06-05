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
  
//group_slider[start]
  let slideIndex = 0;  // 현재 보고 있는 슬라이드의 인덱스
  const slideGroups = document.querySelector('.slide-groups');
  const groupSlides = document.querySelectorAll('.group_slide');
  const prevButton = document.querySelector('.prev-button');  // 이전 버튼
  const nextButton = document.querySelector('.next-button');  // 다음 버튼

  // 초기 상태 설정
  if(slideIndex === 0) {
    prevButton.style.display = 'none';  // 처음 위치에서는 이전 버튼을 숨깁니다.
  }
  if(slideIndex === groupSlides.length - 5) {
    nextButton.style.display = 'none';  // 마지막 위치에서는 다음 버튼을 숨깁니다.
  }

  // 다음 버튼 클릭 이벤트
  nextButton.addEventListener('click', () => {
    if(slideIndex < groupSlides.length - 5) {
      slideIndex += 5; // 5장씩 이동
      slideGroups.style.transform = `translateX(${-204 * slideIndex}px)`;

      // 상태 업데이트
      if(slideIndex > 0) {
        prevButton.style.display = 'inline-block';  // 이전 버튼을 보이게 합니다.
      }
      if(slideIndex >= groupSlides.length - 5) {
        nextButton.style.display = 'none';  // 마지막 위치에서는 다음 버튼을 숨깁니다.
      }
    }
  });

  // 이전 버튼 클릭 이벤트
  prevButton.addEventListener('click', () => {
    if(slideIndex > 0) {
      slideIndex -= 5; // 5장씩 이동
      slideGroups.style.transform = `translateX(${-204 * slideIndex}px)`;

      // 상태 업데이트
      if(slideIndex < groupSlides.length - 5) {
        nextButton.style.display = 'inline-block';  // 다음 버튼을 보이게 합니다.
      }
      if(slideIndex === 0) {
        prevButton.style.display = 'none';  // 처음 위치에서는 이전 버튼을 숨깁니다.
      }
    }
  });

});
