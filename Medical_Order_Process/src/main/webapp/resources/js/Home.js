document.addEventListener("DOMContentLoaded", function() {
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

            slideButtons[currentSlide].classList.add('active-button');
        });
    });

    let timer = setInterval(function() {
        slides[currentSlide].style.opacity = 0;
        slideButtons[currentSlide].classList.remove('active-button');

        currentSlide = (currentSlide+1)%slides.length;
        slides[currentSlide].style.opacity = 1;
        slideButtons[currentSlide].classList.add('active-button');
    }, 5000);

    // 슬라이드 버튼에 마우스를 올리면 자동 슬라이드를 중지
    slideButtons.forEach(button => {
        button.addEventListener('mouseover', function() {
            clearInterval(timer);
        });
    });

    // 슬라이드 버튼에서 마우스를 떼면 자동 슬라이드를 다시 시작
    slideButtons.forEach(button => {
        button.addEventListener('mouseout', function() {
            timer = setInterval(function() {
                slides[currentSlide].style.opacity = 0;
                slideButtons[currentSlide].classList.remove('active-button');

                currentSlide = (currentSlide+1)%slides.length;
                slides[currentSlide].style.opacity = 1;
                slideButtons[currentSlide].classList.add('active-button');
            }, 5000);
        });
    });
});
