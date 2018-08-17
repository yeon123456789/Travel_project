<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		 <meta charset="utf-8">
         <title>Traveling Seoul for foreigners</title>
         <meta name="description" content="">
         <meta name="viewport" content="width=device-width, initial-scale=1">
         <link rel="icon" type="image/png" href="favicon.ico">
         <link href="https://fonts.googleapis.com/css?family=Ubuntu:300,300i,400,400i,500,500i,700,700i" rel="stylesheet">
         <link rel="stylesheet" href="assets/css/swiper.min.css">
         <link rel="stylesheet" href="assets/css/animate.css">
         <link rel="stylesheet" href="assets/css/iconfont.css">
         <link rel="stylesheet" href="assets/css/font-awesome.min.css">
         <link rel="stylesheet" href="assets/css/bootstrap.min.css">
         <link rel="stylesheet" href="assets/css/magnific-popup.css">
         <link rel="stylesheet" href="assets/css/bootsnav.css">
         <link rel="stylesheet" href="assets/css/style.css">
         <link rel="stylesheet" href="assets/css/responsive.css" />
         <script src="assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
         <script src="assets/js/vendor/jquery-1.11.2.min.js"></script>
         <script src="assets/js/vendor/bootstrap.min.js"></script>
         <script src="assets/js/jquery.magnific-popup.js"></script>
         <script src="assets/js/jquery.easing.1.3.js"></script>
         <script src="assets/js/swiper.min.js"></script>
         <script src="assets/js/jquery.collapse.js"></script>
         <script src="assets/js/bootsnav.js"></script>
         <script src="assets/js/plugins.js"></script>
         <script src="assets/js/main.js"></script>
        
        <script type="text/javascript">
        	if("${requestScope.msg}" == "joinsucc"){
        		alert("������ ��� �Ǿ����ϴ�");
        	}     
        	
        	if("${requestScope.msg}" == "loginsucc"){
        		alert("�α����� ���������� ó���Ǿ����ϴ�.");
        	}      
        </script>
        
       
	</head>
	
		<body>
			<jsp:include page="topMenu.jsp" flush="true"/>

            <!--Home Sections-->

            <section id="home" class="home">
                <div class="container">
                        <div class="main_home">
                                    <jsp:include page="mapSeoul.jsp" flush="true"/>
                        </div>
                </div><!--End off container -->
            </section> <!--End off Home Sections-->

            <!-- scroll up-->
            <div class="scrollup">
                <a href="#"><i class="fa fa-chevron-up"></i></a>
            </div><!-- End off scroll up -->


            <jsp:include page="footer.jsp" flush="true"/>
        </div>

        <!-- JS includes -->

    
	
	</body>
</html>