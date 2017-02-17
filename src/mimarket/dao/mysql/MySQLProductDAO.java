package mimarket.dao.mysql;

import java.io.File;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import mimarket.dao.ProductDAO;
import mimarket.dao.factory.AbstractFactoryDAO;
import mimarket.entity.ProductTO;
import mimarket.entity.UserTO;

public class MySQLProductDAO implements ProductDAO {

    Connection cn = null;
    CallableStatement cs = null;
    ResultSet rs = null;
    String sql;

    @Override
    public boolean insertProduct(ProductTO productTO) {
        boolean insert = false;
        try {
            cn = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getConnection();
            String sql = "{call sp_insert_product(?,?,?,?)}";
            cs = cn.prepareCall(sql);

            cs.setString(1, productTO.getProductName());
            cs.setString(2, productTO.getProductUnits());
            cs.setInt(3, productTO.getProductStock());
            cs.setDouble(4, productTO.getProductPrice());

            cs.execute();
            insert = true;
        } catch (Exception e) {
            e.printStackTrace();
            insert = false;
        } finally {
            AbstractFactoryDAO.close(cn, cs, rs);
        }
        return insert;
    }

    @Override
    public boolean updateProduct(ProductTO productTO) {
        boolean update = false;
        try {
            cn = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getConnection();
            String sql = "{call sp_update_product(?,?,?,?,?)}";
            cs = cn.prepareCall(sql);

            cs.setInt(1, productTO.getProductId());
            cs.setString(2, productTO.getProductName());
            cs.setString(3, productTO.getProductUnits());
            cs.setInt(4, productTO.getProductStock());
            cs.setDouble(5, productTO.getProductPrice());

            cs.execute();
            update = true;
        } catch (Exception e) {
            e.printStackTrace();
            update = false;
        } finally {
            AbstractFactoryDAO.close(cn, cs, rs);
        }
        return update;
    }

    @Override
    public boolean deleteProduct(int productId) {
        boolean delete = false;
        try {
            cn = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getConnection();
            String sql = "{call sp_delete_product(?)}";
            cs = cn.prepareCall(sql);

            cs.setInt(1, productId);

            cs.execute();
            delete = true;
        } catch (Exception e) {
            e.printStackTrace();
            delete = false;
        } finally {
            AbstractFactoryDAO.close(cn, cs, rs);
        }
        return delete;
    }

    @Override
    public ArrayList<ProductTO> findAllProducts() {
        ArrayList<ProductTO> products = new ArrayList<>();
        try {
            cn = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getConnection();
            sql = "{call sp_find_all_products()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery();

            while (rs.next()) {
                ProductTO productTO = new ProductTO();
                productTO.setProductId(rs.getInt(1));
                productTO.setProductName(rs.getString(2));
                productTO.setProductUnits(rs.getString(3));
                productTO.setProductStock(rs.getInt(4));
                productTO.setProductPrice(rs.getDouble(5));
                products.add(productTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            AbstractFactoryDAO.close(cn, cs, rs);
        }

        return products;
    }

    @Override
    public ArrayList<ProductTO> findProductsBetweenPrices(double start, double end) {
        ArrayList<ProductTO> products = new ArrayList<>();
        try {
            cn = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getConnection();
            sql = "{call sp_find_products_between_prices(?,?)}";
            cs = cn.prepareCall(sql);
            cs.setDouble(1, start);
            cs.setDouble(2, end);
            rs = cs.executeQuery();

            while (rs.next()) {
                ProductTO productTO = new ProductTO();
                productTO.setProductId(rs.getInt(1));
                productTO.setProductName(rs.getString(2));
                productTO.setProductUnits(rs.getString(3));
                productTO.setProductStock(rs.getInt(4));
                productTO.setProductPrice(rs.getDouble(5));
                products.add(productTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            AbstractFactoryDAO.close(cn, cs, rs);
        }

        return products;
    }

    @Override
    public boolean importProducts(ArrayList<ProductTO> products) {
        for (ProductTO product : products) {
            if (!insertProduct(product)){
                return false;
            }
        }
        return true;
    }


}
