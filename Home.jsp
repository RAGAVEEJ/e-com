<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>HOME DECOR</title>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
   <style>
  
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 25%;
      margin: auto;
  }
  
  </style>
</head>
<body background="images/background.jpg">
<%@ include file="Com-Header.jsp" %>
 
 <div class="container">
  <br>
  <div id="myCarousel" class="carousel slide jumbotoron" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">

      <div class="item active">
        <img src="images/carousel-1.jpg" width="236" height="260" >
        <div class="carousel-caption">
          
        </div>
      </div>

      <div class="item">
        <img src="images/carousel-2.jpg" width="236" height="260">
        <div class="carousel-caption">
          
        </div>
      </div>
    
      <div class="item">
        <img src="images/carousel-3.jpg" width="236" height="260">
        <div class="carousel-caption">
		</div>
		</div>
		
		<div class="item">
        <img src="images/carousel-4.jpg"width="236" height="260">
        <div class="carousel-caption">
		</div>
		</div>
		
		<div class="item">
        <img src="images/carousel-5.jpg"width="236" height="260">
        <div class="carousel-caption">
          
        </div>
      </div>

      
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<%@ include file="Com-Footer.jsp" %>
</body>
</html>