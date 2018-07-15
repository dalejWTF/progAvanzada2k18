package insercion;

// Fig 16.8: OrdenamientoInsercion.java
// Clase que crea un arreglo lleno de enteros aleatorios.  
// Proporciona un m�todo para ordenar el arreglo mediante el ordenamiento por inserci�n.
import java.util.Random;

public class OrdenamientoInsercion
{
   private int[] datos; // arreglo de valores

   // crea un arreglo 
   public OrdenamientoInsercion( int [] valores )
   {
      datos = valores;
   } // fin del constructor de OrdenamientoInsercion

   // ordena el arreglo usando el ordenamiento por inserci�n
   public void sort()
   {
      int insercion; // variable temporal para contener el elemento a insertar

      // itera a trav�s de datos.length - 1 elementos
      for ( int siguiente = 1; siguiente < datos.length; siguiente++ )
      {
         // almacena el valor en el elemento actual
         insercion = datos[ siguiente ]; 

         // inicializa ubicaci�n para colocar el elemento
         int moverElemento = siguiente; 

         // busca un lugar para colocar el elemento actual
         while ( moverElemento > 0 && datos[ moverElemento - 1 ] > insercion )
         {
            // desplaza el elemento una posici�n a la derecha
            datos[ moverElemento ] = datos[ moverElemento - 1 ];
            moverElemento--;
         } // fin de while

         datos[ moverElemento ] = insercion; // coloca el elemento insertado
         imprimirPasada( siguiente, moverElemento ); // imprime la pasada del algoritmo
      } // fin de for
   } // fin del m�todo ordenar

   // imprime una pasada del algoritmo
   public void imprimirPasada( int pasada, int indice )
   {
      System.out.print( String.format( "despues de pasada %2d: ", pasada ) );

      // imprime los elementos hasta el elemento intercambiado
      for ( int i = 0; i < indice; i++ )
         System.out.print( datos[ i ] + "  " );

      System.out.print( datos[ indice ] + "* " ); // indica intercambio

      // termina de imprimir el arreglo en pantalla
      for ( int i = indice + 1; i < datos.length; i++ )
         System.out.print( datos[ i ] + "  " );
     
      System.out.print( "\n               " ); // para alineaci�n

      // indica la cantidad del arreglo que est� ordenado
      for( int i = 0; i <= pasada; i++ )
         System.out.print( "--  " );
      System.out.println( "\n" ); // agrega fin de l�nea
   } // fin del m�todo imprimirPasada

   // m�todo para mostrar los valores del arreglo en pantalla
   public String toString()
   {
      StringBuilder temporal = new StringBuilder();

      // itera a trav�s del arreglo
      for ( int elemento : datos )
         temporal.append( elemento + "  " );
     
      temporal.append( "\n" ); // agrega car�cter de fin de l�nea
      return temporal.toString();
   } // fin del m�todo toString
} // fin de la clase OrdenamientoInsercion


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
