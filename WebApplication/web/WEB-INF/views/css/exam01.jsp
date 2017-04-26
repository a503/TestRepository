<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Block Tag & CSS</h1>
		<h3>Block</h3>
		<div style = "background-color: yellow; border: 1px solid black; height: 50px;">
			div Tag
		</div>
		<p style = "background-color: skyblue; border: 1px solid black; height: 50px;">
			p Tag
		</p>
		<h4 style = "background-color: coral; border: 1px solid black; height: 50px;">h Tag</h4>
		<form style = "background-color: gold; border: 1px solid black; height: 50px;">form Tag</form>
		<table style = "background-color: blanchedalmond; border: 1px solid black; height: 50px;">
			<tr>
				<td>table Tag</td>
			</tr>
		</table>
		<table style = "background-color: blanchedalmond; border: 1px solid black; height: 50px; width: 100%">
			<tr>
				<td>table Tag</td>
			</tr>
		</table>
		
		<h3>Inline</h3>
		<span style = "background-color: yellow; border: 1px solid black; height: 50px;">span Tag1</span>
		<span style = "background-color: skyblue; border: 1px solid black; height: 50px;">span Tag2</span>
		<img src="/WebApplication/resources/image/tomcat.png" height="50px" style="border: 1px solid black"/>
		<a style="border: 1px solid black">a Tag</a>
		<button style="border: 1px solid black">button tag</button>
		
		<h3>Block -> Inline</h3>
		<div style = "background-color: yellow; border: 1px solid black; height: 50px; display: inline">
			div Tag
		</div>
		<div style = "background-color: skyblue; border: 1px solid black; height: 50px; display: inline">
			div Tag
		</div>
		
    </body>
</html>
