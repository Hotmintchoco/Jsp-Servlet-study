function vote() {
	if(document.frm.jumin.value.length == 0) {
		alert("주민번호가 입력되지 않았습니다!");
		frm.jumin.focus;
		return false;
	}
	if(document.frm.name.value.length == 0) {
		alert("성명이 입력되지 않았습니다!");
		frm.name.focus;
		return false;
	}
	if(document.frm.num.value.length == 0) {
		alert("후보번호가 선택되지 않았습니다!");
		frm.num.focus;
		return false;
	}
	if(document.frm.time.value.length == 0) {
		alert("투표시간이 입력되지 않았습니다!");
		frm.time.focus;
		return false;
	}
	if(document.frm.time.value.length == 0) {
		alert("투표장소가 입력되지 않았습니다!");
		frm.time.focus;
		return false;
	}
	if(document.frm.check.value.length == 0) {
		alert("유권자확인이 선택되지 않았습니다!");
		frm.check.focus;
		return false;
	}
	alert("투표하기 정보가 정상적으로 등록 되었습니다!")
	return true;
}

function reset() {
	alert("정보를 지우고 처음부터 다시 입력합니다.")
	frm.jumin.focus;
	return true;
}