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
    </head>
    <body>
		<h3> Buttons</h3>
		<button>Default</button>
		<button class="btn btn-default">Default</button>
		<button class="btn btn-primary">Primary</button>
		<button class="btn btn-success">Success</button>
		<button class="btn btn-info">Info</button>
		<a class="btn btn-info" href="/WebApplication">a Tag</a>
		<input type="button" value="input Tag"/>
		<input type="button" value="input Tag" class="btn btn-danger"/>

		<h3>Tables</h3>
		<table class="table table-striped table-bordered table-hover">
			<tr class="success">
				<td>NO.</td>
				<td class="danger">title</td>
				<td>writer</td>
			</tr>
			<tr>
				<td>1</td>
				<td>이것이 자바다</td>
				<td>신용권</td>
			</tr>
			<tr>
				<td>2</td>
				<td>취뽀</td>
				<td>이정수</td>
			</tr>
		</table>

		<h3>Image</h3>
		<img src="/WebApplication/resources/image/photo1.jpg" width="100px" height="100px"/>
		<img class="img-rounded" src="/WebApplication/resources/image/photo1.jpg" width="100px" height="100px"/>
		<img class="img-circle" src="/WebApplication/resources/image/photo1.jpg" width="100px" height="100px"/>
		<img class="img-thumbnail" src="/WebApplication/resources/image/photo1.jpg" width="100px" height="100px"/>
		
		<h3>Form</h3>
		<form>
			<div>
				<label for="exampleInputEmail1">Email address</label>
				<input type="email" class="form-control" id="exampleInputEmail1" placeholder="Email">
			</div>
		</form>
		<form class="form-group">
			<div>
				<label for="exampleInputEmail1">Email address</label>
				<input class="form-control" type="email" class="form-control" id="exampleInputEmail1" placeholder="Email">
			</div>
		</form>
    </body>
</html>
