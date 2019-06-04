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
public class EnvioEmpresa extends Envio{
    private ClienteEmpresa cliente_empresa;
    private DestinatarioEmpresa destinatarioE;
    private DestinatarioParticular destinatarioP;
    
    public EnvioEmpresa(){
        super();
        this.cliente_empresa = null;
        this.destinatarioE = null;
        this.destinatarioP = null;
    }

    public EnvioEmpresa(ClienteEmpresa cliente_empresa, DestinatarioEmpresa destinatarioE, DestinatarioParticular destinatarioP) {
        this.cliente_empresa = cliente_empresa;
        this.destinatarioE = destinatarioE;
        this.destinatarioP = destinatarioP;
    }

    public EnvioEmpresa(ClienteEmpresa cliente_empresa, DestinatarioEmpresa destinatarioE, DestinatarioParticular destinatarioP, String codigo, Empleado empleado, double costo, int[] dimension) {
        super(codigo, empleado, costo, dimension);
        this.cliente_empresa = cliente_empresa;
        this.destinatarioE = destinatarioE;
        this.destinatarioP = destinatarioP;
    }

    public ClienteEmpresa getCliente_empresa() {
        return cliente_empresa;
    }

    public void setCliente_empresa(ClienteEmpresa cliente_empresa) {
        this.cliente_empresa = cliente_empresa;
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
        return "EnvioEmpresa{" + super.toString() + "cliente_empresa=" + cliente_empresa + ", destinatarioE=" + destinatarioE + ", destinatarioP=" + destinatarioP + '}';
    } 
}
