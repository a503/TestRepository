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
			function changeDivContent(){
				$("#div1").html("<p>변경될 내용</p>");
				$("#div1").append("<p>변경될 내용</p>");
			};
			function changeCSS(){
				$("#div3").css("background-color", "#ffff00");
				$("#div3").css("width", "500px");
			};
			
		</script>
    </head>
    <body>
		<h1>DOM 내용 변경</h1>
		
		<h3>div 내용 변경</h3>
		<a href="javascript:changeDivContent()" class="btn btn-success">div 내용 변경</a>
		<div id="div1">
			<img src="/WebApplication/resources/image/photo01.jpg" width="300px" height="300px"/>
		</div>
		<div id="div2">
			<img src="/WebApplication/resources/image/photo02.jpg" width="300px" height="300px"/>
		</div>
		
		<h3>css 내용 변경</h3>
		<a href="javascript:changeCSS()" class="btn btn-success">css 내용 변경</a>
		<div id="div3" style="border: 1px solid black; width: 300px; height: 300px">
			
		</div>
    </body>
</html>
