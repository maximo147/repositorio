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
public class Persona {
    private String codigo;
    private String nombre;
    private String apellido;
    private String telefono;
    private Date fecha_nacimiento;
    private String genero;
    private String Dni;
    private String direccion;

    public Persona() {
        this.codigo = "NNN";
        this.nombre = "NNN";
        this.apellido = "NNN";
        this.telefono = "NNN";
        this.fecha_nacimiento = new Date();
        this.genero = "NNN";
        this.Dni = "NNN";
        this.direccion = "NNN";
    }
    
    public Persona(String codigo, String nombre, String apellido, String telefono, Date fecha_nacimiento, String genero, String Dni, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.genero = genero;
        this.Dni = Dni;
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", fecha_nacimiento=" + fecha_nacimiento + ", genero=" + genero + ", Dni=" + Dni + ", direccion=" + direccion + '}';
    } 
}
