<%-- 
    Document   : test
    Created on : Nov 10, 2023, 9:47:28 PM
    Author     : huuduc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:set var="rm" value="${requestScope.data}"/>
        <h2>${rm}</h2>
    </body>
</html>
