<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<%@include file = "../header.jsp" %>
	<div class="container">
		<form action="../login" method="post">
			ID : <input type="text" name="mid">
			PASSWORD : <input type="text" name="mpassword">
			<input type="submit" value="LOGIN">
			<!-- 만약에 로그인실패시 -->
			<%
				String result = request.getParameter("result");
				if( result != null && result.equals("2") ){
			%>
				<span> 동일한 회원정보가 없습니다.</span>		
			<%	
				}
			%>
		</form>
	</div>
	<%@include file = "../footer.jsp" %>

</body>
</html>





