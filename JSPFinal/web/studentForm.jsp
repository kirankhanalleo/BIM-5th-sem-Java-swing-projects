<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Form</title>
    </head>
    <body>
        <h4>Enter student details</h4> 
		<form action="loadStudentData.jsp" method="post"> 
		Name:  <input type="text" name="name"><br/><br/> 
		Roll No: <input type="text" name="roll"><br/><br/> 
                Address: <input type="text" name="address"><br/><br/> 
		<input type="submit" value="Register Student"> 
		</form> 
    </body>
</html>
