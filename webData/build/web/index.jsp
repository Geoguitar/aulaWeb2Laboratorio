<%-- 
    Document   : index
    Created on : 19/04/2017, 22:17:57
    Author     : Aluno
--%>

<%@page import="javaBean.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css">
        <title>TADS</title>
    </head>
    <body>
        <h1>Turma TADS e SI - Programação WEB II</h1>
        Boa Noite a todos<br>
        Felicidades! <br>
        <%
            int soma = 10;
            soma += 3;
            
            //Instancia da classe Cliente
            Cliente objCliente = new Cliente();
            //Utilizando o objeto
            objCliente.setNome("AlanPaulo");
        %>
        O nome do cliente é <%= objCliente.getNome()%>
        <h6>
            Data de hoje é:<br>
            Dia: Mês: Ano: <br>
            Hora: <br>
            Soma = <%=soma%>
            
        </h6>
    </body>
</html>
