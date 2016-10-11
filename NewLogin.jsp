<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MY HOME</title>
<script language="javascript">
function check(form)
{
 if(form.userid.value == "abCDE" && form.pswrd.value == "12345")
  {
    window.open('NewProduct.jsp')
  }
 
 else if(form.userid.value =="" || form.pswrd.value =="")
 {
 alert("cannotbe empty")
 }
 else
 {
   alert("Error Password or Username")
  }
}
</script>
</head>
<body background="images/background.jpg">
<%@ include file="Com-Header.jsp" %>

<form name="loginform">
	   <center><font size=10><b><u>LOGIN PAGE</u></b></font></center> 
	   
	   <table cellspacing="25" cellpadding="2" width="45%" bgcolor="gray" align="center">
<tr>
<td><font size=5>USERNAME :</td>
<td><input type="text" name="userid"></td><br><br>
</tr>

<tr>
<td><font size=5>PASSWORD :</td>
<td><input type="password" name="pswrd"></td>
</tr>
</table>

<center><input type="button" onclick="check(this.form)" value="Login"/>
<input type="reset" value="Cancel"/></center>
</form>
<%@ include file="Com-Footer.jsp" %>
</body>
</html>