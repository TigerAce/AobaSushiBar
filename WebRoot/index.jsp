<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Aoba Sushi Bar</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Carousel Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap/bootstrap.min.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Custom styles for this template -->
    <link href="carousel.css" rel="stylesheet">

</head>

<body>

   <div class="navbar-wrapper">
      <div class="container">

        <div class="navbar navbar-inverse navbar-static-top" role="navigation">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="index.jsp">Aoba Sushi Bar</a>
            </div>
            <div class="navbar-collapse collapse">
              <ul class="nav navbar-nav">
                <li class="active"><a href='Menu'>Menu</a></li>
                <li><a href='OrderOnline'>Order Online</a></li>
                <li><a href='Special'>Special</a>
                <li><a href='Contact'>Contact</a></li>
             
              </ul>
            </div>
          </div>
        </div>

      </div>
    </div>


   

    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

    <div class="container marketing">

      <!-- Three columns of text below the carousel -->
      <div class="row">
        <div class="col-lg-4">
          <img class="img-circle" src="img/sushi1.jpg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>Super Prawn</h2>
          <p>shrimp Tempura, cucumber, crabmeat, lettuce, green onions spicy sauce topped with Ebi, avocado, house special sauce, kiwi sauce and black Tobiko<br>1340KJ<br>$12.5</p>
        <!--   <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>--> 
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="img/sushi2.jpg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>Webster Roll</h2>
          <p>shrimp tempura, cucumber, crab meat topped with White Tuna, avocado, Tobiko and house special sauce<br>1240KJ<br>$12</p>
        
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="img/sushi3.jpg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>Smoky Sal</h2>
          <p>cream cheese, cucumber, avocado topped with smoked Salmon, lemon slices, capers Unagi sauce, kiwi sauce and black Tobiko<br>1310KJ<br>$12</p>
        
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="img/sushi4.jpg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>Marine Boy</h2>
          <p>Salmon skin, Unagi, green onions, crabmeat and cucumber rolled in soybean wrapper, topped with Tuna, White Tuna, Salmon, Hamachi, Unagi sauce, kiwi sauce, Tobiko and green onions<br>1250KJ<br>$12.5</p>
        
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="img/sushi5.jpg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>Hella Hot</h2>
          <p>fresh Salmon, White Tuna wasabi mayo, spicy sauce, cucumber, avocado and chopped jalapeño peppers rolled in soybean wrapper, topped with spicy Tuna, Unagi sauce, mango sauce, Tobiko and green onions <br>1010KJ<br>$11
</p>
         
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="img/sushi6.jpg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>Golden Gate</h2>
          <p>avocado, crabmeat, cucumber, asparagus, mango, Tobiko, deep fried squid with mango sauce <br>900KJ<br>$10 </p>
         
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->


   


      <!-- FOOTER -->
      <footer>
        <p class="pull-right"><a href="#">Back to top</a></p>
        <p>&copy; 2014 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
      </footer>

    </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap/bootstrap.min.js"></script>
  <!--  <script src="../../assets/js/docs.min.js"></script> -->
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
  <!--  <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>-->
  </body>
</html>
