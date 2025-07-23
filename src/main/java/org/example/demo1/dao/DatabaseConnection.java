package org.example.demo1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    public class DBConnection {
        private static final String URL = "jdbc:mysql://localhost:3306/fxsystem";
        private static final String USER = "your_username";
        private static final String PASSWORD = "your_password";
        private static Connection connection = null;

        public static Connection getConnection() throws SQLException {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            }
            return connection;
        }
    }
}
