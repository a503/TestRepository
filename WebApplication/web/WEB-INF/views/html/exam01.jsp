<%@page contentType="text/html;charset=EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
		<script>
			function handleBtnNaver(){
				for (var i = 0; i < 10; i++) {
					console.log("handleBtnNaver()...;");
					location.href="http://www.naver.com";
				}
			}
			function handleBtnGoogle(){
				for (var i = 0; i < 10; i++) {
					console.log("handleBtnGoogle()...;");
					location.href="http://www.google.com";
				}
			}
		</script>
    </head>
    <body>
        <h1>�±� ����</h1>
		<h3>��ũ �±�</h3>
		<a href="http://www.naver.com">���̹�</a><br/>
		
		<h3>��ư �±�</h3>
		<button onclick="handleBtnNaver()">���̹�</button>
		<button id="btnGoogle" onclick="handleBtnGoogle()">����</button>
		<input type="button" onclick="handleBtnNaver()" value="naver"/>
		
		<h3>�̹��� �±�</h3>
		<img src="/WebApplication/resources/image/tomcat.png" alt="tomcat" width="100"/>
		<input type="image" src="/WebApplication/resources/image/tomcat.png"/>
		
		<h3>�����̳� �±�</h3>
		<div>
			<img src="/WebApplication/resources/image/tomcat.png" alt="tomcat" width="100"/>
			<button onclick="handleBtnNaver()">���̹�</button>
		</div>
		<div>
			<img src="/WebApplication/resources/image/tomcat.png" alt="tomcat" width="100"/>
			<button onclick="handleBtnNaver()">���̹�</button>
		</div>
		
		<h3>form �±�</h3>
		<form>
			�̸� : <input type="text"/><br>
			���� : <input type="number"/><br>
			������� : <input type="date"/><br>
			���� : <input type="radio" name="sex"/>��<input type="radio" name="sex"/>��<br>
			���ɺо� : <br>
				<input type="checkbox"/>�ڹ�<br>
				<input type="checkbox"/>�ڹ�FX<br>
				<input type="checkbox"/>������<br>
				<input type="checkbox"/>�� ���ø����̼�<br>
				<input type="button" value="�Ϲݹ�ư"/>
				<input type="reset" value="���¹�ư"/>
				<input type="submit" value="�����ư"/>
				
		</form>
    </body>
</html>
