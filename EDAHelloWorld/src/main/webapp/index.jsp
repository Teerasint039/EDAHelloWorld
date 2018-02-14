<%-- 
    Document   : index
    Created on : Feb 7, 2018, 4:06:51 PM
    Author     : Meen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World</title>
    </head>
    <body>
        <% 
        String mes = (String)request.getAttribute("message1");
        %>
        <h1><%=mes%></h1>
        ${mes}
    </body>
</html>


