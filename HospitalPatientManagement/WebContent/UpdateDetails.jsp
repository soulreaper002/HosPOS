<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admit Patient</title>
<script>
function validate() {
	var x=document.myForm.pincode.value;
	if(x.length!=6 || x=="" || x.NaN==true)
		{
		alert("Please enter correct Pincode")
		return false;
		}
	return true;
}
</script>
</head>
<body>
	<div></div>
	<div>
		<form name="myForm" action="patientcontroller" onsubmit="return(validate())" method="post">
			<table>

				<tr>
					<td>First Name</td>
					<td><input type="text" name="F_name" required /> &nbsp &nbsp
						Middle Name &nbsp<input type="text" name="M_name" /> &nbsp &nbsp
						Last Name &nbsp<input type="text" name="L_name" required /></td>
				<tr>
					<td>Gender</td>
					<td><input type="radio" name="gender" value="male" required>Male
						&nbsp <input type="radio" name="gender" value="female" required />Female
						&nbsp <input type="radio" name="gender" value="others" required />Others
					</td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="text" name="age" required></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>Phone Number</td>
					<td><input type="text" name="phone" required></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><textarea name="address" rows="2" required>
					</textarea></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="text" name="pincode" placeholder="Pincode" />
						<input type="text" name="state" placeholder="State"/></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="text" name="country" placeholder="Country"></td>
				</tr>

				<td>Admit Date</td>
				<td><input type="date"  name="admitDate"></td>
				</tr>
				<tr>
					<td>WardId</td>
					<td><input type="text" name="wardId" required></td>
				</tr>
				</center>

			

			<tr align="right"><td></td><td><input type="submit" value="Admit"></td></tr>
			
</table>
		</form>
	</div>
</body>
</html>