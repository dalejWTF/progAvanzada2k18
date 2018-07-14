package DATCuentas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author jbromero
 */
public class ConexionMySpl {

    private final String base = "datos";
    private final String usuari = "utpl";
    private final String clave = "utplutpl";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection con = null;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.url, this.usuari, this.clave);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
