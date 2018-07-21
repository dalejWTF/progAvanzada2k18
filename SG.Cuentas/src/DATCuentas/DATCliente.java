/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATCuentas;

import Clases.Cliente;
import Clases.Direccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author dalejwtf
 */
public class DATCliente extends ConnectionMySQL {

    public ResultSet getCLienteCed(String cedula) throws ClassNotFoundException, SQLException {
        Connection conecta = getConnection();
        String sql = "SELECT c.cedula, c.apellidos,c.nombres,c.fecha_nacimiento, "
                + "pr.provincia provincia_res, cr.canton canton_res, c.calle_res,"
                + " pt.provincia provincia_tra, ct.canton canton_tra, c.calle_tra, "
                + "c.id_cliente, c.provincia_res, c.canton_res FROM cliente c,provincias pr,"
                + " canton cr, provincias pt, canton ct "
                + "WHERE c.provincia_res = pr.id_provincia AND c.canton_res = cr.id_canton"
                + " AND  c.provincia_tra = pt.id_provincia AND c.canton_tra = ct.id_canton AND c.cedula=" + cedula;
        Statement st = conecta.createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }

    public PreparedStatement editarCliente(Cliente cliente) throws ClassNotFoundException, SQLException {
        PreparedStatement ps = null;
        Connection conecta = getConnection();
        String sql = "UPDATE cliente SET cedula = ?, apellidos = ?, nombres= ?,fecha_nacimiento = ?, calle_res = ?, calle_tra = ?, provincia_res= ?, canton_res= ?, provincia_tra= ?, canton_tra= ?  WHERE cliente.id_cliente = ?";
        ps = conecta.prepareStatement(sql);
        ps.setString(1, cliente.getCedula());
        ps.setString(2, cliente.getApellidos());
        ps.setString(3, cliente.getNombres());
        ps.setDate(4, cliente.getSqlDate());
        ps.setString(5, cliente.getDirResidencia().getCalle());
        ps.setString(6, cliente.getDirTrabajo().getCalle());
        ps.setInt(7, cliente.getDirResidencia().getId_provincia());
        ps.setInt(8, cliente.getDirResidencia().getId_canton());
        ps.setInt(9, cliente.getDirTrabajo().getId_provincia());
        ps.setInt(10, cliente.getDirTrabajo().getId_canton());
        ps.setInt(11, cliente.getId());

        return ps;
    }

    public PreparedStatement Nuevo(Cliente cliente) throws ClassNotFoundException, SQLException {
        PreparedStatement ps = null;
        String sql = "INSERT INTO cliente (cedula, apellidos, nombres, fecha_nacimiento, provincia_res, canton_res, calle_res, provincia_tra, canton_tra, calle_tra) VALUES (?,?,?,?,?,?,?,?,?,?)";
        Connection con = getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, cliente.getCedula());
        ps.setString(2, cliente.getApellidos());
        ps.setString(3, cliente.getNombres());
        ps.setDate(4, cliente.getSqlDate());
        ps.setInt(5, cliente.getDirResidencia().getId_provincia());
        ps.setInt(6, cliente.getDirResidencia().getId_canton());
        ps.setString(7, cliente.getDirResidencia().getCalle());
        ps.setInt(8, cliente.getDirTrabajo().getId_provincia());
        ps.setInt(9, cliente.getDirTrabajo().getId_canton());
        ps.setString(10, cliente.getDirTrabajo().getCalle());
        return ps;

    }

    public PreparedStatement Eliminar(String cedula) throws ClassNotFoundException, SQLException {
        PreparedStatement ps = null;
        Connection conecta = getConnection();
        String sql = "DELETE FROM cliente WHERE cedula = ?" ;
        ps = conecta.prepareStatement(sql);
        ps.setString(1, cedula);
        return ps;

    }

    public ArrayList<String> getAllProvincias() throws ClassNotFoundException, SQLException {
        Connection conecta = getConnection();
        Statement statement = conecta.createStatement();
        String sql = "SELECT * FROM provincias";
        ArrayList<String> s = new ArrayList<>();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            s.add(rs.getString("provincia"));
        }
        return s;
    }

    public ArrayList<Direccion> getAllCantones() throws ClassNotFoundException, SQLException {
        Connection conecta = getConnection();
        Statement statement = conecta.createStatement();
        String sql = "SELECT * FROM canton";
        ArrayList<Direccion> s = new ArrayList<>();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            Direccion d = new Direccion(rs.getString("canton"), rs.getInt("id_provincia"), rs.getInt("id_canton"));
            s.add(d);

        }
        return s;
    }

}
