package com.mickaelbrenoit.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singleton {
    public static final String DB_NAME = "inventory.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\Programs\\Java\\InventoryManagement\\db" + DB_NAME;

    private static Singleton instance = new Singleton();

    private Connection createConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
        } catch (SQLException e) {
            System.out.println("Couldn't connect to database: " + e.getMessage());
        }
        return conn;
    }

    public static Connection getConnection() {
        return instance.createConnection();
    }

}
