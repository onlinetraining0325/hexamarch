<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="updatefinal">
		<center>
			Employ No : 
			<input type="number" name="empno"
					readonly="readonly"
				value=${employFound.empno} /> <br/><br/>
			Employ Name :
			<input type="text" name="name"
					value=${employFound.name} /> <br/><br/>
			Gender : 
			<input type="text" name="gender"
					value=${employFound.gender} /> <br/><br/>
			Department : 
			<input type="text" name="dept" 
				value=${employFound.dept} /> <br/><br/>
			Designation : 
			<input type="text" name="desig"
				value=${employFound.desig} /><br/><br/>	
			Basic : 
			<input type="number" name="basic"
				value=${employFound.basic} /><br/><br/>
			<input type="submit" value="Update" />
		</center>
	</form>
</body>
</html>