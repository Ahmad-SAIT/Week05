<%-- 
    Document   : first
    Created on : Jun 3, 2023, 7:54:08 PM
    Author     : aalmasri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="home" method="get">
            Enter your text: <input type="text" name="txt" /> <br><br>
            <input type="submit" value="Save your text" />
        </form>
        <br>
        <form action="home" method="get">
            <input type="submit" value="Reset your text" />
            <input type="hidden" name="action" value="reset" />
        </form>
        
        <h3>Received: ${newText}</h3>
    </body>
</html>
