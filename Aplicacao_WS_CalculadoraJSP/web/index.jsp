<%-- 
    Document   : index
    Created on : 03/05/2017, 21:39:55
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Realizando Calculos:</h1>
            <%-- start web service invocation --%><hr/>
    <%
    try {
	web_service.WsCalculadora_Service service = new web_service.WsCalculadora_Service();
	web_service.WsCalculadora port = service.getWsCalculadoraPort();
	 // TODO initialize WS operation arguments here
	int a = 10;
	int b = 30;
	// TODO process result here
	int result = port.soma(a, b);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        
        
    </body>
</html>
