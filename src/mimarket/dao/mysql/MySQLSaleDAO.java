package mimarket.dao.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import mimarket.dao.SaleDAO;
import mimarket.dao.UserDAO;
import mimarket.dao.factory.AbstractFactoryDAO;
import mimarket.entity.SaleTO;
import mimarket.entity.UserTO;
import mimarket.services.ProductBO;
import mimarket.services.SaleBO;

public class MySQLSaleDAO implements SaleDAO {

    Connection cn = null;
    CallableStatement cs = null;
    ResultSet rs = null;
    String sql;

    @Override
    public boolean insertSale(SaleTO saleTO) {
        boolean insert = false;
        try {
            cn = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getConnection();
            String sql = "{call sp_insert_sale(?,?)}";
            cs = cn.prepareCall(sql);

            cs.setInt(1, saleTO.getUserId());
            cs.setDouble(2, saleTO.getSaleTotal());

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
    public ArrayList<SaleTO> findSalesOfDay() {
        ArrayList<SaleTO> sales = new ArrayList<>();
        try {
            cn = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getConnection();
            sql = "{call sp_sales_of_day()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery();

            while (rs.next()) {
                SaleTO saleTO = new SaleTO();
                saleTO.setUserId(rs.getInt(1));
                saleTO.setSaleId(rs.getInt(2));
                saleTO.setSaleDate(rs.getDate(3));
                saleTO.setSaleTotal(rs.getDouble(4));
                sales.add(saleTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            AbstractFactoryDAO.close(cn, cs, rs);
        }

        return sales;
    }

    @Override
    public ArrayList<SaleTO> findSalesBetweenDates(Date start, Date end) {
        ArrayList<SaleTO> sales = new ArrayList<>();
        try {
            cn = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getConnection();
            sql = "{call sp_sales_between_days(?,?)}";
            cs = cn.prepareCall(sql);
            cs.setDate(1, new java.sql.Date(start.getTime()));
            cs.setDate(2, new java.sql.Date(end.getTime()));
            rs = cs.executeQuery();

            while (rs.next()) {
                SaleTO saleTO = new SaleTO();
                saleTO.setUserId(rs.getInt(1));
                saleTO.setSaleId(rs.getInt(2));
                saleTO.setSaleDate(rs.getDate(3));
                saleTO.setSaleTotal(rs.getDouble(4));
                sales.add(saleTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            AbstractFactoryDAO.close(cn, cs, rs);
        }

        return sales;
    }

    @Override
    public ArrayList<SaleBO> findSalesByUser(int userId) {
        ArrayList<SaleBO> sales = new ArrayList<>();
        try {
            cn = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getConnection();
            sql = "{call sp_sale_by_user(?)}";
            cs = cn.prepareCall(sql);
            cs.setInt(1, userId);
            rs = cs.executeQuery();

            while (rs.next()) {
                SaleBO saleBO = new SaleBO();
                saleBO.setUserId(rs.getInt(1));
                saleBO.setUsername(rs.getString(2));
                saleBO.setSaleId(rs.getInt(3));
                saleBO.setSaleTotal(rs.getDouble(4));
                saleBO.setSaleDate(rs.getDate(5));
                sales.add(saleBO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            AbstractFactoryDAO.close(cn, cs, rs);
        }

        return sales;
    }

    @Override
    public boolean insertSaleDetail(ArrayList<ProductBO> products) {
        boolean insert = false;
        for (ProductBO product : products) {
            try {
                cn = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getConnection();
                String sql = "{call sp_insert_sale_detail(?,?,?,?)}";
                cs = cn.prepareCall(sql);

                cs.setInt(1, product.getSaleId());
                cs.setInt(2, product.getProductId());
                cs.setDouble(3, product.getProductQuantiy());
                cs.setDouble(4, product.getProductPrice());

                cs.execute();
                insert = true;
            } catch (Exception e) {
                e.printStackTrace();
                insert = false;
            } finally {
                AbstractFactoryDAO.close(cn, cs, rs);
            }
        }
        return insert;
    }

    @Override
    public int getSaleId() {
        int saleId = -1;
        try {
            cn = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getConnection();
            sql = "{call sp_sale_id()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery();

            if (rs.next()) {
                saleId = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            AbstractFactoryDAO.close(cn, cs, rs);
        }
        return saleId;
    }

}
