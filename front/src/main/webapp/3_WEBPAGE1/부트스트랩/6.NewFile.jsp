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
	<div class="container">
	
		<div class="navbar navbar-expand-md navbar-light offset-md-2 col-md-10" style="background-color: #e3f2fd;">

			
			
			<!-- �޴������� �۾����� -->
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navmenu"
			aria-controls="navbar-contents" aria-expanded="false">
				=
			</button>
			
			<div class="collapse navbar-collapse" id="navmenu">
			<a href="#" class = "navbar-brand">
			<ul class= "navbar-nav">
				<li class= "nav-item"><a href="#" class= "nav-link"> �ŷ����� </a></li><!-- �׺���̼Ǹ�ϰ� -->
				<li class= "nav-item"><a href="#" class= "nav-link"> ������ </a></li>
				<li class= "nav-item"><a href="#" class= "nav-link"> �̺�Ʈ </a></li>
				<li class= "nav-item dropdown"><!-- ����ٿ� �޴� -->
					<!-- �ϴ��ؽ�Ŭ�������� �޴���ġ�� -->
					<a href = "#" class="nav-link dropdown-toggle"
					data-bs-toggle="dropdown" aria-haspopup="ture" aria-expanded="false" id="navdrop">
					���°���</a>
					
					<div class = "dropdown-menu" aria-labelledby="navdrop">
						<a class = "dropdown-item" href="#"> ������ </a>
						<a class = "dropdown-item" href="#"> �����߰� </a>
						<a class = "dropdown-item" href="#"> ���»��� </a>
					</div>
					
				</li>
			</ul>
			
			
			<form action="">
				<div class="row">
					<div class="offset-md-2 col-md-5">
						<input type="text" class="form-control">
						<button>�˻�</button>
					</div>
				</div>
				
			</form>
			

		</div>
		
	
	
	
	
	</div>
	</div>
	
	
</body>
</html>