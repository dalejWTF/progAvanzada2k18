package Seleccion;

// Fig 16.6: OrdenamientoSeleccion.java
// Clase que crea un arreglo lleno con enteros aleatorios.  
// Proporciona un m�todo para ordenar el arreglo mediante el ordenamiento por selecci�n.
import java.util.Random;

public class OrdenamientoSeleccion
{
   private int[] datos; // arreglo de valores
   
   // usa el constructor 
   public OrdenamientoSeleccion( int [] valores )
   {
      datos = valores;
   } // fin del constructor de OrdenamientoSeleccion

   // ordena el arreglo usando el ordenamiento por selecci�n
   public void ordenar()
   {
      int masPequenio; // �ndice del elemento m�s peque�o

      // itera a trav�s de datos.length - 1 elementos
      for ( int i = 0; i < datos.length - 1; i++ )
      {
         masPequenio = i; // primer �ndice del resto del arreglo

         // itera para buscar el �ndice del elemento m�s peque�o
         for ( int indice = i + 1; indice < datos.length; indice++ )
            if ( datos[ indice ] < datos[ masPequenio ] )
               masPequenio = indice;

         intercambiar( i, masPequenio ); // intercambia el elemento m�s peque�o en la posici�n
         imprimirPasada( i + 1, masPequenio ); // imprime la pasada del algoritmo
      } // fin de for exterior
   } // fin del m�todo ordenar

   // m�todo ayudante para intercambiar los valores de dos elementos
   public void intercambiar( int primero, int segundo )
   {
      int temporal = datos[ primero ]; // almacena primero en temporal
      datos[ primero ] = datos[ segundo ]; // sustituye primero con segundo
      datos[ segundo ] = temporal; // coloca temporal en segundo
   } // fin del m�todo intercambiar

   // imprime una pasada del algoritmo
   public void imprimirPasada( int pasada, int indice )
   {
      System.out.print( String.format( "despues de pasada %2d: ", pasada ) );

      // imprime elementos hasta el elemento seleccionado
      for ( int i = 0; i < indice; i++ )
         System.out.print( datos[ i ] + "  " );

      System.out.print( datos[ indice ] + "* " ); // indica intercambio

      // termina de imprmir el arreglo en pantalla
      for ( int i = indice + 1; i < datos.length; i++ )
         System.out.print( datos[ i ] + "  " );
     
      System.out.print( "\n               " ); // para alineaci�n

      // indica la cantidad del arreglo que est� almacenada
      for( int j = 0; j < pasada; j++ )
         System.out.print( "--  " );
      System.out.println( "\n" ); // agrega fin de l�nea
   } // fin del m�todo imprimirPasada

   // m�todo para imprimir los valores del arreglo
   public String toString()
   {
      StringBuilder temporal = new StringBuilder();

      // itera a trav�s del arreglo
      for ( int elemento : datos )
         temporal.append( elemento + "  " );

      temporal.append( "\n" ); // agrega car�cter de nueva l�nea
      return temporal.toString();
   } // fin del m�todo toString
} // fin de la clase OrdenamientoSeleccion


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