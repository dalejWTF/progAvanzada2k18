/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_interfaces;

/**
 *
 * @author dalejwtf
 */
public class XOR implements Algoritmo {

    private int numero;
    private int num;

    public XOR() {

    }

    public XOR(int numero) {
        this.numero = numero;
        int max = 100;
        int min = 1;
        int range = (max - min) + 1;
        num = (int) (Math.random() * range) + min;
    }

    public int getNumero() {
        return numero;
    }

    public int getNum() {
        return num;
    }

    @Override
    public double encriptar() {
        boolean val = (getNumero() != 0);

        if (val == true) {
            System.out.println("El numero ha sido encriptado: " + val);
        }
        return 1;
    }

    @Override
    public double desencriptar() {
        return getNumero();
    }

}
