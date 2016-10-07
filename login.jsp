<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MY HOME</title>
</head>
<body>
<c:url var="action" value="/login"></c:url>

<form:form action="${action}" method="post">

	   <center><font size=10><b><u>LOGIN PAGE</u></b></font></center> 
	   
	   <table cellspacing="25" cellpadding="2" width="45%" bgcolor="gray" align="center">
<tr>
<td>Enter User Name:<form:input  path="username"/></td>
<td><font color="red"> <form:errors path="username"></form:errors></font><br/></td>
</tr>

<tr>
<td>Enter Password:<form:input  path="password"/><td>
	<td>   <font color="red"> <form:errors path="password"></form:errors></font><br/></td>
</tr>
</table>

<center><input type="submit" value="Login"/>
</form:form>

</body>
</html>