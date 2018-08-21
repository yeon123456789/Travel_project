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
	
	    <!--Google Font link-->
	    <link href="https://fonts.googleapis.com/css?family=Ubuntu:300,300i,400,400i,500,500i,700,700i" rel="stylesheet">
	    <link rel="stylesheet" href="assets/css/swiper.min.css">
	    <link rel="stylesheet" href="assets/css/animate.css">
	    <link rel="stylesheet" href="assets/css/iconfont.css">
	    <link rel="stylesheet" href="assets/css/font-awesome.min.css">
	    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
	    <link rel="stylesheet" href="assets/css/magnific-popup.css">
	    <link rel="stylesheet" href="assets/css/bootsnav.css">
	    <!--For Plugins external css-->
	    <!--<link rel="stylesheet" href="assets/css/plugins.css" />-->
	    <!--Theme custom css -->
	    <link rel="stylesheet" href="assets/css/style.css">
	    <!--Theme Responsive css-->
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
	</head>
		
	<body data-spy="scroll" data-target=".navbar-collapse">


        <!-- Preloader -->
        <div id="loading">
            <div id="loading-center">
                <div id="loading-center-absolute">
                    <div class="object" id="object_one"></div>
                    <div class="object" id="object_two"></div>
                    <div class="object" id="object_three"></div>
                    <div class="object" id="object_four"></div>
                </div>
            </div>
        </div>


        <div class="culmn"><div>


            <nav class="navbar navbar-default bootsnav navbar-fixed white no-background">
                <div class="container">

                    <div class="attr-nav">
                     <ul>
                            <li><a href="login.jsp">Login</a></li>
                            <li><a href="join.jsp">Sign In</a></li>
                            <li><a href="#">Pocket</a></li>
                        </ul>
                    </div>
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-menu">
                            <i class="fa fa-bars"></i>
                        </button>
                        <a class="navbar-brand" href="realindex.jsp">
                           <img src="assets/images/logo.png" class="logo logo-display" alt="">
                            <img src="assets/images/footer-logo.png" class="logo logo-scrolled" alt="">
                        </a>

                    </div>
                    <script>
                    function showDivTheme() {
                    	 document.getElementById('seasons').style.display = "none";
  						 document.getElementById('theme').style.display = "block";
					}
                    function showDivSeasons() {
                    	 document.getElementById('theme').style.display = "none";
 						 document.getElementById('seasons').style.display = "block";
					}
                    
                    function removeThemeSeasons(){
                    	document.getElementById('theme').style.display = "none";
                    	 document.getElementById('seasons').style.display = "none";
                    }
                    </script>
                    
                    <div class="collapse navbar-collapse" id="navbar-menu">
                        <ul class="nav navbar-nav navbar-center">
                            <li><a href="#home" onclick="getPopularPlace(); removeThemeSeasons();" >Popular</a></li>
                            <li><a href="#features" onclick="showDivTheme()">Theme</a></li>
                            <li><a href="#reviews" onclick="showDivSeasons()">Seasons</a></li>
                            <li><a href="#download">FAQ</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
            
         
		
	
	</body>
</html>