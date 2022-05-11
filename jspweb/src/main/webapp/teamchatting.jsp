<%@page import ="dao.ChatDao" %>
<%@page import = "dto.Chat" %>
<%@page import ="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<div class="container">
		<h3>비회원제 실시간 채팅</h3>

		<div id="chatlist"style="width:500px;height:500px;border:1px solid black; margin: 0 auto;">
			
			
		</div>
		
		<div style="width:500px; margin: 0 auto;">
			<div>
				<input type="text" placeholder="닉네임" class="form-control" id="cnick">
				
				<input type="text" placeholder="내용" class="form-control" id="ccontent">
				
				
				<button onclick="send();" class="form-control">입력</button>
			</div>
				
				
		</div>
	</div>
	<script type="text/javascript" src="/jspweb/js/chat.js"></script>
	<%@include file="footer.jsp" %>
	
</body>
</html>