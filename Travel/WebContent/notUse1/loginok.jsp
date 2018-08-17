<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="Model.memberDAO" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="memberDTO" class="Model.member" scope="page"/>
<jsp:setProperty name="member" property="memberID"/>
<jsp:setProperty name="member" property="memberPassword"/>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="utf-8">
	<title>Insert title here</title>
	</head>
	<body>
	<%
		memberDAO memberDAO= new memberDAO();
		int result= memberDAO.login(memberDTO.getMemberID(), memberDTO.getMemberPassword());
		if(result == 1){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("location.href= 'realindex.jsp'");
			script.println("</script>");
		} else if(result== 0){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('비밀번호가 틀렸습니다')");
			script.println("history.back()");
			script.println("</script>");
		} else if(result== -1){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('존재하지 않는 아이디입니다.')");
			script.println("history.back()");
			script.println("</script>");
		}	else if(result== -2){
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('데이터베이스 오류입니다.')");
				script.println("history.back()");
				script.println("</script>");
		}
	
	%>
	
	</body>
</html>