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
public class Vehiculo {
    protected String codigo;
    protected String placa;
    protected String marca;
    protected String color;
    protected String tipo_combustible;
    protected String tipo_transmicion;
    private Date fecha_adquisicion;

    public Vehiculo() {
        this.codigo = "NNN";
        this.placa = "NNN";
        this.marca = "NNN";
        this.color = "NNN";
        this.tipo_combustible = "NNN";
        this.tipo_transmicion = "NNN";
        this.fecha_adquisicion = new Date();
    }

    public Vehiculo(String codigo, String placa, String marca, String color, String tipo_combustible, String tipo_transmicion, Date fecha_adquisicion) {
        this.codigo = codigo;
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.tipo_combustible = tipo_combustible;
        this.tipo_transmicion = tipo_transmicion;
        this.fecha_adquisicion = fecha_adquisicion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    public String getTipo_transmicion() {
        return tipo_transmicion;
    }

    public void setTipo_transmicion(String tipo_transmicion) {
        this.tipo_transmicion = tipo_transmicion;
    }

    public Date getFecha_adquisicion() {
        return fecha_adquisicion;
    }

    public void setFecha_adquisicion(Date fecha_adquisicion) {
        this.fecha_adquisicion = fecha_adquisicion;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "codigo=" + codigo + ", placa=" + placa + ", marca=" + marca + ", color=" + color + ", tipo_combustible=" + tipo_combustible + ", tipo_transmicion=" + tipo_transmicion + ", fecha_adquisicion=" + fecha_adquisicion + '}';
    }
}
