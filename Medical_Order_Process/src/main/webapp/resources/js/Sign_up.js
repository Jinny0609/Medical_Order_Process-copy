function Validation() {
    // Variable assignments
    var email = document.getElementById("email").value;
    var pw = document.getElementById("pw").value;
    var cpw = document.getElementById("cpw").value;
    var name = document.getElementById("name").value;
    var phone = document.getElementById("phone").value;

    // Regular expressions
    // Email
    var regMail = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;
    // Password
    var regIdPw = /^[a-zA-Z0-9]{4,12}$/;
    // Name
    var regName = /^[가-힣a-zA-Z]{2,15}$/;
    // Phone number
    var regPhone = /^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$/;

    // Email validation
    var emailErrorMsg = document.getElementById("EmailErrorMsg");
    if (email.length == 0) {
        emailErrorMsg.innerText = "이메일 주소를 입력하세요.";
        document.getElementById("email").focus();
        return false;
    } else if (!regMail.test(email)) {
        emailErrorMsg.innerText = "잘못된 이메일 형식입니다.";
        document.getElementById("email").focus();
        return false;
    } else {
        emailErrorMsg.innerText = ""; // Remove error message if validation passes
    }

    // Password validation
    var pwErrorMsg = document.getElementById("PWErrorMsg");
    if (pw == "") {
        pwErrorMsg.innerText = "비밀번호를 입력하세요.";
        document.getElementById("pw").focus();
        return false;
    } else if (!regIdPw.test(pw)) {
        pwErrorMsg.innerText = "4~12자 영문 대소문자, 숫자만 입력하세요.";
        document.getElementById("pw").focus();
        return false;
    } else {
        pwErrorMsg.innerText = ""; // Remove error message if validation passes
    }

    // Confirm password validation
    var cpwErrorMsg = document.getElementById("CPWErrorMsg");
    if (cpw !== pw) {
        cpwErrorMsg.innerText = "비밀번호와 동일하지 않습니다.";
        document.getElementById("cpw").focus();
        return false;
    } else {
        cpwErrorMsg.innerText = ""; // Remove error message if validation passes
    }

    // Name validation - only Korean and English characters allowed
    var nameErrorMsg = document.getElementById("NameErrorMsg");
    if (name == "") {
        nameErrorMsg.innerText = "이름을 입력하세요.";
        document.getElementById("name").focus();
        return false;
    } else if (!regName.test(name)) {
        nameErrorMsg.innerText = "최소 2글자 이상, 한글과 영어만 입력하세요.";
        document.getElementById("name").focus();
        return false;
    } else {
        nameErrorMsg.innerText = ""; // Remove error message if validation passes
    }

    // Phone number validation
    var phoneErrorMsg = document.getElementById("PhoneErrorMsg");
    if (phone == "") {
        phoneErrorMsg.innerText = "휴대폰 번호를 입력하세요.";
        document.getElementById("phone").focus();
        return false;
    } else if (!regPhone.test(phone)) {
        phoneErrorMsg.innerText = "잘못된 휴대폰 번호 형식입니다.";
        document.getElementById("phone").focus();
        return false;
    } else {
        phoneErrorMsg.innerText = ""; // Remove error message if validation passes
    }

    var enteredHCode = document.getElementsByName("hcode")[0].value; // 입력된 병원 코드 가져오기
	var hcodeInputs = document.getElementsByClassName("hcode-input");
	var validCodes = []; // 유효한 병원 코드 배열 생성

	for (var i = 0; i < hcodeInputs.length; i++) {
		validCodes.push(hcodeInputs[i].value); // 유효한 병원 코드를 배열에 추가합니다
	}

	if (!validCodes.includes(enteredHCode)) {
		alert("올바른 병원 코드를 입력하세요.");
		return false;
	}

	return true;
}