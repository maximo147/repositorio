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
public class Tipo_Producto {
    private String codigo_tipo;
    private String nombre_tipo;

    public Tipo_Producto() {
        this.codigo_tipo = "NNN";
        this.nombre_tipo = "NNN";
    }

    public Tipo_Producto(String codigo_tipo, String nombre_tipo) {
        this.codigo_tipo = codigo_tipo;
        this.nombre_tipo = nombre_tipo;
    }

    /**
     * @return the codigo_tipo
     */
    public String getCodigo_tipo() {
        return codigo_tipo;
    }

    /**
     * @param codigo_tipo the codigo_tipo to set
     */
    public void setCodigo_tipo(String codigo_tipo) {
        this.codigo_tipo = codigo_tipo;
    }

    /**
     * @return the nombre_tipo
     */
    public String getNombre_tipo() {
        return nombre_tipo;
    }

    /**
     * @param nombre_tipo the nombre_tipo to set
     */
    public void setNombre_tipo(String nombre_tipo) {
        this.nombre_tipo = nombre_tipo;
    }

    @Override
    public String toString() {
        return "Tipo_Producto{" + "codigo_tipo=" + codigo_tipo + ", nombre_tipo=" + nombre_tipo + '}';
    }        
}
