package DATCuentas;

import Clases.Canton;
import Clases.Cliente;
import Clases.Provincia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author jbromero
 */
public class DATCliente {

    private ConexionMySql coneta = new ConexionMySql();

    public ResultSet ObtenerClienteCed(String Cedula) throws ClassNotFoundException, SQLException {
        String spl = "SELECT c.cedula, c.apellidos,c.nombres,c.fecha_nacimiento, pr.provincia provincia_res, cr.canton canton_res, c.calle_res, pt.provincia provincia_tra, ct.canton canton_tra, c.calle_tra, c.id_cliente, c.provincia_res, c.canton_res FROM cliente c,provincias pr, canton cr, provincias pt, canton ct WHERE c.provincia_res = pr.id_provincia AND c.canton_res = cr.id_canton AND  c.provincia_tra = pt.id_provincia AND c.canton_tra = ct.id_canton AND c.cedula=" + Cedula;
        Statement consulta = coneta.getConnection().createStatement();
        return consulta.executeQuery(spl);
    }
    
    public ResultSet ObtenerProvincia() throws ClassNotFoundException, SQLException{
        Statement s= coneta.getConnection().createStatement();
        String sql="SELECT * FROM provincias";
        return s.executeQuery(sql);
        
    }
    
    public ResultSet ObtenerCanton(int id_provincia) throws ClassNotFoundException, SQLException{
        Statement s= coneta.getConnection().createStatement();
        String sql="SELECT * FROM canton WHERE id_provincia="+id_provincia;
        return s.executeQuery(sql);
        
    }
    
    public PreparedStatement editarCliente(Cliente cliente, Canton cantonRes, Canton cantonTra) throws ClassNotFoundException, SQLException {
        
        String sql = "UPDATE cliente SET cedula = ?,"
                + " apellidos = ?,"
                + " nombres= ?, "
                + " fecha_nacimiento = ?,"
                + " calle_res = ?,"
                + " calle_tra = ?,"
                
                + " provincia_res= ?,"
                + " canton_res= ?,"
                + " provincia_tra= ?,"
                + " canton_tra= ?"
                + " WHERE cliente.id_cliente = ?";
        PreparedStatement ps = coneta.getConnection().prepareStatement(sql);
        ps.setString(1, cliente.getCedula());
        ps.setString(2, cliente.getApellidos());
        ps.setString(3, cliente.getNombres());
        ps.setDate(4, cliente.getFechaNacimiento());
        ps.setString(5, cliente.getDirResidencia().getCalle());
        ps.setString(6, cliente.getDirTrabajo().getCalle());
        ps.setInt(7, cantonRes.getId_provincia());
        ps.setInt(8, cantonRes.getId_canton());
        ps.setInt(9, cantonTra.getId_provincia());
        ps.setInt(10, cantonTra.getId_canton());
        ps.setInt(11, cliente.getId());

        return ps;
    }
    
    public PreparedStatement Nuevo(Cliente cliente,Canton cantonRes, Canton cantonTra) throws ClassNotFoundException, SQLException {
        
        String sql = "INSERT INTO cliente (cedula, apellidos, nombres, fecha_nacimiento, provincia_res, canton_res, calle_res, "
                + "provincia_tra, canton_tra, calle_tra) VALUES (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = coneta.getConnection().prepareStatement(sql);
        ps.setString(1, cliente.getCedula());
        ps.setString(2, cliente.getApellidos());
        ps.setString(3, cliente.getNombres());
        ps.setDate(4, cliente.getFechaNacimiento());
        ps.setInt(5, cantonRes.getId_provincia());
        ps.setInt(6, cantonRes.getId_canton());
        ps.setString(7, cliente.getDirResidencia().getCalle());
        ps.setInt(8, cantonTra.getId_provincia());
        ps.setInt(9, cantonTra.getId_canton());
        ps.setString(10, cliente.getDirTrabajo().getCalle());
        return ps;

    }
    
    public PreparedStatement Eliminar(String cedula) throws ClassNotFoundException, SQLException {
        PreparedStatement ps = null;
        String sql = "DELETE FROM cliente WHERE cedula = ?" ;
        ps = coneta.getConnection().prepareStatement(sql);
        ps.setString(1, cedula);
        return ps;

    }
}
