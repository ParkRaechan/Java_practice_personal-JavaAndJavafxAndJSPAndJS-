<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@include file="1.��ġ.jsp"%>
	<form>
		<label>�̸�</label>
		<input type="text" placeholder="�̸�">
		
		<label>�̸���</label>
		<input type="text" placeholder="�̸���">
		
	</form>
	
	
	<form><!-- ��Ʈ��Ʈ�� -->
		<div class = "form-group">
			<label>�̸�</label>
			<input type="text" placeholder="�̸�">
		</div>
		<div class = "form-group">
			<label>�̸���</label>
			<input type="text" placeholder="�̸���">
		</div>
		<div class = "form-group">
			<button type="submit" type="text" placeholder="�̸���">
		</div>
	</form>
	<div class="form-check">
		<input type="radio" class="form-check">
	</div>
	<div class="container row">
		<div class="col-md-2"><input type="text" class="form-control"></div>
		<div class="col-md-2 offset-3"><input type="text" class="form-control"></div>
		<div class="col-md-2 offset-3"><input type="text" class="form-control"></div>
	</div>
	<button type="button"></button>
	<button type="button" class="btn btn-primary"></button>
	<button type="button" class="btn btn-secondery"></button>
	<button type="button" class="btn btn-info"></button>
				
	<div class="container">
		<div class="row">
			<div class = "col-md-3">
				<img alt="" src="img/����.png" width="100%">
			</div>
			<div class = "col-md-3">
				<img alt="" src="img/����2.jpg" width="100%">
			</div>
		</div>
	</div>		
				
</body>
</html>