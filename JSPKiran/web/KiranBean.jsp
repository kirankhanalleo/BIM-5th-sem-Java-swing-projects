<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bean JSP</title>
    </head>
    <body>
        <jsp:useBean id="student" class="com.java2gui_kiran_A_19.KiranBeanClass" />
        <jsp:setProperty name="student" property="id" value="001" />
        <jsp:setProperty name="student" property="name" value="Nishan Neyohang" />
        <jsp:setProperty name="student" property="programme" value="BIM" />
        <jsp:setProperty name="student" property="college" value="Nepal Commerce Campus" />
        Student Information: <br>
        Id: <jsp:getProperty name="student" property="id" /> <br>
        Name: <jsp:getProperty name="student" property="name" /> <br>
        Programme: <jsp:getProperty name="student" property="programme" /> <br>
        College: <jsp:getProperty name="student" property="college" /> <br>
    </body>
</html>
