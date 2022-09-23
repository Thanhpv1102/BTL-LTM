package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static final String URL = "jdbc:mysql://localhost:3306/qlsv_data";
    public static final String USER = "root";
    public static final String PASS = "123456";
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL,USER,PASS);
        } catch (SQLException | ClassNotFoundException e) {
            return null ;
        }
    }
}
