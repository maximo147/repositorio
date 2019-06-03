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
public class Auto extends Vehiculo{
    private double carga_util;

    public Auto() {
        super();
        this.carga_util = 0.0;
    }

    public Auto(double carga_util, String codigo, String placa, String marca, String color, String tipo_combustible, String tipo_transmicion, Date fecha_adquisicion) {
        super(codigo, placa, marca, color, tipo_combustible, tipo_transmicion, fecha_adquisicion);
        this.carga_util = carga_util;
    }

    public double getCarga_util() {
        return carga_util;
    }

    public void setCarga_util(double carga_util) {
        this.carga_util = carga_util;
    }

    @Override
    public String toString() {
        return "Auto{" + super.toString() + "carga_util=" + carga_util + '}';
    }  
}
