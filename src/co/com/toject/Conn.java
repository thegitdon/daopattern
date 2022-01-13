/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.toject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ronald.giron
 */
public class Conn {

    private final String url = "jdbc:postgresql://localhost:5432/test22";
    private final String user = "postgres";
    private final String password = "passPOS";

    public Connection toConnect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully!" + "\n");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    //cerrar Conn (?)
}
