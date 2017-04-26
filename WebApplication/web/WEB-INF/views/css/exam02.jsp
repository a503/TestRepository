<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>JSP Page</title>
		<style>
			/* tag 선택자(selector) */
			div {
				background-color: yellow;
				border: 1px solid black;
				height: 50px;
			}
			/* class 선택자 */
			.skyblue{
				background-color: skyblue;
			}
			.btn{
				border: 1px solid black;
				height: 70px;
				padding: 5px;
			}
			.success{
				background-color: #66ff66;
				color: white;
			}
			.warning{
				background-color: red;
				color: white;
			}
			/* id 선택자 */
			#goldDiv1{
				background-color: gold;

			}
			#goldDiv2{
				background-color: goldenrod;

			}
		</style>
    </head>
    <body>
		<div>
			div Tag
		</div>
		<div>
			div Tag
		</div>
		<div>
			div Tag
		</div>
		<div class="skyblue">
			div Tag
		</div>
		<div class="skyblue">
			div Tag
		</div>
		<div id="goldDiv1" class="skyblue">
			div Tag
		</div>
		<div id="goldDiv2" class="skyblue">
			div Tag
		</div>
		<a class="btn success">확인</a>
		<a class="btn warning">취소</a>
    </body>
</html>
