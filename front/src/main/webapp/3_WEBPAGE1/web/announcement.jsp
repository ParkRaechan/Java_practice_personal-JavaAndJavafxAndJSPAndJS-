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
		#contents{
			width: 1150px;
			margin: 0 auto;
		}
		#title{
			width: 100px;
			margin: 0 auto;
			font-size: 20px;
			margin-bottom: 60px;
		}
		#search_ho{
			width: 1000px;margin: 0 auto;
			background-color: #f9f7f9; height : 60px;
		}
		#search{
			width: 650px;
			margin: 0 auto;
			margin-bottom: 20px;	
			padding-bottom: 20px; 
		}
		#search input{
			width: 500px;
			height: 40px; 
		}
		#search button {
			width: 100px;
			height: 42px;
			background-color: #555555;
			color: white;
		}
		table{
			margin : 0 auto;
			border-top: solid 1px #cccccc;
			border-bottom: solid 1px #cccccc;
			font-size: 15px;
		}
		th{text-align: center; padding: 10px 50px;}
		td{
			padding: 10px 100px;
			border-top: solid 1px #e7e7e7;
		}
		#con{}
	</style>
</head>
<body>
<%@include file="header.jsp"%>
<%@include file="mainimg.jsp"%>
<div id="ho">
	<form>

	<div id="contents">
		<div id="title"> <h3>공지사항</h3> </div>
		<div id = "search_ho">
			<div id="search"><input type="text" placeholder="검색어를 입력해주세요."><button>검색</button> </div>
		</div>
		
		<div>
			<table>
				<tbody><tr>
					<th>번호</th> <th>제목</th> <th>등록일</th>
				</tr>
				<tr id="con">
					<td>3</td> <td>[공지사항] 개인정보 처리방침 변경안내처리방침</td> <td>2017.07.13</td>
				</tr>
				<tr id="con">
					<td>2</td> <td>공지사항 안내입니다. 이용해주셔서 감사합니다</td> <td>2017.06.15</td>
				</tr>
				<tr id="con">
					<td>1</td> <td>공지사항 안내입니다. 이용해주셔서 감사합니다</td> <td>2017.06.15</td>
				</tr>
			</tbody></table>
		</div>
		
	</div>
	</form>
</div>
<%@include file="footer.jsp"%>

</body>
</html>