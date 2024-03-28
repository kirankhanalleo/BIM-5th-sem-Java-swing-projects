<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Factorial | Kiran Khanal</title>
    </head>
    <body>
        <%!
            int factorial(int n){
                if (n == 0)
                    return 1;
                return n*factorial(n-1);
            }
        %>
        <h1><%= "Factorial of 10 is : "+factorial(10) %></h1>
    </body>
</html>
