<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%String[] 게임판 = { "[ ]" , "[ ]" , "[ ]" ,
			"[ ]","[ ]" , "[ ]" , 
			"[ ]","[ ]" , "[ ]" };
	
	int h=0;
	if(request.getParameter("h")==null){
		
	}else{
		if(request.getParameter("h")!=null){
			h =  Integer.parseInt( request.getParameter("h") );
			
			if(h>0&&h<10){
				게임판[h-1]="[0]";
				h=0;
			}
		}
	}
	
	%>
<table>
		<tr>
			<%for(int i=0;i<8;i++){
				if(i==0){%><td><%=게임판[i]%></td><%}
				else if(i%2==0){
					
					%></tr><tr>
					<td><%=게임판[i]%></td><%
				}
				 %><td><%=게임판[i]%></td><%
			} %>
			
		</tr>
	</table>
	
	
	
	
	<form action="틱택토.jsp" method="get">
		<input type="text" name = "h" value="<%=1%>"><input type="submit" value="1">
		<input type="text" name = "h" value="<%=2%>"><input type="submit" value="2">
		<input type="text" name = "h" value="<%=3%>"><input type="submit" value="3">
	</form>
	<form action="틱택토.jsp" method="get">
		<input type="text" name = "h" value="<%=4%>"><input type="submit" value="4">
		<input type="text" name = "h" value="<%=5%>"><input type="submit" value="5">
		<input type="text" name = "h" value="<%=6%>"><input type="submit" value="6">
	</form>
	<form action="틱택토.jsp" method="get">
		<input type="text" name = "h" value="<%=7%>"><input type="submit" value="7">
		<input type="text" name = "h" value="<%=8%>"><input type="submit" value="8">
		<input type="text" name = "h" value="<%=9%>"><input type="submit" value="9">
	</form>
</body>
</html>