<%-- 
    Document   : exam01
    Created on : 2017. 4. 28, 오전 11:15:21
    Author     : ijeongsu
--%>

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <title>JSP Page</title>
    <link href="<%=application.getContextPath() %>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <script src="<%=application.getContextPath() %>/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script src="<%=application.getContextPath() %>/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
  </head>
  <body>
    <h1>java.util.Calendar</h1>
    <%
	    Calendar now = Calendar.getInstance();
	    int year=now.get(Calendar.YEAR);
	    int month=now.get(Calendar.MONTH)+1;  
	    int date=now.get(Calendar.DAY_OF_MONTH);
	    
    %>
    <%=year%>년 <%=month%>월 <%=date%>
  </body>
</html>
