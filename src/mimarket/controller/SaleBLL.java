package mimarket.controller;

import java.util.ArrayList;
import mimarket.dao.SaleDAO;
import mimarket.dao.factory.AbstractFactoryDAO;
import mimarket.entity.SaleTO;
import mimarket.services.ProductBO;

public class SaleBLL {
    
    private SaleDAO saleDAO;
    
    public SaleBLL() {
        saleDAO = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getSaleDAO();
    }
    
    public boolean newSale(SaleTO saleTO, ArrayList<ProductBO> products){
        saleDAO.insertSale(saleTO);
        saleDAO.insertSaleDetail(products);
        return true;
    }
    
    public int getSaleId(){
        return saleDAO.getSaleId();
    }
}
