package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    //private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/base";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "ghjuf2401";

    public static Connection getConnection() {
        Connection connection = null;

        try  {
            //Class.forName(DRIVER);
            connection = DriverManager.getConnection (URL, LOGIN, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;

    }

    // реализуйте настройку соеденения с БД
}
