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
		<style>
			div{
				border: 1.5px #66ff99 solid;
				width: 10%;
			}
		</style>
	</head>
	<body>
		WebApplication Home
		<hr/>
		<div style="margin: 10px;">
			<h4>HTML Tag</h4>
			<a href="html/exam01">exam01</a><br/>
		</div>
		<div style="margin: 10px;">
			<h4>CSS Tag</h4>
			<a href="css/exam01">exam01</a><br/>
			<a href="css/exam02">exam02</a><br/>
			<a href="css/exam03">exam03</a><br/>
		</div>
		<div style="margin: 10px;">
			<h4>JavaScript Tag</h4>
			<%for (int i = 1; i <= 11; i++) {
					String exam;
					if (i < 10) {
						exam = "0" + i;
					} else {
						exam = String.valueOf(i);
					}%>
			<a href="javascript/exam<%=exam%>">exam<%=exam%></a><br/>
			<%}%>
		</div>
		<div style="margin: 10px;">
			<h4>jQuery Tag</h4>
			<%for (int i = 1; i <= 4; i++) {
					String exam = "exam0";
					exam += String.valueOf(i);
			%>
			<a href="jquery/<%=exam%>"><%=exam%></a><br/>
			<%}%>
		</div>
		<div style="margin: 10px;">
			<h4>Bootstrap Tag</h4>
			<%for (int i=1 ; i<=3 ; i++){
				String exam;
				exam = "0" + i;
			%>
			<a href="bootstrap/exam<%=exam%>">exam<%=exam%></a><br/>
			<%}%>
		</div>
		<div style="margin: 10px;">
			<h4>JSP Tag</h4>
			<%for (int i=1 ; i<=5 ; i++){
				String exam;
				exam = "0" + i;
			%>
			<a href="jsp/exam<%=exam%>">exam<%=exam%></a><br/>
			<%}%>
		</div>
	</body>
</html>