package jm.task.core.jdbc.util;

import com.mysql.jdbc.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    // реализуйте настройку соеденения с БД

    private static final String dbName ="pre_user" ;
    private static final String USERNAME ="jm_user";
    private static final String PASSWORD ="jm_password" ;
    boolean useSSL = false;

    public static Connection getConnection() throws SQLException {
        Statement statement = null;
        java.sql.Connection con = null;
        statement = (Statement) con.createStatement();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connectionURL = "jdbc:mysql://localhost:3306/" + dbName + "useSSL";
            con = DriverManager.getConnection(connectionURL, USERNAME, PASSWORD);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error to connection with DB");
            System.exit(0);
        }

        return con;

    }


}
