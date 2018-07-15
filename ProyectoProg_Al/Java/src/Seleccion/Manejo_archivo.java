/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seleccion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Manejo_archivo {
    private Scanner entrada;
    
       public void abrirArchivo()
   {
      try
      {
         entrada = new Scanner( new File( "5000.txt" ) );
      } // fin de try
      catch ( FileNotFoundException fileNotFoundException )
      {
         System.err.println( "Error al abrir el archivo." );
         System.exit( 1 );
      } // fin de catch
   } // fin del m?todo abrirArchivo

   // lee registro del archivo
   public ArrayList<numeros> leerRegistros()
   {
      
      ArrayList<numeros> lista = new ArrayList<numeros>();
      try // lee registros del archivo, usando el objeto Scanner
      {
         
         while ( entrada.hasNext() )
         {
             // System.out.println(entrada.nextLine());
             String cadena = entrada.nextLine();
             ArrayList<String> registro = new ArrayList<String>(Arrays.asList(cadena.split(",")));
             int num = Integer.parseInt(registro.get(0));
             numeros e = new numeros(num);
             lista.add(e);
                    
         } // fin de while
      } // fin de try
      catch ( NoSuchElementException elementException )
      {
         System.err.println( "El archivo no esta bien formado." );
         entrada.close();
         System.exit( 1 );
      } // fin de catch
      catch ( IllegalStateException stateException )
      {
         System.err.println( "Error al leer del archivo." );
         System.exit( 1 );
      } // fin de catch
      return lista;
   } 
    
   public void cerrarArchivo()
   {
      if ( entrada != null )
         entrada.close(); // cierra el archivo
   } 
 public int[] transforar_arrayList_arreglo(ArrayList<numeros> l) {
    
        int c = l.size();
        int[] arreglo = new int[c];
        c=0;
        for (int i = 0; i < l.size(); i++) {
            arreglo[i] = l.get(i).getNumero();


        }

        return arreglo;
    }
    
}