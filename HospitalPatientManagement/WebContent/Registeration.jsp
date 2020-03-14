<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeration</title>
<script>
	function validatePwd() {
		var npwd = document.forms["regForm"]["npwd"].value;
		var cpwd = document.forms["regForm"]["cpwd"].value;
		if (npwd != cpwd) {
			alert("Passwords should be same")
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<div></div>
	<div>
		<form name="regForm" action="adminregistration" onSubmit="return validatePwd()"
			method="post" >
			<table>
				<tr>
					<td>Receptionist Name</td>
					<td><input type="text" name="receptionistName"
						required="required" /></td>
				</tr>

				<tr>
					<td>EmployeeId</td>
					<td><input type="text" name="empId" required="required" /></td>
				</tr>

				<tr>
					<td>Gender</td>
					<td><input type="radio" name="Gender" value="Male" />Male <input
						type="radio" name="Gender" value="Female" />Female <input
						type="radio" name="Gender" value="Other" />Other</td>
				</tr>


				<tr>
					<td>Mobile No.</td>
					<td><input type="text" name="mobNo" required="required" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="email" /></td>
				</tr>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="uname" required="required" /></td>
				</tr>
				<tr>
					<td>Create Password</td>
					<td><input type="password" name="npwd" required="required" /></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input type="password" name="cpwd" required="required" /></td>
				</tr>

				<tr>
					<td></td>
					<td colspan=2 align="right"><input type="submit"
						value="Register" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>