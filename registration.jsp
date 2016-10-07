<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<CENTER><TITLE>HOME DECOR</TITLE>
</head>
<body>
<form:form action="register" method="post" commandName="userForm">

<center><font size=10><b><u>Registration Form</u></b></font></center>
<table cellspacing="25" cellpadding="2" width="45%" bgcolor="gray" align="center">

<tr>
<td>First Name:<form:input  path="firstname"/></td>
<td><font color="red"> <form:errors path="firstname"></form:errors></font><br/></td>
</tr>

<tr>
<td>Last Name:<form:input  path="lastname"/></td>
<td><font color="red"> <form:errors path="lastname"></form:errors></font><br/></td>
</tr>
 
 <tr>
<td>User Name:<form:input  path="username"/></td>
<td><font color="red"> <form:errors path="username"></form:errors></font><br/></td>
</tr>

<tr>
<td>Password:<form:input  path="password"/></td>
<td><font color="red"> <form:errors path="password"></form:errors></font><br/></td>
</tr>
 
 <tr>
<td>E-mail:<form:input  path="email"/></td>
<td><font color="red"> <form:errors path="email"></form:errors></font><br/></td>
</tr>

<tr>
<td>Phone:<form:input  path="phone"/></td>
<td><font color="red"> <form:errors path="phone"></form:errors></font><br/></td>
</tr>
<center><p><input type="submit" value="Register" /></p></center>
</table>
</form:form>
</body>
</html>