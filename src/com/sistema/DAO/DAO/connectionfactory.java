package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connectionfactory {
    private static String url
            = "jdbc:mysql://localhost:3306/teste?zeroDateTimeBehavior=CONVERT_TO_NULL&useTimezone=true&serverTimezone=UTC";
    private static String usuario = "root";
    private static String senha = "@Hrfq9cr9";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            Logger.getLogger(connectionfactory.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;
    }
}
