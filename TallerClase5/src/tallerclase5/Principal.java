/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerclase5;

/**
 *
 * @author dalejwtf
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Comision corporativo1= new VentasCorporativas("1234",2000,0.1);
        Comision agente1= new Agentes(3000,1,"Daniel","Alejandro",1110004234);
        Comision ventanilla1= new Ventanilla("Vendedor",5000,10,"Katherin","Jimenez",1111111);
        
        System.out.println(corporativo1);
        System.out.println("");
        System.out.println(agente1);
        System.out.println("");
        System.out.println(ventanilla1);
    }
    
}
