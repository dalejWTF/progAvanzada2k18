/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dalejwtf
 */
public class ManejadorProducto extends Conexion {
    
    public boolean Guardar(Producto producto){
        PreparedStatement ps=null;
        String sql="INSERT INTO productos (codigo,nombre,precio,cantidad) VALUES (?,?,?,?)";
        Connection con= getConnection();
        try {
            ps= con.prepareStatement(sql);
            ps.setString(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getCantidad());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getErrorCode());
            }
        }
    }
    
    public Producto Buscar(String codigoBusqueda){
        Producto busqueda=null;
        PreparedStatement statement=null;
        ResultSet resultado=null;
        
        String sql= "SELECT * FROM productos WHERE codigo= ? ";
        
        Connection con= getConnection();
        try {
            statement= con.prepareStatement(sql);
            statement.setString(1, codigoBusqueda);
            resultado=statement.executeQuery();
            
            if (resultado.first()) {
                String codigo=resultado.getString("codigo");
                String nombre=resultado.getString("nombre");
                double precio=resultado.getDouble("precio");
                int cantidad=resultado.getInt("cantidad");
                busqueda= new Producto(codigo, nombre, precio, cantidad);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getErrorCode());
            }
        }
        
        return busqueda;
    }

}
