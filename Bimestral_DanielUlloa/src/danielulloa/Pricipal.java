/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielulloa;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dalejwtf
 */
public class Pricipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        ArrayList<Residencia> residencias = new ArrayList<>();
        ArrayList<Fecha> fechas = new ArrayList<>();
        EscribirArchivo ea= new EscribirArchivo();
        ea.AbrirArchivo();
        
        //Fechas de Creacion de Cuentas
        fechas.add(new Fecha("05/11/2010"));
        fechas.add(new Fecha("07/01/2017"));
        fechas.add(new Fecha("09/02/2014"));
        fechas.add(new Fecha("03/04/2015"));
        fechas.add(new Fecha("05/09/2013"));

        //Residencias
        residencias.add(new Residencia("loja", "loja", "Claude Debussi"));
        residencias.add(new Residencia("loja", "loja", "Argentia"));
        residencias.add(new Residencia("loja", "loja", "Uruguay"));
        residencias.add(new Residencia("loja", "loja", "Paraguay"));
        residencias.add(new Residencia("loja", "loja", "Lirios"));
        residencias.add(new Residencia("loja", "loja", "Sucre"));
        residencias.add(new Residencia("loja", "loja", "Mercadillo"));
        residencias.add(new Residencia("loja", "loja", "10 de Agosto"));
        residencias.add(new Residencia("loja", "loja", "18 de Noviembre"));

        //Clientes tipo Persona
        clientes.add(new ClientePersona("1234567", residencias.get(0), "Daniel", "Ulloa", "20"));
        clientes.add(new ClientePersona("1234567", residencias.get(1), "Daniel", "Ulloa", "20"));
        clientes.add(new ClientePersona("1234567", residencias.get(2), "Daniel", "Ulloa", "20"));
        clientes.add(new ClientePersona("1234567", residencias.get(3), "Daniel", "Ulloa", "20"));
        clientes.add(new ClientePersona("1234567", residencias.get(4), "Daniel", "Ulloa", "20"));
        clientes.add(new ClientePersona("1234567", residencias.get(5), "Daniel", "Ulloa", "20"));

        //Clientes tipo Empresa
        clientes.add(new ClienteEmpresa("23456", "Empresa QWERTY SA", (ClientePersona) clientes.get(0), residencias.get(6), "Carlos", "Benitez", "50"));
        clientes.add(new ClienteEmpresa("23456", "Empresa QWERTY SA", (ClientePersona) clientes.get(0), residencias.get(7), "Carlos", "Benitez", "50"));
        clientes.add(new ClienteEmpresa("23456", "Empresa QWERTY SA", (ClientePersona) clientes.get(0), residencias.get(8), "Carlos", "Benitez", "50"));

        //Cuentas creadas
        cuentas.add(new Cuenta("369852147", fechas.get(0), "Ahorro", clientes.get(0).getNombre(), 100));
        cuentas.add(new Cuenta("369852147", fechas.get(1), "Ahorro", clientes.get(1).getNombre(), 5000));
        cuentas.add(new Cuenta("369852147", fechas.get(2), "Ahorro", clientes.get(2).getNombre(), 50000));
        cuentas.add(new Cuenta("369852147", fechas.get(3), "Corriente", clientes.get(7).getNombre(), 80000));
        cuentas.add(new Cuenta("369852147", fechas.get(4), "Corriente", clientes.get(8).getNombre(), 25000));
        
        System.out.println("====================================================================");
        System.out.printf("%10s %10s %10s %10s %10s\n","Fecha","Nro Cta","Titular","Tipo","Saldo");
        System.out.println("====================================================================");
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta);
        }
        
        System.out.println("Se hace un retiro en la primera cuenta");
        cuentas.get(0).retiro(300);
        
        System.out.println("====================================================================");
        System.out.printf("%10s %10s %10s %10s %10s\n","Fecha","Nro Cta","Titular","Tipo","Saldo");
        System.out.println("====================================================================");
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta);
        }
        
        System.out.println("Se hace un deposito en la 3ra cuenta");
        cuentas.get(2).setDeposito(500);
        
        System.out.println("====================================================================");
        System.out.printf("%10s %10s %10s %10s %10s\n","Fecha","Nro Cta","Titular","Tipo","Saldo");
        System.out.println("====================================================================");
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta);
        }
        
        System.out.println("Se verifica que no se pueda retirar desde cuentas corrientes");
        cuentas.get(3).retiro(100);
        
        System.out.println("====================================================================");
        System.out.printf("%10s %10s %10s %10s %10s\n","Fecha","Nro Cta","Titular","Tipo","Saldo");
        System.out.println("====================================================================");
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta);
        }
        
        System.out.println("Se aumenta interes a las cuentas con la fecha establecida");
        for (Cuenta cuenta : cuentas) {
            cuenta.InteresMensual(new Fecha("29/05/2018"));
        }
        
        System.out.println("====================================================================");
        System.out.printf("%10s %10s %10s %10s %10s\n","Fecha","Nro Cta","Titular","Tipo","Saldo");
        System.out.println("====================================================================");
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta);
        }
        
        ea.CerrarArchivo();
    }

}
