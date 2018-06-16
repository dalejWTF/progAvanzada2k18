/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author dalejwtf
 */
public class ManejadorProducto extends Conexion {

    public static int id;

    public boolean Guardar(Producto producto) {
        PreparedStatement ps = null;
        String sql = "INSERT INTO productos (codigo,nombre,precio,cantidad,fechaRegistro) VALUES (?,?,?,?,?)";
        Connection con = getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getCantidad());
            ps.setDate(5, producto.getSqlDate());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getErrorCode());
            }
        }
    }

    public Producto Buscar(String codigoBusqueda) {
        Producto busqueda = null;
        PreparedStatement statement = null;
        ResultSet resultado = null;

        String sql = "SELECT * FROM productos WHERE codigo= ? ";

        Connection con = getConnection();
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, codigoBusqueda);
            resultado = statement.executeQuery();

            if (resultado.first()) {
                String codigo = resultado.getString("codigo");
                String nombre = resultado.getString("nombre");
                double precio = resultado.getDouble("precio");
                int cantidad = resultado.getInt("cantidad");
                java.util.Date date = new Date(resultado.getDate("fechaRegistro").getTime());
                busqueda = new Producto(codigo, nombre, precio, cantidad, date);
                busqueda.setId(resultado.getInt("id"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getErrorCode());
            }
        }

        return busqueda;
    }

    public boolean Editar(Producto producto) {
        PreparedStatement ps = null;
        String sql = "UPDATE productos SET codigo = ? , nombre = ? , precio = ? , cantidad = ? , fechaRegistro= ? WHERE id = ?";
        Connection con = getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getCantidad());
            ps.setDate(5, producto.getSqlDate());
            ps.setInt(6, producto.getId());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getErrorCode());
            }
        }
    }

    public boolean Eliminar(int id) {
        PreparedStatement ps = null;
        String sql = "DELETE FROM productos WHERE id = ?";
        Connection con = getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getErrorCode());
            }
        }
    }

    public ArrayList<Producto> getAllProductos() {
        ArrayList<Producto> productos = new ArrayList<Producto>();

        try {
            Connection con = getConnection();
            Statement statement = con.createStatement();
            String s = "SELECT * FROM productos";

            ResultSet rs = statement.executeQuery(s);

            while (rs.next()) {

                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                int cantidad = rs.getInt("cantidad");
                java.util.Date date = new Date(rs.getDate("fechaRegistro").getTime());
                Producto producto = new Producto(codigo, nombre, precio, cantidad, date);
                producto.setId(rs.getInt("id"));

                productos.add(producto);
            }

            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return productos;
    }
}
