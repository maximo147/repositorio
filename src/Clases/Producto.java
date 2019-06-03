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
public class Producto {
    private String codigo_producto;
    private String nombre_producto;
    private Tipo_Producto untipo;
    private int cantidad;
    private String seccion;
    private int num_caja;
    private String descripcion;

    public Producto() {
        this.codigo_producto = "NNN";
        this.nombre_producto = "NNN";
        this.untipo = null;
        this.cantidad = 0;
        this.seccion = "NNN";
        this.num_caja = 0;
        this.descripcion = "NNN";
    }

    public Producto(String codigo_producto, String nombre_producto, Tipo_Producto untipo, int cantidad, String seccion, int num_caja, String descripcion) {
        this.codigo_producto = codigo_producto;
        this.nombre_producto = nombre_producto;
        this.untipo = untipo;
        this.cantidad = cantidad;
        this.seccion = seccion;
        this.num_caja = num_caja;
        this.descripcion = descripcion;
    }

    /**
     * @return the codigo_producto
     */
    public String getCodigo_producto() {
        return codigo_producto;
    }

    /**
     * @param codigo_producto the codigo_producto to set
     */
    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    /**
     * @return the nombre_producto
     */
    public String getNombre_producto() {
        return nombre_producto;
    }

    /**
     * @param nombre_producto the nombre_producto to set
     */
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    /**
     * @return the untipo
     */
    public Tipo_Producto getUntipo() {
        return untipo;
    }

    /**
     * @param untipo the untipo to set
     */
    public void setUntipo(Tipo_Producto untipo) {
        this.untipo = untipo;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the seccion
     */
    public String getSeccion() {
        return seccion;
    }

    /**
     * @param seccion the seccion to set
     */
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    /**
     * @return the num_caja
     */
    public int getNum_caja() {
        return num_caja;
    }

    /**
     * @param num_caja the num_caja to set
     */
    public void setNum_caja(int num_caja) {
        this.num_caja = num_caja;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo_producto=" + codigo_producto + ", nombre_producto=" + nombre_producto + ", untipo=" + untipo + ", cantidad=" + cantidad + ", seccion=" + seccion + ", num_caja=" + num_caja + ", descripcion=" + descripcion + '}';
    }
}
