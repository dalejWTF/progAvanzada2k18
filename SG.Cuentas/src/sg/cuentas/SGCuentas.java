/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.cuentas;

import Clases.Cliente;
import GUICuentas.frmCliente;
import LNCuentas.ControlCliente;
import LNCuentas.ManejadorCliente;

/**
 *
 * @author dalejwtf
 */
public class SGCuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente= new Cliente();
        ManejadorCliente manejadorCliente= new ManejadorCliente();
        frmCliente frCliente= new frmCliente();
        ControlCliente controlCliente= new ControlCliente(cliente, manejadorCliente, frCliente);
        frCliente.setVisible(true);
    }
    
}
