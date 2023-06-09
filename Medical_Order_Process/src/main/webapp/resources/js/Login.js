function Validation() {
    // 변수에 저장
    var mail = document.getElementById("Email");
    var pw = document.getElementById("Password");

    // 정규식
    // pw
    var regIdPw = /^[a-zA-Z0-9]{4,12}$/;
    // 이메일(아이디)
    var regMail = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;
    
    //메일주소 확인
    if (mail.value.length == 0) {
        document.getElementById("emailErrorMsg").innerText = "메일주소를 입력하세요.";
        mail.focus();
        return false;
    } else if (!regMail.test(mail.value)) {
        document.getElementById("emailErrorMsg").innerText = "잘못된 이메일 형식입니다.";
        mail.focus();
        return false;
    } else {
        document.getElementById("emailErrorMsg").innerText = "";
    }

    //비밀번호 확인
    if (pw.value == "") {
        document.getElementById("passwordErrorMsg").innerText = "비밀번호를 입력하세요.";
        pw.focus();
        return false;
    } else if (!regIdPw.test(pw.value)) {
        document.getElementById("passwordErrorMsg").innerText = "4~12자 영문 대소문자, 숫자만 입력하세요.";
        pw.focus();
        return false;
    } else {
        document.getElementById("passwordErrorMsg").innerText = "";
    }

    // 포커스 해제
    pw.blur();
    mail.blur();
}
