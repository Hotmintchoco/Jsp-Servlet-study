function loginCheck() {
	if (document.frm.name.value.length == 0) {
		alert("회원성명이 입력되지 않았습니다");
		frm.name.focus();
		return false;
	}
	if (document.frm.address.value.length == 0) {
		alert("주소를 입력해주세요.");
		frm.address.focus();
		return false;
	}
	if (document.frm.phone.value.length == 0) {
		alert("전화번호를 입력해주세요.");
		frm.phone.focus();
		return false;
	}
	if (document.frm.city.value.length == "") {
		alert("도시코드를 입력하세요.");
		frm.city.focus();
		return false;
	}
	alert("회원정보수정이 완료 되었습니다!");
	return true;
}

function joinCheck() {
	if (document.frm.name.value.length == 0) {
		alert("회원성명이 입력되지 않았습니다");
		frm.name.focus();
		return false;
	}
	if (document.frm.address.value.length == 0) {
		alert("주소를 입력해주세요.");
		frm.address.focus();
		return false;
	}
	if (document.frm.phone.value.length == 0) {
		alert("전화번호를 입력해주세요.");
		frm.phone.focus();
		return false;
	}
	if (document.frm.city.value.length == "") {
		alert("도시코드를 입력하세요.");
		frm.city.focus();
		return false;
	}
	alert("회원등록이 완료 되었습니다!");
	return true;
}