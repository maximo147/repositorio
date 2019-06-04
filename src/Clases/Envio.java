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
public class Envio {
    protected String codigo;
    protected Empleado empleado;
    protected double costo;
    protected int[] dimension = new int[3];

    public Envio() {
        this.codigo = "000";
        this.empleado = new Empleado();
        this.costo = 0.0;
        this.dimension = null;
        
    }

    
    
    public Envio(String codigo, Empleado empleado, double costo, int[] dimension) {
        this.codigo = codigo;
        this.empleado = empleado;
        this.costo = costo;
        this.dimension = dimension;
    }

    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int[] getDimension() {
        return dimension;
    }

    public void setDimension(int[] dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Envio{" + "codigo=" + codigo + ", empleado=" + empleado + ", costo=" + costo + ", dimension=" + dimension + '}';
    }
}
