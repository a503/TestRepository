<%-- 
    Document   : exam02
    Created on : 2017. 4. 26, 오전 11:37:34
    Author     : ijeongsu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>JSP Page</title>
    <script>
	function totalSum(from, to){
	  if(to==undefined){
	    to=from;
	    from=1;
	  }
	  var sum =0;
	  for(var i=from; i<=to; i++){
	    sum+=i;
	  }
	  return sum;
	}
	
	var result=totalSum(1,100);
	console.log("result:"+result);
	
	var result2=totalSum(100);
    </script>
  </head>
  <body>
  </body>
</html>
