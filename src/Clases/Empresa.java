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
public class Empresa {
    private String codigo;
    private String razon_social;
    private String ruc;
    private String telefono;
    private String direccion;
    private String representante;

    public Empresa() {
        this.codigo = "NNN";
        this.razon_social = "NNN";
        this.ruc = "NNN";
        this.telefono = "NNN";
        this.direccion = "NNN";
        this.representante = "NNN";
    }
    
    

    public Empresa(String codigo, String razon_social, String ruc, String telefono, String direccion, String representante) {
        this.codigo = codigo;
        this.razon_social = razon_social;
        this.ruc = ruc;
        this.telefono = telefono;
        this.direccion = direccion;
        this.representante = representante;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the razon_social
     */
    public String getRazon_social() {
        return razon_social;
    }

    /**
     * @param razon_social the razon_social to set
     */
    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    /**
     * @return the ruc
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * @param ruc the ruc to set
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the representante
     */
    public String getRepresentante() {
        return representante;
    }

    /**
     * @param representante the representante to set
     */
    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    @Override
    public String toString() {
        return "Empresa{" + "codigo=" + codigo + ", razon_social=" + razon_social + ", ruc=" + ruc + ", telefono=" + telefono + ", direccion=" + direccion + ", representante=" + representante + '}';
    }
}
