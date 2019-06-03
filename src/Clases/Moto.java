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
public class Moto extends Vehiculo{
    private String cadena;

    public Moto() {
        super();
        this.cadena = "NNN";
    }

    public Moto(String cadena, String codigo, String placa, String marca, String color, String tipo_combustible, String tipo_transmicion, Date fecha_adquisicion) {
        super(codigo, placa, marca, color, tipo_combustible, tipo_transmicion, fecha_adquisicion);
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    @Override
    public String toString() {
        return "Moto{" + super.toString() + "cadena=" + cadena + '}';
    } 
}
