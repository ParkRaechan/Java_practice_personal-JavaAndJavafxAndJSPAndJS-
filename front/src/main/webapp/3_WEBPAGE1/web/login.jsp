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
		h3{
			text-align: center ;
		}
		li{
			list-style-type: none;
		}
		
		table{
		width : 350px ;
		margin: 0px auto;
		}

	</style>
	

</head>
<body>
<%@include file="header.jsp"%>
<%@include file="mainimg.jsp"%>
<div id = "ho">
<h3>로그인</h3>
<table>
<tbody>
	<tr>
		<td>아이디</td>
		<td><input type="text" style="height : 38px ">
		</td>
		<td rowspan="2">
		<input type = "button" value = "로그인" style="width : 90px; height : 90px ">
		</td>
	</tr>

	<tr>
		<td>비밀번호</td>
		<td><input type="text"style="height : 38px ">
		</td>

	</tr>

	
</tbody>
</table>
</div>


	<%@include file="footer.jsp"%>
</body>
</html>