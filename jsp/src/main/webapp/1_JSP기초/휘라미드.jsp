<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
		<tr>
	<% for(int i1=1 ; i1<=5 ; i1++) {
			for(int i1_1=1 ; i1_1<=(5-i1) ; i1_1++) {
				%><td> </td>
			<%}
			for(int i1_2=1 ; i1_2<=(2*i1-1) ; i1_2++) {
				 %><td>*</td><%
			}
			 %></tr><tr><%
		} %>
		</tr>
	</table>
</body>
</html>