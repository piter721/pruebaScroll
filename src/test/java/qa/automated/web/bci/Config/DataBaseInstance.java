package qa.automated.web.bci.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class DataBaseInstance {
    private static Connection conn;
    private static String login = "tycdata";
    private static String password = "c3er29se";
    private static String url = "jdbc:jtds:sybase://161.131.105.203:11000/journal";

    public static Connection getInstanceConnection() {
        if (!(conn instanceof Connection)) {
            System.out.println("Conectando a la BD.");
            try {          
                Class.forName("net.sourceforge.jtds.jdbc.Driver"); 
                conn = DriverManager.getConnection(url, login, password);            
            } catch (SQLException e) {
                System.out.println("Hubo problemas para conectarse a la DB");
                // TODO Auto-generated catch block
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DataBaseInstance.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(conn);
        return conn;
    }

    public static void closeConnection() {
        try {
            if (conn instanceof Connection) {
                conn.close();
                conn = null;
                System.out.println("Se ha cerrado la conexión de BD con exito.");
            }

        } catch (SQLException se) {
            System.out.println(se.toString());
            System.err.println("Se ha producido un error al cerrar la conexión de BD.");
            System.err.println(se.getMessage());
        }
    }
    
    
    public static void main(String[] args)
    {
        System.out.println("Iniciando Conexión");
        Connection connection = getInstanceConnection();        
        try {
            System.out.println("Vamos a mostrar los registros de la tablas Jen");
            Statement cmd = connection.createStatement();
            ResultSet rs = cmd.executeQuery("Select TOP 10 * from jen");
            while (rs.next())
            {
                System.out.println( "Este es el Rut: " + rs.getString("jen_rut_emp") + "|" + rs.getString("jen_id_evt") + "|" + rs.getString("jen_fec_evt_neg")   );
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseInstance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}