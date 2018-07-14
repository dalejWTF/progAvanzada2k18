/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LNCuentas;

import Clases.Catalogo;
import Clases.Cliente;
import Clases.Cuenta;
import Clases.Direccion;
import DATCuentas.DATCuenta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.*;
/**
 *
 * @author dalejwtf
 */
public class ManejadorCuentas {
    
    public ArrayList<Catalogo> obtenerTipoCta() throws ClassNotFoundException, SQLException{
        DATCuenta dATCuenta= new DATCuenta();
        ResultSet rs= dATCuenta.obtenerRecurso();
        ArrayList<Catalogo> listaCatalogo= new ArrayList<>();
        while (rs.next()) {
            
            Catalogo c= new Catalogo(rs.getInt(1), rs.getString(2));
            listaCatalogo.add(c);
        }

        return listaCatalogo;
    }
    
    
    
    public Cuenta ObtenerCuenta(String nroCta) throws ClassNotFoundException, SQLException{
        DATCuenta dATCuenta= new DATCuenta();
        Cuenta c= new Cuenta();
        ArrayList<Cliente> listaCliente= new ArrayList<>();
        ResultSet rs= dATCuenta.ObtenerCuenta(nroCta);
        
        if (rs.next()) {
            
            ResultSet clientesResponsables=dATCuenta.ObtenerResponsables(nroCta);
            while (clientesResponsables.next()) {
                
                Cliente cl= new Cliente();
                cl.setCedula(clientesResponsables.getString(1));
                cl.setApellidos(clientesResponsables.getString(2));
                cl.setNombres(clientesResponsables.getString(3));
                cl.setId(clientesResponsables.getInt(4));
                listaCliente.add(cl);
                
            }
            
            c.setNroCta(nroCta);
            c.setTitularCta(listaCliente);
            c.setTipoCta(rs.getString("tipo"));
            c.setFechaApertura(rs.getDate("fecha_apertura"));
            c.setEstadoCta(rs.getString("estado"));
            c.setSaldo(rs.getDouble("saldo"));
            c.setIdCuenta(rs.getInt("id_cuenta"));
            
                    
        }
        
        return c;
    }
    
    public Cliente getCliente(String cedula) throws ClassNotFoundException, SQLException {
        DATCuenta dATClienteCedula = new DATCuenta();
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
            cliente.setFechaNacimiento(rs.getDate(4));
            cliente.setDirResidencia(dirRes);
            cliente.setDirTrabajo(dirTra);
            System.out.println(cliente.getId());
            cliente.setId(rs.getInt(11));
            cliente.getDirResidencia().setId_provincia(rs.getInt(12));
            cliente.getDirResidencia().setId_canton(rs.getInt(13));
        }

        return cliente;
    }
    
    
    public boolean AgregarCliente(Cliente cliente, Cuenta cuenta) throws ClassNotFoundException, SQLException {
        DATCuenta dATClienteCedula = new DATCuenta();
        PreparedStatement ps = dATClienteCedula.agregarCliente(cliente,cuenta);
        if (ps != null) {
            ps.executeUpdate();
            return true;
        } else {
            throw new SQLException();
        }
    }
    
    public boolean EliminarCliente(Cliente cliente) throws ClassNotFoundException, SQLException{
        DATCuenta datc= new DATCuenta();
        PreparedStatement ps= datc.eliminarCliente(cliente);
        if (ps!=null) {
            ps.executeUpdate();
            return true;
        }else{
            throw new SQLException();
        }
    }
    
    public boolean GuardarCambios(Cuenta cuenta,int estado, int index) throws ClassNotFoundException, SQLException{
        DATCuenta datc= new DATCuenta();
        PreparedStatement ps=datc.guardarCambiosCuenta(cuenta,estado, index);
        if (ps!=null) {
            ps.executeUpdate();
            return true;
        }else{
            throw new SQLException();
        }
    }
}
