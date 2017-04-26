function total(from, to) {
	var sum = 0;
	for (var i = from; i <= to; i++) {
		sum += i;
	}
	return sum;
}
//var result = total(1, 100);
//console.log("result : " + result);

//result = total(100);
//console.log("result : " + result);

function handleBtnOk(){
	console.log("ok 버튼을 클릭함");
}