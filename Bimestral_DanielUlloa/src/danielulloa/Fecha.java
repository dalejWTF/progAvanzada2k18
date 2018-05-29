/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielulloa;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author dalejwtf
 */
public class Fecha implements  Serializable{
        private SimpleDateFormat df; 
        private Date fecha;
        private String date;

    public Fecha(String date) {
        df= new SimpleDateFormat("dd/MM/yyyy");
        fecha=null;
        setFecha(date);
    }
        
        
        public String setFecha(String fecha){
            date=fecha;
            try{
            this.fecha = df.parse(date);                
        } catch (Exception e){ System.out.println("formato invalido");}
        
        if (!df.format(this.fecha).equals(date)){
            System.out.println("fecha invalida!!");
        }
        return fecha;
        }
    
        public String getFecha(){
            return date;
        }
        
        public int getDia(){
            String a=""+getFecha().charAt(0)+getFecha().charAt(1);
            int b= Integer.parseInt(a);
            return b;
        }
        
        public int getMes(){
            String a=""+getFecha().charAt(3)+getFecha().charAt(4);
            int b= Integer.parseInt(a);
            return b;
        }
        
        public int getAnio(){
            String a=""+getFecha().charAt(6)+getFecha().charAt(7)+getFecha().charAt(8)+getFecha().charAt(9);
            int b= Integer.parseInt(a);
            return b;
        }
        
}
