<%-- 
    Document   : exam01
    Created on : 2017. 5. 11, 오후 2:26:16
    Author     : kang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>요청 HTTP 정보 얻기(GET) </h1>
        요청 방식(method): ${method} <br/>
        요청 URI : ${URI} <br/>
        요청 queryString : ${qS} <br/>
        요청 Parameter(type) : ${type} <br/>
        요청 Parameter(bno) : ${bno} <br/>
        요청 Parameter(hobby[]) :
        <c:forEach var="h" items="${hobby}" varStatus="status">
            ${h} <c:if test="${!status.last}">,</c:if>
        </c:forEach>
        <br/>
        요청 헤더값(userAgent) : ${userAgent} <br/>
    </body>
</html>
