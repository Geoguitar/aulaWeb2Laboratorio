/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web_service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Aluno
 */
@WebService(serviceName = "ws_calculadora")
public class ws_calculadora {

    @WebMethod(operationName = "soma")
    public int soma(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        int soma = a + b;
        return soma;
    }

  
    @WebMethod(operationName = "subtracao")
    public int subtracao(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        int subtracao = a - b;
        return subtracao;
    }
}
