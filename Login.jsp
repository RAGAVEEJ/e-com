<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MY HOME</title>
</head>
<body background="images/background.jpg">
<%@ include file="Com-Header.jsp" %>
<h>${message}</h>
<c:url var="addAction" value="/isValidUser">
		</c:url>
<form:form action="${addAction}" method="post">



	   <center><font size=10><b><u>LOGIN PAGE</u></b></font></center> 
	   
	   <table cellspacing="25" cellpadding="2" width="45%" bgcolor="gray" align="center">
	   


<tr>
<td>Enter User Name:</td>
<td><input type="text"  name="username"/></td>
</tr>

<tr>
<td>Enter Password:</td>
<td><input type="password"  name="password"/></td>
</tr>

<tr>
<td><input type="submit" value="Login"></td>
</tr>
</form:form>
</table>

<%@ include file="Com-Footer.jsp" %>
</body>
</html>