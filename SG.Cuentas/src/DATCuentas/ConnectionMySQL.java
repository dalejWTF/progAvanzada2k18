/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATCuentas;

import java.sql.*;

/**
 *
 * @author dalejwtf
 */
public class ConnectionMySQL {

    private final String base = "datos";
    private final String user = "utpl";
    private final String pass = "utplutpl";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection con = null;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);

        return con;
    }

}
