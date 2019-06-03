/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Max
 */
public class ClienteParticular extends Persona{

    public ClienteParticular() {
        super();
    }

    public ClienteParticular(String codigo, String nombre, String apellido, String telefono, Date fecha_nacimiento, String genero, String Dni, String direccion) {
        super(codigo, nombre, apellido, telefono, fecha_nacimiento, genero, Dni, direccion);
    }

    @Override
    public String toString() {
        return "ClienteParticular{" + super.toString() +'}';
    }
}
