/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase3;


/**
 *
 * @author dalejwtf
 */
public class EjercicioClase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1) Se inicializa el objeto Cliente");
        Cliente cliente = new Cliente("Daniel", "Ulloa", "1105002867", "M", "daulloa2", "1234", "El Valle");
        System.out.println("2) Se inicializa el objeto Pedido");
        Pedido pedidos= new Pedido(0001,"17/04/2018",cliente);
        System.out.println("3) Se hace busqueda de pedido con NroPedido=2");
        int b=pedidos.BuscarPedido(2);
        if (b>0) {
            System.out.println("El pedido se encuentra registrado");
        }
        else{
            System.err.println("Pedido no encontrado");
        }
        System.out.println("4) Se presenta el pedido");
        System.out.println(pedidos);
        System.out.println("5) Se hace busqueda de cliente por nombre");
        int x=cliente.BuscarCliente("daniel");
        if (x>0) 
            System.out.println("El Cliente se encuentra registrado");
        else
            System.err.println("Pedido no encontrado");
        System.out.println("6) Se modifica el nombre del Cliente");
        cliente.ModificarCliente(1, "Alejandro");
        System.out.println(pedidos);
        System.out.println("7) Se elimina el pedido con el nroPedido");
        pedidos.EliminarPedido(1);
        System.out.println(pedidos);
    }
    
}
