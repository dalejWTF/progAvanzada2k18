/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;


public class Conexion {
    private final String base="datos";
    private final String usuario="utpl";
    private final String clave="utplutpl";
    private final String url="jdbc:mysql://localhost:3306/"+base;
    private Connection con=null;
    
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,usuario,clave);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return con;
    }
    
    
    
}
