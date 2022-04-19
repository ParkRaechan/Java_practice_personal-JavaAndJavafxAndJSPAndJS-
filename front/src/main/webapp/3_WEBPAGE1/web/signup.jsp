<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		
		#ho{
			margin : 150px;
		}
		h3{ text-align: center;}
		li{ list-style-type: none; }/* 글머리 제거 */
		#join{
			width: 600px;
			margin: 0 auto; /* 가운데 정렬 */
			border-top: solid 2px #555555;
			border-bottom: solid 2px #555555;
			padding: 30px;
		}
		.cols{ padding: 5px; }
		.cols li{ display: inline-block; }
		.col1{ width: 150px; }
		.col2 input { width: 200px; height: 30px; } 
		.email input , select  { height: 30px; }
		.hello{ vertical-align: top; } /* 텍스트 세로정렬 */
		#bb{
			margin-left:600px;
			
		}
	</style>

</head>
<body>


<%@include file="header.jsp"%>
<%@include file="mainimg.jsp"%>
<div id = "ho">

<h3>회원가입</h3>
<form>
	<ul id = "join">
	<li>
		<ul class = "cols">
			<li class = "col1">아이디</li>
			<li class = "col2"><input type="text"></li>
			
		</ul>
	</li>
	<li>
		<ul class = "cols">
			<li class = "col1">비밀번호</li>
			<li class = "col2"><input type="password"></li>
			
		</ul>
	</li>
	<li>
		<ul class = "cols">
			<li class = "col1">비밀번호 확인</li>
			<li class = "col2"><input type="password"></li>
			
		</ul>
	</li>
	<li>
		<ul class = "cols">
			<li class = "col1">이름</li>
			<li class = "col2"><input type="text"></li>
			
		</ul>
	</li>
	<li>
		<ul class = "cols">
			<li class = "col1">이메일</li>
			<li class = "col2"><input type="text">@
			<select>
				<option> 직접입력 </option>
				<option> nanver.com </option>
				<option> nate.com </option>
			</select>
			</li>
		</ul>
	</li>
	
	<li>
		<ul class = "cols">
			<li class = "col1">이메일 수신</li>
			<li><input type = "radio" name = "ch" checked="checked"> 비수신 <input type = "radio" name = "ch"> 수신</li>
		</ul>
	</li>
	
	<li>
		<ul class = "cols">
			<li class = "col1">이메일 수신</li>
			<li ><input type = "checkbox"> 친구추천 <input type = "checkbox" > 인터넷검색<input type = "checkbox" checked="checked"> 기타
		</ul>
	</li>
	
	<li>
		<ul class = "cols">
			<li class = "col1 hello"> 인사말 </li>
			<li class = "col2 "><textarea rows="6" cols="40"></textarea></li>
		</ul>
	</li>
	
	</ul>
	
	

</form>
<ul>
	<li id ="bb">
		<input type = "submit" value = "저장하기"> <input type = "reset" value = "취소하기">
	</li>
</ul>
</div>


<%@include file="footer.jsp"%>

</body>
</html>