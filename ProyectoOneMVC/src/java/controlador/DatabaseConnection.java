package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://silly.db.elephantsql.com:5432/ryrdxghc";
    private static final String USER = "ryrdxghc";
    private static final String PASSWORD = "KgIgOzduOPXJEdS2jOVPVPtayY9Ega8N";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
