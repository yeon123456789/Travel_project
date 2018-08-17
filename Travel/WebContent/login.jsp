<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Insert title here</title>
		<style>
			div .jumbotron{
				padding-top: 90px; 
				padding-left: 80px;
				padding-bottom: 130px;
				padding-right: 80px;
				margin-bottom: 90px;
				margin-top:30px;
		</style>
	</head>
	<body>
		<jsp:include page="topMenu.jsp" flush="true"/>
		
		<section id="home" class="home">
                <div class="container">
                        <div class="main_home">
                           <div class = "jumbotron">
                           		<form method="post" action="Cont">
                           			<h3 style="text-align: center; margin-bottom:30px;">로그인 화면</h3>
                           			<div class="form-group">
                           				<input type="text" class="form-control" placeholder="아이디" name="memberID" maxlength=20>
                           			</div>
                           			<div class="form-group" style="margin-bottom:80px;" >
                           				<input type="password" class="form-control" placeholder="비밀번호" name="memberPassword" maxlength=20>
                           			</div>
                           			<input type="submit" class="btn btn-primary form-control" name="command" value="login">
                           		</form>
                           </div>
                        </div>
                </div><!--End off container -->
            </section> <!--End off Home Sections-->

            <!-- scroll up-->
            <div class="scrollup">
                <a href="#"><i class="fa fa-chevron-up"></i></a>
            </div><!-- End off scroll up -->
	
		<jsp:include page="footer.jsp" flush="true"/>
		
	</body>
</html>