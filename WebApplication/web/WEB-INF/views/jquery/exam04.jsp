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
			function handleBtn1(){
				$.ajax({
					url:"/WebApplication/jquery/exam04_fragment",
					success: function(data){
						console.log(data);
						$("#div1").html(data);
					}
				});
			};
			function handleBtn2(){
				$.ajax({
					url:"/WebApplication/jquery/exam04_json",
					success: function(data){
						for(var i=0 ; i<data.length ; i++){
							var fileName = data[i].fileName;
							var message = data[i].message;
							
							var html_fragment="";
							html_fragment += '<div>';
							html_fragment += '<img src="/WebApplication/resources/image/'+ fileName +'" width="150px" height="150px"/>';
							html_fragment += '<span>'+ message +'</span>';
							html_fragment += '</div>';
							
							$("#div2").append(html_fragment);
						}
					}
				});
			};
		</script>
		<style>
			div{
				border: 1px solid black;
			}
		</style>
    </head>
		<h1>Ajax</h1>
		
		<div class="container">
			<div class="row">
				<div class="col-sm-6">
					<button onclick="handleBtn1()">HTML 조각 받아오기</button>
					<div id="div1">
						
					</div>
				</div>
				<div class="col-sm-6">
					<button onclick="handleBtn2()">JSON 데이터 받아오기</button>
					<div id="div2">
						
					</div>
				</div>
			</div>
		</div>
    <body>
    </body>
</html>
