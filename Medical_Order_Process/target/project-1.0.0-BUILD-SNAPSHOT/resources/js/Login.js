function validateForm() {
    // 변수에 저장
    var emailInput = document.getElementById("Email");
    var passwordInput = document.getElementById("Password");

    // 정규식
    var regIdPw = /^[a-zA-Z0-9]{4,12}$/;
    var regMail = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;

      // 이메일 주소 확인
      if (emailInput.value === "") {
        showError("emailErrorMsg", "메일주소를 입력하세요.");
        emailInput.focus();
        return false;
    } else if (!regMail.test(emailInput.value)) {
        showError("emailErrorMsg", "잘못된 이메일 형식입니다.");
        emailInput.focus();
        return false;
    } else {
        document.getElementById("emailErrorMsg").innerText = "";
    }

    // 비밀번호 확인
    if (passwordInput.value === "") {
        showError("passwordErrorMsg", "비밀번호를 입력하세요.");
        passwordInput.focus();
        return false;
    } else if (!regIdPw.test(passwordInput.value)) {
        showError("passwordErrorMsg", "4~12자 영문 대소문자, 숫자만 입력하세요.");
        passwordInput.focus();
        return false;
    } else {
        document.getElementById("emailErrorMsg").innerText = "";
    }

    // 유효성 검사 통과
    passwordInput.blur();
    emailInput.blur();
    return true;
}

function showError(elementId, message) {
    var errorElement = document.getElementById(elementId);
    errorElement.textContent = message;
}
