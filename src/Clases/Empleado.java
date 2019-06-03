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
public class Empleado extends Persona{
    private TipoArea cargo;
    private double sueldo;
    private String categoria;

    public Empleado() {
        super();
        this.cargo = null;
        this.sueldo = 0.0;
        this.categoria = null;
    }

    public Empleado(TipoArea cargo, double sueldo, String codigo, String nombre, String apellido, String telefono, Date fecha_nacimiento, String genero, String documento, String direccion) {
        super(codigo, nombre, apellido, telefono, fecha_nacimiento, genero, documento, direccion);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public Empleado(TipoArea cargo, double sueldo, String categoria, String codigo, String nombre, String apellido, String telefono, Date fecha_nacimiento, String genero, String documento, String direccion) {
        super(codigo, nombre, apellido, telefono, fecha_nacimiento, genero, documento, direccion);
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.categoria = categoria;
    }
     

    public TipoArea getCargo() {
        return cargo;
    }

    public void setCargo(TipoArea cargo) {
        this.cargo = cargo;
    }



    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    
    @Override
    public String toString() {
        return "Empleado{" + super.toString() + "cargo=" + cargo + ", sueldo=" + sueldo + '}';
    }

    
 
}
