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
			var v1 = "100";
			var v2 = v1 + 200;
			console.log(v2);
			
			var v3 = parseInt(v1) + 200;
			console.log(v3);
			
			var v4 = String(10) + " 점"; // = 10 + " 점"; 잘 사용하지 않는다.
			
		</script>
    </head>
    <body>
		<h1>Global Function</h1>
    </body>
</html>
