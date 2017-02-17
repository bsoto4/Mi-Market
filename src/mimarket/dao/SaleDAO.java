package mimarket.dao;

import java.util.Date;
import java.util.ArrayList;
import mimarket.entity.SaleTO;
import mimarket.services.ProductBO;
import mimarket.services.SaleBO;


public interface SaleDAO {
    
    public boolean insertSale(SaleTO saleTO);
    public ArrayList<SaleTO> findSalesOfDay();
    public ArrayList<SaleTO> findSalesBetweenDates(Date start, Date end);
    public ArrayList<SaleBO> findSalesByUser(int userId);
    public boolean insertSaleDetail(ArrayList<ProductBO> products);
    public int getSaleId();
}
