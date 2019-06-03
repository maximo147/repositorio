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
public class TipoArea {
    private String codigo;
    private String nombre;

    public TipoArea() {
        this.codigo = "NNN";
        this.nombre = "NNN";
    }
    
    public TipoArea(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "TipoArea{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
}
