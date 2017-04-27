<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=no">
        <title>JSP Page</title>
		<link href="/WebApplication/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
		<script src="/WebApplication/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
		<script src="/WebApplication/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
		<script>
			console.log(window.outerHeight);
			console.log(window.outerWidth);
			console.log(window.innerHeight);
			console.log(window.innerWidth);
			
			var pop1;
			var work1;
			var work2;
			var work3;
			function handleBtn1(){
				pop1 = window.open("/WebApplication/javascript/exam09","pop1","width=300, height=200");
			}
			function handleBtn2(){
				pop1.close();
			}
			function handleBtn3(){
				work1 = window.setInterval(function (){
					console.log(new Date);
				}, 1000);
				work2 = window.setInterval(function (){
					console.log("new Hello");
				}, 500);
			}
			function handleBtn4(){
				window.clearInterval(work1);
				window.clearInterval(work2);
			}
			function handleBtn5(){
				work3 = window.setTimeout(function(){
					console.log("Yahoooo~~");
				}, 3000);
			}
			function handleBtn6(){
				window.clearTimeout(work3);
			}
			function handleBtn7(){
				location.href = "/WebApplication/javascript/exam09";
			}
		</script>
    </head>
    <body>
		<h1>BOM사용하기</h1>
		<h3>Pop up</h3>
		<button class="btn btn-warning" onclick="handleBtn1()">팝업 열기</button>
		<button class="btn btn-danger" onclick="handleBtn2()">팝업 닫기</button>
		
		<h3>주기적 실행</h3>
		<button class="btn btn-warning" onclick="handleBtn3()">시작</button>
		<button class="btn btn-danger" onclick="handleBtn4()">중지</button>
		
		<h3>지연 실행</h3>
		<button class="btn btn-warning" onclick="handleBtn5()">시작</button>
		<button class="btn btn-danger" onclick="handleBtn6()">중지</button>
		
		<h3>요청 경로 변경</h3>
		<button class="btn btn-primary" onclick="handleBtn7()">경로 변경</button>
		
    </body>
</html>
