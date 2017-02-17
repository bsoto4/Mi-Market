package mimarket.dao.factory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import mimarket.dao.ProductDAO;
import mimarket.dao.SaleDAO;
import mimarket.dao.UserDAO;

public abstract class AbstractFactoryDAO {

    public static final int MYSQL = 1;

    public abstract Connection getConnection();

    public abstract ProductDAO getProductDAO();

    public abstract UserDAO getUserDAO();

    public abstract SaleDAO getSaleDAO();

    public static AbstractFactoryDAO getFactory(int opcion) {
        switch (opcion) {
            case MYSQL:
                return new MySQLFactoryDAO();
            default:
                return null;
        }
    }

    public static void close(Connection c, Statement s, ResultSet r) {
        try {
            if (c != null) {
                c.close();
            }

            if (s != null) {
                s.close();
            }

            if (r != null) {
                r.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
