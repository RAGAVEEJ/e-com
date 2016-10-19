<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add a Category</h1>

	<c:url var="addAction" value="/addproduct"></c:url>

	<%-- <form:form action="${addAction}" commandName="product"> --%>
	<h>${message}</h>
		<table>
			   <tr>
				<td>PRODUCT ID</td>
				<td><input type="text" name="id"/></td>
				</tr>
				
				<tr>
				<td>PRODUCT NAME</td>
				<td><input type="text" name="name"/></td>
				</tr>
				
				<tr>
				<td>PRODUCT DESCRIPTION</td>
				<td><input type="text" name="description"/></td>
				</tr>
			
			<tr>
			<td>PRICE</td>
			<td><input type="text" name="price"/></td>
			</tr>
			
<td><input type="submit" value="Add Product"></td>
</tr>	



	<h3>Product List</h3>
	<c:if test="${!empty productList}">
		<div class="table-responsive">
			<table class="table">
				<thead>

					<tr>

						<th>Product ID</th>

						<th>Product Name</th>

						<th>Product Description</th>

						<th>Price</th>



						<th>Product Category</th>

						<th>Product Supplier</th>

						<!-- <th>Product Image</th> -->

						<th>Edit</th>

						<th>Delete</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${productList}" var="product">

						<tr>

							<td>${product.id}</td>

							<td>${product.name}</td>

							<td>${product.description}</td>

							<td>${product.price}</td>


							<td>${product.category.name}</td>

							<td>${product.supplier.name}</td>
							<%-- <td><img src="<c:url value="E:\images /${product.id}.jpg"/>"></td> --%>

							<td><a href="<c:url value='editproduct/${product.id}' />">Edit</a></td>

							<td><a href="<c:url value='removeproduct/${product.id}' />">Delete</a></td>

						</tr>

					</c:forEach>
				</tbody>
			</table>
		</div>
	</c:if>

	</div>

	</div>
</body>
</html>