package combinacion;

// Figura 16.11: PruebaOrdenamientoCombinacion.java

import java.util.ArrayList;

// Prueba la clase de ordenamiento por combinaci�n.
public class PruebaOrdenamientoCombinacion {

    public static void main(String[] args) {
          insercion.Manejo_archivo o = new insercion.Manejo_archivo();
        o.abrirArchivo();
      // crea objeto para realizar el ordenamiento por selecci�n
       ArrayList<insercion.numeros> listas = o.leerRegistros();
     
      
      o.cerrarArchivo();
      
       int []valor= o.transforar_arrayList_arreglo(listas);

       
        // crea un objeto para realizar el ordenamiento por combinaci�n
        OrdenamientoCombinacion arregloOrden = new OrdenamientoCombinacion(valor);

        // imprime el arreglo desordenado
        System.out.println("Desordenado:" + arregloOrden + "\n");

        arregloOrden.ordenar(); // ordena el arreglo

        // imprime el arreglo ordenado
        System.out.println("Ordenado:   " + arregloOrden);
    } // fin de main
} // fin de la clase PruebaOrdenamientoCombinacion


/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/