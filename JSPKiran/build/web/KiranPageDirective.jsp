<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page Directive | Kiran Khanal</title>
    </head>
    <body>
        <%@ page import="java.util.Date" %>  
        <h1>Today is: <%= new Date() %> </h1>
    </body>
</html>
