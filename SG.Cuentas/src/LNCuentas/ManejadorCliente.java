/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LNCuentas;

import Clases.Cliente;
import Clases.Direccion;
import DATCuentas.DATCliente;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author dalejwtf
 */
public class ManejadorCliente {

    public Cliente getCliente(String cedula) throws ClassNotFoundException, SQLException {
        DATCliente dATClienteCedula = new DATCliente();
        Cliente cliente = new Cliente();
        ResultSet rs = dATClienteCedula.getCLienteCed(cedula);
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        while (rs.next()) {
            Direccion dirRes = new Direccion(rs.getString(5), rs.getString(6), rs.getString(7));
            Direccion dirTra = new Direccion(rs.getString(8), rs.getString(9), rs.getString(10));

            cliente.setCedula(rs.getString(1));
            cliente.setApellidos(rs.getString(2));
            cliente.setNombres(rs.getString(3));
            java.util.Date date = new Date(rs.getDate(4).getTime());
            cliente.setFechaNacimiento(date);
            cliente.setDirResidencia(dirRes);
            cliente.setDirTrabajo(dirTra);
            cliente.setId(rs.getInt(11));
            cliente.getDirResidencia().setId_provincia(rs.getInt(12));
            cliente.getDirResidencia().setId_canton(rs.getInt(13));
        }

        return cliente;
    }

    public boolean EditarCliente(Cliente cliente) throws ClassNotFoundException, SQLException {
        DATCliente dATClienteCedula = new DATCliente();
        PreparedStatement ps = dATClienteCedula.editarCliente(cliente);
        if (ps != null) {
            ps.executeUpdate();
            return true;
        } else {
            throw new SQLException();
        }
    }

    public boolean NuevoCliente(Cliente cliente) throws ClassNotFoundException, SQLException {
        DATCliente dATClienteCedula = new DATCliente();
        PreparedStatement ps = dATClienteCedula.Nuevo(cliente);
        if (ps != null) {
            ps.execute();
            return true;
        } else {
            throw new SQLException();
        }
    }

    public boolean EliminarCliente(String cedula) throws ClassNotFoundException, SQLException {
        DATCliente dATCliente = new DATCliente();
        PreparedStatement ps = dATCliente.Eliminar(cedula);
        if (ps != null) {
            ps.executeUpdate();
            return true;
        } else {
            throw new SQLException();
        }
    }

    public String[] getAllProvincias() throws ClassNotFoundException, SQLException {

        DATCliente dATCliente = new DATCliente();
        ArrayList<String> provincias = dATCliente.getAllProvincias();
        String[] all = new String[provincias.size()];
        for (int i = 0; i < all.length; i++) {
            all[i] = provincias.get(i);
        }
        return all;
    }

    public ArrayList<Direccion> getAllCantones() throws ClassNotFoundException, SQLException {

        DATCliente dATCliente = new DATCliente();
        ArrayList<Direccion> cantones = dATCliente.getAllCantones();

        return cantones;
    }
}
