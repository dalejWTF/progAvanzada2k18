package DATCuentas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author jbromero
 */
public class ConexionMySql {
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
