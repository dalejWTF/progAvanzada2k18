/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroemtregas;

/**
 *
 * @author dalejwtf
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int pos=0;
        //Array de tipo Personas para Empleados y Clientes
        Persona p[]= new Persona[3];
        //Objeto tipo Paquete para el cliente
        Paquete paquete= new Paquete("Computadora HP", 002354);
        //Actores
        //Bodeguero
        p[0]= new Empleado("Jose","Alvarado",1234);
        //Repartidor
        p[1]= new Empleado("Carlos","Vega",4567);
        //Cliente
        p[2]= new Cliente("Mercadillo y Bolivar","juanperez@etc.com",paquete,"Juan","Perez",2341);
        
        //Objeto tipo Sistema
        SistemaEntrega se= new SistemaEntrega("Importadora XYZ",p);
        System.out.println("Ingrese el codigo del paquete: ");
        System.out.println(paquete.getId());
        System.out.println("");
        pos=se.getCliente(paquete.getId());
        if (pos>0) {
            System.out.println("Cliente Encontrado!");
            System.out.println("========================================================================================================================================================================");
            System.out.printf("%10s %15s %15s %10s %10s %10s %19s %19s %25s\n"
                    ,"Codigo","Fecha Registro","Fecha Entrega","Nombre","Apellido","Paquete","Direccion","Estado","Observaciones");
            System.out.println("========================================================================================================================================================================");
            System.out.println(p[pos]);
        }else{
            System.out.println("Paquete no encontrado");
        }
        paquete.setFechaEntrega("18/04/2017");
        paquete.setObservacion("El paquete lo recibio esposa del cliente");
        System.out.println("");
        System.out.println("Se registro entrega");
        System.out.println("");
        System.out.println("========================================================================================================================================================================");
            System.out.printf("%10s %15s %15s %10s %10s %10s %19s %19s %25s\n"
                    ,"Codigo","Fecha Registro","Fecha Entrega","Nombre","Apellido","Paquete","Direccion","Estado","Observaciones");
            System.out.println("========================================================================================================================================================================");
        System.out.println(se.printClientes());
        
    }
    
}
