/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dalejwtf
 */
public class SistemaDeCompras {

    int nroF = 001;
    private ArrayList<Cliente> clientes;
    Cliente agg = new Cliente();
    private ArrayList<Pedido> pedido;
    Pedido add = new Pedido();

    private ArrayList<Producto> productos;

    Scanner k = new Scanner(System.in).useDelimiter("\n");
    String nombres, apellidos, identificacion, fecha, genero, usuario, contrasena;
    String continuar = "", exit = "";
    int opcion, elegir;

    public SistemaDeCompras() {
        clientes= new ArrayList<Cliente>();
        pedido= new ArrayList<Pedido>();
        productos= new ArrayList<Producto>();
        productos.add(new Producto(001, "Manzanas", 0.25, 100));
        productos.add(new Producto(002, "Peras", 0.40, 100));
        productos.add(new Producto(003, "Papayas", 0.50, 100));
        productos.add(new Producto(004, "Leche", 0.85, 100));
    }

    public void MenuPrincipal() {
        System.out.println("Menu Principal\n"
                + "[1]Sistema de Registro\n"
                + "[2]Comprar\n"
                + "[3]Facturar\n");
        System.out.print("opcion: ");
    }

    public void MenuRegistro() {
        System.out.println("Sistema de registro");
        System.out.println("[1]Registrar Usuario\n"
                + "[2]Buscar Usuario\n"
                + "[3]Editar Usuario\n"
                + "[4]Atras");
        System.out.print("Opcion: ");
    }

    public void MenuEditar() {
        System.out.println("[1]Editar nombre\n"
                + "[2]Editar apellido");
        System.out.println("opcion: ");
    }

    public void Agregar() {
        do {
            System.out.print("Ingrese nombre: ");
            nombres = k.next();
            System.out.print("Ingrese apellidos: ");
            apellidos = k.next();
            System.out.print("Ingrese identificacion: ");
            identificacion = k.next();
            System.out.print("Ingrese fecha nacimiento: ");
            fecha = k.next();
            System.out.print("Ingrese genero: ");
            genero = k.next();

            System.out.print("Ingrese usuario: ");
            usuario = k.next();
            System.out.print("Ingrese contraseña: ");
            contrasena = k.next();

            if (clientes.isEmpty()) {
                agg = new Cliente(nombres, apellidos, identificacion, fecha, genero, usuario, contrasena);
                clientes.add(agg);
            } else {
                for (Cliente cliente : clientes) {
                    while (cliente.getUsuario().equalsIgnoreCase(usuario) || cliente.getContrasena().equalsIgnoreCase(contrasena)) {
                        cliente.validarUsuarioContra(usuario, contrasena);
                        System.out.print("Ingrese usuario: ");
                        usuario = k.next();
                        System.out.print("Ingrese contraseña: ");
                        contrasena = k.next();
                    }
                }
                agg = new Cliente(nombres, apellidos, identificacion, fecha, genero, usuario, contrasena);
                clientes.add(agg);
            }

            System.out.println("Desea crear otro usuario(s/n)?: ");
            continuar = k.next();
        } while (continuar.equalsIgnoreCase("s"));
    }

    public void Buscar() {
        System.out.println("Ingrese el usuario a buscar: ");
        String user = k.next();
        int aux = 0;
        for (Cliente cliente : clientes) {
            aux = cliente.buscar(user);
            if (aux > 0) {
                System.out.println("Cliente encontrado!\n");
                System.out.printf("%20s %10s\n","Nombre","Usuario");
                System.out.println(cliente);
                System.out.println("");
            }
        }
        if (aux < 0) {
            System.err.println("Cliente no encontrado!");
        }
    }

    public void Editar() {
        int o;
        int b = 0;
        System.out.println("Ingrese el usuario a editar: ");
        String u = k.next();
        for (int i = 0; i < clientes.size(); i++) {
            int tmp = 0;
            tmp = clientes.get(i).buscar(u);
            if (tmp > 0) {
                b = i;
            }
        }
        System.out.println("[1]Editar nombre\n"
                + "[2]Editar apellido");
        System.out.println("opcion: ");
        o = k.nextInt();
        if (o == 1) {
            System.out.println("Ingrese nuevo nombre: ");
            String n = k.next();
            clientes.get(b).setNombres(n);
        } else if (o == 2) {
            System.out.println("Ingrese nuevo apellido: ");
            String ap = k.next();
            clientes.get(b).setApellidos(ap);
        }
    }

    public void Comprar() {
        int u = 0;
        ArrayList<Producto> p = new ArrayList<>();
        String seguir = "";
        System.out.println("Ingrese su usuario: ");
        String user = k.next();
        System.out.println("Ingrese su contraseña: ");
        String pass = k.next();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getUsuario().equalsIgnoreCase(user) && clientes.get(i).getContrasena().equalsIgnoreCase(pass)) {
                u = i;
                do {
                    System.out.println("======================== Productos ========================");
                    System.out.printf("%3s %20s %10s %10s", "ID", "Nombre", "Stock", "Costo\n");
                    System.out.println("==========================================================");
                    productos.forEach((producto) -> {
                        System.out.println(producto);
                    });
                    System.out.println("==========================================================");
                    System.out.println("Ingrese nombre de lo que desea comprar: ");
                    String product = k.next();
                    for (int j = 0; j < productos.size(); j++) {
                        if (productos.get(j).getNombre().equalsIgnoreCase(product)) {
                            System.out.printf("Ingrese cuantos %s desea comprar: ", productos.get(j).getNombre());
                            int compra = k.nextInt();
                            productos.get(j).setStock(productos.get(j).getStock() - compra);
                            p.add(new Producto(productos.get(j).getId(), productos.get(j).getNombre(), productos.get(j).getCosto(), compra));
                        }

                    }
                    System.out.println("Desea comprar algo mas(s/n)?: ");
                    seguir = k.next();
                } while (seguir.equalsIgnoreCase("S"));
                add = new Pedido(clientes.get(u), p, "07/07/2018");
                pedido.add(add);
            }
        }
    }

    public void Facturar() {
        System.out.println("Ingrese el cliente a facturar: ");
        String usr = k.next();
        int temp = 0;
        String tipoPago = "";

        for (int i = 0; i < pedido.size(); i++) {
            if (pedido.get(i).getCliente().getUsuario().equalsIgnoreCase(usr)) {
                temp = i;
                System.out.println("Tipo de pago: ");
                System.out.println("[1]Contado"
                        + "[2]Tarjeta de Credito");
                int j = k.nextInt();
                if (j == 1) {
                    tipoPago = "Contado";
                } else if (j == 2) {
                    tipoPago = "Tarjeta de Credito";
                }
            }
        }
        Factura f = new Factura(nroF, "17/07/2018", pedido.get(temp), tipoPago);
        nroF++;
        System.out.println(f);
    }
}
