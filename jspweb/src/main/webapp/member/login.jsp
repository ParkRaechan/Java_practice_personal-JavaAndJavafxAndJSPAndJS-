<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/jspweb/css/login.css" rel="stylesheet">

</head>
<body>
	<%@include file = "../header.jsp" %>
	<div class="container">
		<form action="../login" method="post" id="success1">
			로그인페이쥐<br><br>
			id : <input type="text" name = "mid"><br><br><br>
			pw : <input type="text" name = "mpassword"><br><br><br><br>	
			<input type="submit" value="로그인">
			<!-- 만약 로그인 실패시 -->
			<% 
				String result = request.getParameter("result");
				if( result != null && result.equals("2") ){
			%>
			<span> 동일한 회원정보가 없습니다.</span>		
			<%	
				}
			%>
			</form>
			<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	</div>
	<%@include file = "../footer.jsp" %>

</body>
</html>