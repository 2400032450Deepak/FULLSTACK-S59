package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/klu59?useSSL=false&serverTimezone=UTC",
            "root",
            "0Successm@ntr@0"
        );
    }
}
