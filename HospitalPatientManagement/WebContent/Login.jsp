<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<script>
function passWordIsEmpty() {
	var p = document.myForm.LogPwd.value;
	if(p=="")
		{
		alert("Please enter password!");
		return false;
		}
	return true;
}
</script>
</head>
<body>
<div></div>
<div>
<form name="myForm" action="Controller" onsubmit = "return(passWordIsEmpty())" method="post">
<table>
<tr><td>User Name</td><td><input type="text" name="LogId" required="required"/> </td></tr>
<tr><td>Password</td><td><input type="password" name="LogPwd" /></td></tr>
<tr><td></td><td align="right"><input type="submit" value="Login"/></td></tr>

</table>
</form>
</div>
</body>
</html>