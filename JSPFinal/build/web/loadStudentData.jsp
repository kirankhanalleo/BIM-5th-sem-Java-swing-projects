<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
            <title>Student Data</title>
	</head>
	<body>
	 <h4>Student detail:</h4>
	 <jsp:useBean id="student" class="com.java2gui_kiran_A_19.StudentBean"/>
         <jsp:setProperty name="student" property="*"/>
         Name:<jsp:getProperty name="student" property="name"/><br><br>
         Roll :<jsp:getProperty name="student" property="roll"/><br><br>         
         Address :<jsp:getProperty name="student" property="address"/> 
	</body>
</html>


