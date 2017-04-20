<%-- 
    Document   : index
    Created on : 24/03/2017, 19:41:09
    Author     : Aluno
--%>

<%@page import="JavaBeans.Pessoa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% Pessoa obj_Pessoa = new Pessoa();
        obj_Pessoa.setNome("Jose");
        %>
        Pessoa = <%=obj_Pessoa.getNome()%>
    </body>
</html>
