/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATCuentas;

import Clases.Cliente;
import Clases.Cuenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dalejwtf
 */
public class DATCuenta {
    private ConexionMySpl conecta= new ConexionMySpl();
    
    public ResultSet obtenerRecurso() throws ClassNotFoundException, SQLException{
        Statement st= conecta.getConnection().createStatement();
        String sql="SELECT dc.id_detCatalogo, dc.detalle "
                + "FROM catalogo ca, detCatalogo dc "
                + "WHERE ca.id_catalogo=dc.id_catalogo "
                + "AND ca.catalogo= 'TIPOCUENTA'";
        return st.executeQuery(sql);
    }
    
    public ResultSet ObtenerCuenta(String nroCta) throws ClassNotFoundException, SQLException{
        
        Statement st= conecta.getConnection().createStatement();
        String sql= "SELECT c.numero,dc.detalle tipo, c.fecha_apertura, dce.detalle estado, c.saldo,c.id_cuenta FROM cuenta c, detCatalogo dc, detCatalogo dce WHERE c.numero="+nroCta+" AND c.tipo_cta= dc.id_detCatalogo AND c.estado_cta= dce.id_detCatalogo";
        return st.executeQuery(sql);
    }
    
    public ResultSet ObtenerResponsables(String nroCta) throws ClassNotFoundException, SQLException{
        Statement st= conecta.getConnection().createStatement();
        String sql= "SELECT cl.cedula, cl.apellidos, cl.nombres, cl.id_cliente FROM cuenta cu, cuentaCliente cc, cliente cl WHERE cu.numero="+nroCta+" AND cu.id_cuenta= cc.id_cuenta AND cc.id_cliente=cl.id_cliente";
        return st.executeQuery(sql);
        
    }
    
    public ResultSet getCLienteCed(String cedula) throws ClassNotFoundException, SQLException {
        
        String sql = "SELECT c.cedula, c.apellidos,c.nombres,c.fecha_nacimiento, pr.provincia provincia_res, cr.canton canton_res, c.calle_res, pt.provincia provincia_tra, ct.canton canton_tra, c.calle_tra, c.id_cliente, c.provincia_res, c.canton_res FROM cliente c,provincias pr, canton cr, provincias pt, canton ct WHERE c.provincia_res = pr.id_provincia AND c.canton_res = cr.id_canton AND  c.provincia_tra = pt.id_provincia AND c.canton_tra = ct.id_canton AND c.cedula=" + cedula;
        Statement st = conecta.getConnection().createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs;
    
    }
    
    public PreparedStatement agregarCliente(Cliente cliente, Cuenta cuenta) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO cuentaCliente (id_res, id_cuenta, id_cliente) VALUES (NULL, ?, ?);";
        PreparedStatement ps = null;
        ps = conecta.getConnection().prepareStatement(sql);
        ps.setInt(1, cuenta.getIdCuenta());
        ps.setInt(2, cliente.getId());
        return ps;
    }
    public PreparedStatement eliminarCliente(Cliente cliente) throws ClassNotFoundException, SQLException{
        String sql="DELETE FROM cuentaCliente WHERE cuentaCliente.id_cliente = ?;";
        PreparedStatement ps=null;
        ps= conecta.getConnection().prepareStatement(sql);
        ps.setInt(1, cliente.getId());
        return ps;
        
    }
    
    public PreparedStatement guardarCambiosCuenta(Cuenta cuenta,int estado, int index) throws SQLException{
        String sql="UPDATE cuenta SET tipo_cta = ?, estado_cta = ? WHERE cuenta.id_cuenta = ?;";
        PreparedStatement ps=conecta.getConnection().prepareStatement(sql);
        ps.setInt(1, index);
        ps.setInt(2, estado);
        ps.setInt(3, cuenta.getIdCuenta());
        return ps;
    }
    
}
