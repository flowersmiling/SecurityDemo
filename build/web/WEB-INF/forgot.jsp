<%-- 
    Document   : forgot
    Created on : 2022-4-6, 11:44:27
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
    </head>
    <body>
        <h1>Forgot Password</h1>
        <form action="forgot" method="post">
            Please enter your email address to retrieve your password.<br>
            Email Address: <input type="text" name="email"><br>
            <input type="submit" value="Submit">
        </form>
        <p>${msg}</p>
    </body>
</html>
