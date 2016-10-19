<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MY Home</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<style>
ul {
    list-style-type: none;
    margin-top:50px;
    padding-left:250px;
	
    overflow: hidden;
    background-color: #ff8566;
}
li {
    float: left;
}
li a {
    display: block;
    color: black;
    text-align: center;
    padding: 14px 16px;    
}
li a:hover:not(.active) {
    background-color: white;
}
img { 
    width:10%; 
	padding-left:40px;
}


</style>
</head>
<body background="images/background.jpg">

<%@ include file="Com-Header.jsp" %>
 

	<div class="container">

		<div class="row">
			<div class="row">

				<h3>
					<font color="#101010">Gift Items</font>
				</h3>

				<div class="col-sm-4 col-lg-4 col-md-4">
					<div class="thumbnail">
						<img src="C:\Users\Admin\eclipse mars\workspacenew\myhome-backend\src\main\webapp\images\product-4.jpg" class="img-responsive"
							style="height: 200px; width: 90%" alt="Image">
						<div class="caption">
							<h4 class="pull-right">RS.300</h4>
							<p>Present Your Loved Ones!!!</p>

							<a href="#">Add to Cart</a>

						</div>

					</div>
				</div>
<h3>
					<font color="#101010">Wall Stickers</font>
				</h3>
				<div class="col-sm-4 col-lg-4 col-md-4">
					<div class="thumbnail">
						<img src="C:\Users\Admin\eclipse mars\workspacenew\myhome-backend\src\main\webapp\images\product-3.jpg" class="img-responsive"
							style="height: 200px; width: 90%" alt="">
						<div class="caption">
							<h4 class="pull-right">RS.200</h4>
							<p>colorfull Rooms !!!</p>

							<a href="#">Add to Cart</a>
						</div>
					</div>
				</div>
				<h3>
					<font color="#101010">Dinning Sets</font>
				</h3>
				<div class="col-sm-4 col-lg-4 col-md-4">
					<div class="thumbnail">
						<img src="C:\Users\Admin\eclipse mars\workspacenew\myhome-backend\src\main\webapp\images\product-5.jpg" class="img-responsive"
							style="height: 200px; width: 90%" alt="">
						<div class="caption">
							<h4 class="pull-right">RS.200</h4>
							<p>Makes Your Home More Beauty !!!</p>

							<a href="#">Add to Cart</a>
						</div>
					</div>
				</div>
				<h3>
					<font color="#101010">Wall Stickers</font>
				</h3>
				<div class="col-sm-4 col-lg-4 col-md-4">
					<div class="thumbnail">
						<img src="C:\Users\Admin\eclipse mars\workspacenew\myhome-backend\src\main\webapp\images\pro 4.jpg" class="img-responsive"
							style="height: 200px; width: 90%" alt="">
						<div class="caption">
							<h4 class="pull-right">RS.250</h4>
							<p>Makes Your Home More Beauty !!!</p>

							<a href="#">Add to Cart</a>
						</div>
					</div>
				</div>
				<h3>
					<font color="#101010">Flower Vase</font>
				</h3>
				<div class="col-sm-4 col-lg-4 col-md-4">
					<div class="thumbnail">
						<img src="C:\Users\Admin\eclipse mars\workspacenew\myhome-backend\src\main\webapp\images\pro 5.jpg" class="img-responsive"
							style="height: 200px; width: 90%" alt="">
						<div class="caption">
							<h4 class="pull-right">RS.250</h4>
							<p>Makes Your Home More Beauty !!!</p>

							<a href="#">Add to Cart</a>
						</div>
					</div>
				</div>
				<h3>
					<font color="#101010"> Artificial Flower</font>
				</h3>
<div class="col-sm-4 col-lg-4 col-md-4">
					<div class="thumbnail">
						<img src="C:\Users\Admin\eclipse mars\workspacenew\myhome-backend\src\main\webapp\images\pro 6.jpg" class="img-responsive"
							style="height: 200px; width: 90%" alt="">
						<div class="caption">
							<h4 class="pull-right">RS.250</h4>
							<p>Makes Your Home More Beauty !!!</p>

							<a href="#">Add to Cart</a>
						</div>
					</div>
				</div>				
				
				
				
				
				
			</div>

		</div>

	</div>

<%@ include file="Com-Footer.jsp" %>
</body>
</html>