package mimarket.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import mimarket.dao.ProductDAO;
import mimarket.dao.SaleDAO;
import mimarket.dao.UserDAO;
import mimarket.dao.mysql.MySQLProductDAO;
import mimarket.dao.mysql.MySQLSaleDAO;
import mimarket.dao.mysql.MySQLUserDAO;
import mimarket.entity.ProductTO;
import mimarket.entity.SaleTO;
import mimarket.entity.UserTO;
import mimarket.services.ProductBO;
import mimarket.services.SaleBO;

public class Test {

    public static void main(String[] args) throws ParseException {
//        UserDAO userDAO = new MySQLUserDAO();
//        System.out.println(userDAO.loginUser("admin", "admin").getUsername());
//        System.out.println(userDAO.updateUser(new UserTO(8,"admin22","admin22","admin")));
//        System.out.println(userDAO.deleteUser(2));
//        ArrayList<UserTO> users = userDAO.findAllUsers();
//        for (UserTO user : users) {
//            System.out.println(user.getUsername());
//        }
//
//        ProductDAO productDAO = new MySQLProductDAO();
//
//        System.out.println(productDAO.updateProduct(new ProductTO(6, "PROD1", "unidad", 50, 6.5)));
//        System.out.println(productDAO.deleteProduct(6));
//            
//        ArrayList<ProductTO> products = productDAO.findAllProducts();
//        for (ProductTO product : products) {
//            System.out.println(product.getProductName());
//        }

//        SaleDAO saleDAO = new MySQLSaleDAO();
//        ArrayList<SaleTO> sales = saleDAO.findSalesOfDay();
//        for (SaleTO sale : sales) {
//            System.out.println(sale.toString());
//        }

//        ArrayList<SaleBO> sales = saleDAO.findSalesByUser(1);
//        for (SaleBO sale : sales) {
//            System.out.println(sale.toString());
//        }
//        saleDAO.insertSale(new SaleTO(2,12));
//        ArrayList<ProductBO> detail = new ArrayList<>();
//        detail.add(new ProductBO(4,1,4,1));
//        detail.add(new ProductBO(4,3,1,3));
//        detail.add(new ProductBO(4,5,1,5));
//        saleDAO.insertSaleDetail(detail);
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//        Date start = sdf.parse("12-02-2017");
//        Date end = sdf.parse("17-02-2017");
//        ArrayList<SaleTO> sales = saleDAO.findSalesBetweenDates(start, end);
//        for (SaleTO sale : sales) {
//            System.out.println(sale.toString());
//        }
//        
//        MySQLSaleDAO asd = new MySQLSaleDAO();
//        System.out.println(asd.getSaleId());
        
        Object obj = 2.0;
        int id = ((int) (double) obj);
        System.out.println(id+"");
    }
}
