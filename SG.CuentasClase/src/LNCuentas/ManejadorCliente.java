package LNCuentas;

import Clases.Canton;
import Clases.Cliente;
import Clases.Direccion;
import Clases.Provincia;
import DATCuentas.DATCliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.*;
/**
 * @author jbromero
 */
public class ManejadorCliente {

    public Cliente getCliente(String cedula) throws ClassNotFoundException, SQLException {
        DATCliente dATClienteCedula = new DATCliente();
        Cliente cliente = new Cliente();
        ResultSet rs = dATClienteCedula.ObtenerClienteCed(cedula);
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
            cliente.setId(11);
        }

        return cliente;
    }
    
    public ArrayList <Provincia> ObtenerProvincia() throws ClassNotFoundException, SQLException{
        ArrayList<Provincia>provincias= new ArrayList<>();
        DATCliente dATCliente= new DATCliente();
        ResultSet rs= dATCliente.ObtenerProvincia();
        while (rs.next()) {            
            Provincia provincia= new Provincia(rs.getInt(1),rs.getString(2));
            provincias.add(provincia);
        }
        
        return provincias;
    }
    
    public ArrayList <Canton> ObtenerCanton(int idProvincia) throws ClassNotFoundException, SQLException{
        ArrayList<Canton>cantones= new ArrayList<>();
        DATCliente dATCliente= new DATCliente();
        ResultSet rs= dATCliente.ObtenerCanton(idProvincia);
        while (rs.next()) {            
            Canton canton= new Canton(rs.getInt("id_canton"),rs.getInt("id_provincia"),rs.getString("canton"));
            cantones.add(canton);
        }
        
        return cantones;
    }
    
    public boolean ActualizarCliente(Cliente cliente, Canton cantonRes, Canton cantonTra) throws ClassNotFoundException, SQLException{
        PreparedStatement ps=null;
        DATCliente datc= new DATCliente();
        ps= datc.editarCliente(cliente, cantonRes, cantonTra);
        if (ps!=null) {
            ps.executeUpdate();
            return true;
        }else
            return false;
        
    }
    
    public boolean NuevoCliente(Cliente cliente, Canton cantonRes, Canton cantonTra) throws ClassNotFoundException, SQLException {
        DATCliente datc = new DATCliente();
        PreparedStatement ps = datc.Nuevo(cliente,cantonRes,cantonTra);
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
}
