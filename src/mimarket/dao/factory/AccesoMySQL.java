package mimarket.dao.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class AccesoMySQL {

    static Connection connection = null;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mimarket","root","root");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
