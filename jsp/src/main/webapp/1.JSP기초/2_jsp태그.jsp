<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<!-- jsp: html과 java를 동시에 작성하는 파일 -->
		<!-- html : <마크업>	/	java 태그  -->
	
	<h3>선언문 태그:메모리할당[변수생성,객체생성,메소드실행x선언O,클래스정의O]</h3>
	<!-- html작성공간 -->
	<p>html에서 작성된 코드</p>
	
	<%!
		int 변수1 = 10;
		//Date date1 = new Date();
		//자바언어가 작성할 수 있는 공간[선언문 태그]
		//System.out.print("jsp에서 작성된 코드1"+변수1);	//메소드실행불가
		int 함수1(){return 2;}//함수(인수와 반환이 있는 미리 작성된 코드)
		class 클래스1{
			String 필드1 = "유재석";
		}
		클래스1 객체1 = new 클래스1();
	%>
	<%
		int 변수2 = 20;
		//Date date2 = new Date();
		//자바언어가 작성할 수 있는 공간[스크립트 태그]
		System.out.print("jsp 파일에서 생성된 변수:"+ 변수2);
		//System.out.print("jsp 파일에서 생성된 객체:"+ date2);
		//int 함수2(){ return 3;}	//함수선언x
		class 클래스2{
			String 필드2 = "강호동";
		}
		클래스2 객체1 = new 클래스2();
	%>
	
	<!-- html구역 다시 Start -->
	선언문의 변수<%=변수1 %><br>
	선언문의 함수<%=함수1() %><br>

	<hr>
	선언문의 변수<%=변수2 %><br>

	
</body>
</html>