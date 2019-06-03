/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Max
 */
public class ClienteEmpresa extends Empresa{

    public ClienteEmpresa() {
    }

    public ClienteEmpresa(String codigo, String razon_social, String ruc, String telefono, String direccion, String representante) {
        super(codigo, razon_social, ruc, telefono, direccion, representante);
    }

    @Override
    public String toString() {
        return "ClienteEmpresa{" + super.toString() + '}';
    }
    
}
