<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MY HOME</title>
<meta charset="utf-8">
  
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body background="images/background.jpg">
<%@ include file="Com-Header.jsp" %>
<header>



 <p><div class= "container">
 <ul class= "list-inline" >
 <ul class="nav navbar-nav navbar-left">
          <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">FURNITURE</a>
         <ul class="dropdown-menu">
		   <li><a href="#">Sofa Sets</a></li>
           <li><a href="#">Bean Bags</a></li>
           <li><a href="#">Arm Chairs </a></li>
		   <li><a href="#">Magazine Racks</a></li>
		   <li><a href="#">Coffee Tables</a></li>
	</ul>
	</li>
	
	<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">KITCHEN</a>
         <ul class="dropdown-menu">
		 <li><a href="#">Food Storage</a></li>
           <li><a href="#">Cooking Tools</a></li>
           <li><a href="#">Cookers </a></li>
		   <li><a href="#">Cookware</a></li>
		   <li><a href="#">Chimneys</a></li>
		   </ul>
	</li>
	<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">DINNING</a>
         <ul class="dropdown-menu">
		 <li><a href="#">Dinner Sets</a></li>
           <li><a href="#">Plates</a></li>
           <li><a href="#">Bowls </a></li>
		   <li><a href="#">Cup and Saucers</a></li>
    </ul>
	</li>
	<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">LAMPS</a>
         <ul class="dropdown-menu">
		 <li><a href="#">Table Lamps</a></li>
           <li><a href="#">Wall Lights</a></li>
           <li><a href="#">Floor Lamps</a></li>
		   <li><a href="#">Ceiling Lamps</a></li>
       </ul>
	    </li>
		<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">WALL ACCENTS</a>
         <ul class="dropdown-menu">
		 <li><a href="#">Photo frames</a></li>
           <li><a href="#">Stickers</a></li>
           <li><a href="#">Wall Hangings</a></li>
		   <li><a href="#">Decorative Mirrors</a></li>
       </ul>
	    </li>
   
   
  </ul>
  </ul>
 </div></p>
 </header>
 <div class="container-fluid">
  <div class="row">
  
  <div class="col-md-3 col-sm-4 col-xs-6">
    <div class="thumbnail_container">
      <div class="thumbnail">
          <img src="images/wall1.jpg">
		  <h3>DECORATIVE MIRRORS</h3>
		  
      </div>
    </div>
</div>
<div class="col-md-3 col-sm-4 col-xs-6">
    <div class="thumbnail_container">
      <div class="thumbnail">
        <img src="images/wall2.jpg">
		<h3>WALL HANGINGS</h3>
		  
      </div>
    </div>  
</div>
<div class="col-md-3 col-sm-4 col-xs-6">
    <div class="thumbnail_container">
      <div class="thumbnail">
          <img src="images/wall3.jpg">
		  <h3>WALL STICKERS</h3>
		  
      </div>
    </div>
</div>
<div class="col-md-3 col-sm-4 col-xs-6">
    <div class="thumbnail_container">
      <div class="thumbnail">
        <img src="images/wall4.jpg">
		<h3>GIFT ARTICLES</h3>
		  
      </div>
    </div>  
</div>
  <div class="col-md-3 col-sm-4 col-xs-6">
    <div class="thumbnail_container">
      <div class="thumbnail">
          <img src="images/wall5.jpg">
		  <h3>COOKWARES</h3>
		  
      </div>
    </div>
</div>
<div class="col-md-3 col-sm-4 col-xs-6">
    <div class="thumbnail_container">
      <div class="thumbnail">
        <img src="images/wall6.jpg">
		<h3>STORAGE SHELVES</h3>
		  
      </div>
    </div>  
</div>
<div class="col-md-3 col-sm-4 col-xs-6">
    <div class="thumbnail_container">
      <div class="thumbnail">
          <img src="images/wall7.jpg">
		  <h3>DINNER SETS</h3>
		  
      </div>
    </div>
</div>
<div class="col-md-3 col-sm-4 col-xs-6">
    <div class="thumbnail_container">
      <div class="thumbnail">
        <img src="images/wall8.jpg">
		<h3>COFFEE CUPS</h3>
		  
      </div>
    </div>  
</div>

</div>


</div>
<%@include file="Com-Footer.jsp" %>
</body>
</html>