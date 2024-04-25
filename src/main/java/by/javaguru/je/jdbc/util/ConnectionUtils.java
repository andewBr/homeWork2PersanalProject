package by.javaguru.je.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {

    private static String url = "db.url";
    private static String user = "db.user";
    private static String password = "db.password";

//  db.url=jdbc:postgresql://localhost:5432/garbage_database
//  db.username=postgres
//  db.password=root

    static {
        open();
    }

    public static Connection open() {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/garbage_database",
                    "postgres",
                    "root");
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
