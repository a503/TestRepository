<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>JSP Page</title>
		<script>
			function total(from, to) {
				console.log("from : " + from);
				console.log("to : " + to);
				console.log(to == undefined);
				var sum = 0;
				for (var i = from; i <= to; i++) {
					sum += i;
				}
				return sum;
			}
			var result = total(1, 100);
			console.log("result : " + result);
			
			result = total(100);
			console.log("result : " + result);
		</script>
    </head>
    <body>
    </body>
</html>
