<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%for (int i = 1; i <= 4; i++) {%>
<div>
	<img src="/WebApplication/resources/image/member0<%=i%>.png" width="150px" height="150px"/>
	<span>메시지0<%=i%></span>
</div>
<%}%>