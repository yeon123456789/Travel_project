<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Insert title here</title>
	</head>
	<body>
		
		<jsp:include page="topMenu.jsp" flush="true"/>
		<section id="home" class="home">
        <div class="container">
           <div class="main_home">
              <div class = "jumbotron" style="padding-top:20 px;">
              
              		<form method="post" action="Cont" name="joinSubmit">
              		
              			<h3 style="text-align: center; margin-bottom:30px;">회원가입</h3>
              			<div class="form-group">
              				<input type="text" class="form-control" placeholder="아이디" name="memberID"  maxlength=20>
              			</div>
              			<div class="form-group">
              				<input type="password" class="form-control" placeholder="비밀번호" name="memberPassword"  maxlength=20>
              			</div>
              			
              			<div class="form-group">
              				<input type="text" class="form-control" placeholder="이름" name="memberName" maxlength=20>
              			</div>
              			<div class="form-group">
              				<jsp:include page="country.jsp" flush="true"/>
              			</div>
              			<div class="form-group">
              				<input type="text" class="form-control" placeholder="이메일" name="memberEmail" maxlength=20>
              			</div>
              			
              			<div class="form-group" style= "text-align: center;">
              				<div class="btn-group" data-toggle="buttons" style="margin-bottom:80px;">
              					<label class="btn btn-primary active">
              						<input type="radio" name="memberGender" autocomplete="off" value="남자" checked>남자
              					</label>
              					<label class="btn btn-primary">
              						<input type="radio" name="memberGender" autocomplete="off" value="여자" checked>여자
              					</label>
              				</div>
              			</div>
              			<input type="hidden" name="command" value="join">
              			<input type="button" class="btn btn-primary form-control" onclick="validate()">
              		 </form>
              				
              	</div>
            </div>
           </div>
        
        </section> <!--End off Home Sections-->
        <!-- scroll up-->
        <div class="scrollup">
        	<a href="#"><i class="fa fa-chevron-up"></i></a>
        </div><!-- End off scroll up -->
		<jsp:include page="footer.jsp" flush="true"/>
		
		<script type="text/javascript">
			function validate(){
				if(document.joinSubmit.memberID.value.length == 0) {
					alert("ID를 입력하지 않으셨습니다.");
					joinSubmit.memberID.focus();
					return false;
				}
				
				if(document.joinSubmit.memberPassword.value.length == 0) {
					alert("비밀번호를 입력해주세요");
					joinSubmit.memberID.focus();
					return false;
				}
				
				if(document.joinSubmit.memberName.value.length == 0) {
					alert("이름을 입력해주세요");
					joinSubmit.memberID.focus();
					return false;
				}
				
				if(document.joinSubmit.memberCountry.value.length == 0) {
					alert("국가를 선택해주세요");
					joinSubmit.memberID.focus();
					return false;
				}
				
				if(document.joinSubmit.memberEmail.value.length == 0) {
					alert("이메일을 입력해주세요.");
					joinSubmit.memberID.focus();
					return false;
				}
				
				if(document.joinSubmit.memberGender.value.length == 0) {
					alert("성별을 입력해주세요.");
					joinSubmit.memberID.focus();
					return false;
				}
				
				alert(1);
				document.joinSubmit.submit();
				
				
			}
		</script>		
		
		
		
	</body>
</html>