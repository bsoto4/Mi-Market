package mimarket.dao.factory;

import java.sql.Connection;
import mimarket.dao.ProductDAO;
import mimarket.dao.SaleDAO;
import mimarket.dao.UserDAO;
import mimarket.dao.mysql.MySQLProductDAO;
import mimarket.dao.mysql.MySQLSaleDAO;
import mimarket.dao.mysql.MySQLUserDAO;

public class MySQLFactoryDAO extends AbstractFactoryDAO {

    @Override
    public Connection getConnection() {
        return AccesoMySQL.getConnection();
    }

    @Override
    public ProductDAO getProductDAO() {
        return new MySQLProductDAO();
    }

    @Override
    public UserDAO getUserDAO() {
        return new MySQLUserDAO();
    }

    @Override
    public SaleDAO getSaleDAO() {
        return new MySQLSaleDAO();
    }

}
