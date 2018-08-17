<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="Model.memberDAO" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="member" class="Model.member" scope="page"/>
<jsp:setProperty name="member" property="*"/>


<html>
	<head>
	<meta charset="utf-8">
	<title>Insert title here</title>
	</head>
	<body>
	
	<%
	
		if(member.getMemberName()==null||member.getMemberPassword()==null||member.getMemberName()==null||
				member.getMemberCountry()==null||member.getMemberEmail()==null||member.getMemberEmail()==null){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('입력이 되지않은 사항이 있습니다.')");
			script.println("history.back()");
			script.println("</script>");
		
		}else{
			memberDAO memberDAO= new memberDAO();
			int result= memberDAO.join(member);
			
			if(result== -1){
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('이미존재하는 아이디입니다.')");
				script.println("history.back()");
				script.println("</script>");
			}else{
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('회원가입이 정상적으로 처리되었습니다.')");
				script.println("location.href ='realindex.jsp'");
				script.println("</script>");
			
			}
		
		}
			
	
	%>
	
	</body>
</html>