<%@page import="dto.Member"%>
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<%@include file = "../header.jsp" %>
	<div class="container"> <!-- 박스권 -->
		<div class="row"> <!-- 가로배치 -->
			<div class="col-md-3"> <!-- 사이드바 -->
				<%@include file ="infosidebar.jsp" %>
			</div>	
			<div class="col-md-9"> <!-- 본문 -->
				<h3>회원정보</h3>
				
				<%

					String loginid2 
					= (String)session.getAttribute("login2");	//이메일
					String loginid3 
					= (String)session.getAttribute("login3");	//생일-백업비번
					String loginid00 
					= (String)session.getAttribute("login00");	//mid
				%>
				회원번호1 : <%=loginid%> <br>
				회원번호2 : <%=loginid2%> <br>
				회원번호3 : <%=loginid3%> <br>
				회원번호4 : <%=loginid00%> <br>
			</div>
		</div>
	</div>
	<%@include file = "../footer.jsp" %>

</body>
</html>






