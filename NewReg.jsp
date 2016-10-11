<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<CENTER><TITLE>HOME DECOR</TITLE>
<script type="text/javascript">
function validation()
{               var check_email = /^[\w\.]+@[a-zA-Z_]+?\.[a-zA-Z\.]{2,6}$/;
                var check_username = /^[a-zA-Z0-9_]{5}$/;
                var check_name = /^[a-zA-Z]{3,16}$/;
                var check_phone = /^[0-9]{10}$/;
if(document.myform.firstname.value=="")
{
alert("please enter firstname");
document.myform.firstname.focus();
return false;
}
else if(check_name.test(document.myform.firstname.value) == false)
 {
 alert('Invalid  firstname');
 document.myform.firstname.focus();
 return false;
 }
 if(document.myform.lastname.value=="")
 {
 alert("please enter lastname");
document.myform.lastname.focus();
 return false;
}
else if(check_name.test(document.myform.lastname.value) == false)
{
alert('Invalid  lastname');
document.myform.lastname.focus();
return false;
}
if(document.myform.username.value=="")
{
alert("please enter username");
document.myform.username.focus();
return false;
}
else if(check_username.test(document.myform.username.value) == false)
{
alert('Invalid  username');
document.myform.username.focus();
return false;
}
if(document.myform.email.value=="")
{
alert("please enter email");
document.myform.email.focus();
return false;
}
else if(check_email.test(document.myform.email.value) == false)
{
alert('Invalid  email');
document.myform.email.focus();
return false;
}
if(document.myform.password.value=='')
{
alert("Please enter Password.");
document.myform.password.focus();
return false;
}

if(document.myform.passconf.value=='')
{
alert("Please confirm Password.");
document.myform.passconf.focus();
return false;
}
else if(document.myform.password.value!=document.myform.passconf.value)
{
alert("Password does not match.");
document.myform.password.focus();
return false;
}


if(document.myform.phone.value=="")
{
alert("please enter phone");
document.myform.phone.focus();
return false;
}
else if(check_phone.test(document.myform.phone.value) == false)
{
alert('Invalid  phone');
document.myform.phone.focus();
return false;
}
}
</script>
</head>

<body background="images/background.jpg">
<%@ include file="Com-Header.jsp" %>

<form name="myform" action="success.html" onSubmit="return validation()" method="post">

<center><font size=10><b><u>Registration Form</u></b></font></center>

<table cellspacing="25" cellpadding="2" width="45%" bgcolor="gray" align="center">

<tr>
<td>First Name:</td>
<td><input type="text" name="firstname"  value="" placeholder="enter the first name" size="50" /></td>
</tr>

<tr>
<td>Last Name:</td>
<td><input type="text" name="lastname"  value="" placeholder="enter the last name" size="50" /></td>
</tr>

<tr>
<td>Username:</td>
<td><input type="text" name="username" value="" placeholder="enter the username" size="50" /></td>
</tr>

<tr>
<td>Email:</td>
<td><input type="text" name="email"  value="" placeholder="enter the mail-id" size="50" /></td>
</tr>

<tr>
<td>Password:</td>
<td><input type="password" name="password"  value="" placeholder="enter password"size="50" /></td>
</tr>

<tr>
<td>Password Confirm:</td>
<td><input type="password" name="passconf"  value="" placeholder="re-enter password" size="50" /></td>
</tr>

<tr>
<td>Phone:</td>
<td><input type="text" name="phone"  value="" placeholder="enter the ph-number" size="50" /></td>
</tr>

</table>

<p><input type="submit" value="Submit" /></p>

</form>
<%@ include file="Com-Footer.jsp" %>
</body>
</html>