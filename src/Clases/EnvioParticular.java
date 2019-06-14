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
public class EnvioParticular extends Envio{
    private ClienteParticular cliente_particular;
    private DestinatarioEmpresa destinatarioE;
    private DestinatarioParticular destinatarioP;   

    public EnvioParticular() {
        this.cliente_particular = new ClienteParticular();
        this.destinatarioE = null;
        this.destinatarioP = null;
    }
    
    public EnvioParticular(ClienteParticular cliente_particular, DestinatarioEmpresa destinatarioE, String codigo, Empleado empleado, double costo, float peso, Departamento departamento, String descripcion) {
        super(codigo, empleado, costo, peso, departamento, descripcion);
        this.cliente_particular = cliente_particular;
        this.destinatarioE = destinatarioE;
    }

    public EnvioParticular(ClienteParticular cliente_particular, DestinatarioParticular destinatarioP, String codigo, Empleado empleado, double costo, float peso, Departamento departamento, String descripcion) {
        super(codigo, empleado, costo, peso, departamento, descripcion);
        this.cliente_particular = cliente_particular;
        this.destinatarioP = destinatarioP;
    }

    public ClienteParticular getCliente_particular() {
        return cliente_particular;
    }

    public void setCliente_particular(ClienteParticular cliente_particular) {
        this.cliente_particular = cliente_particular;
    }

    public DestinatarioEmpresa getDestinatarioE() {
        return destinatarioE;
    }

    public void setDestinatarioE(DestinatarioEmpresa destinatarioE) {
        this.destinatarioE = destinatarioE;
    }

    public DestinatarioParticular getDestinatarioP() {
        return destinatarioP;
    }

    public void setDestinatarioP(DestinatarioParticular destinatarioP) {
        this.destinatarioP = destinatarioP;
    }

    @Override
    public String toString() {
        return "EnvioParticular{" + super.toString() + "cliente_particular=" + cliente_particular + ", destinatarioE=" + destinatarioE + ", destinatarioP=" + destinatarioP + '}';
    }
    
    
    
    
    
}
