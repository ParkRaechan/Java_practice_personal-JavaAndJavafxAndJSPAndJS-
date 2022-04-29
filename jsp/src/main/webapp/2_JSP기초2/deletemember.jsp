<%@page import="Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>




	<%

			request.setCharacterEncoding("UTF-8"); // 한글 텍스트 요청
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			
			Dao memberDao = new Dao();
			boolean result =  memberDao.delete(id, password);
			System.out.print( result );
			if( result ){
				session.setAttribute("loginid", null ); // 특정 세션명 null로 설정하기 
				// 페이지 전환
				response.sendRedirect("main.jsp");
			}else{
		response.sendRedirect("main.jsp"); // 클라이언트에게 페이지 응답 [ 반환 ] 
			}
	%>
	
	
	
	
	
	
	
	
	
	