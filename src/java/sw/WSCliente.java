/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package sw;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author DELL
 */
@WebService(serviceName = "WSCliente")
public class WSCliente {

    ArrayList<Cliente> listcliente = new ArrayList<>();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        for (int i = 0; i < listcliente.size(); i++) {
        }
        return listcliente.get(0).toString();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CrearCliente")
    public Boolean CrearCliente(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrase\u00f1a") String contraseña, @WebParam(name = "saldo") double saldo) {
        //TODO write your implementation code here:
        Cliente cliente = new Cliente(usuario, contraseña, saldo);
        for (int i = 0; i < listcliente.size(); i++) {
            if (listcliente.get(i).getUser().equals(usuario)) {
                return false;
            }
        }
        listcliente.add(cliente);
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public Boolean Login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrase\u00f1a") String contraseña) {
        //TODO write your implementation code here:
        for (int i = 0; i < listcliente.size(); i++) {
            if (listcliente.get(i).getUser().equals(usuario)
                    && listcliente.get(i).getPass().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ObtenerSaldo")
    public Double ObtenerSaldo(@WebParam(name = "user") String user) {
        //TODO write your implementation code here:
        for (int i = 0; i < listcliente.size(); i++) {
            if (listcliente.get(i).getUser().equals(user)) {
                return listcliente.get(i).getSaldo();
            }
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Retiro")
    public Boolean Retiro(@WebParam(name = "valor") double valor, @WebParam(name = "user") String user) {
        //TODO write your implementation code here:
        for (int i = 0; i < listcliente.size(); i++) {
            if (listcliente.get(i).getUser().equals(user)) {
                if (listcliente.get(i).getSaldo() < valor) {
                    return false;
                } else {
                    listcliente.get(i).setSaldo(listcliente.get(i).getSaldo() - valor);
                    return true;
                }
            }
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Deposito")
    public Boolean Deposito(@WebParam(name = "Valor") double Valor, @WebParam(name = "user") String user) {
        //TODO write your implementation code here:
        for (int i = 0; i < listcliente.size(); i++) {
            if (listcliente.get(i).getUser().equals(user)) {
                listcliente.get(i).setSaldo(listcliente.get(i).getSaldo() + Valor);
                return true;
            }
        }
        return false;
    }
}
