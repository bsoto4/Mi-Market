package mimarket.controller;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mimarket.dao.ProductDAO;
import mimarket.dao.factory.AbstractFactoryDAO;
import mimarket.entity.ProductTO;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ProductBLL {

    private ProductDAO productDAO;

    public ProductBLL() {
        productDAO = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getProductDAO();
    }

    public boolean insertProduct(ProductTO productTO) {
        return productDAO.insertProduct(productTO);
    }

    public boolean updateProduct(ProductTO productTO) {
        return productDAO.updateProduct(productTO);
    }

    public boolean deleteProduct(int productId) {
        return productDAO.deleteProduct(productId);
    }

    public ArrayList<ProductTO> listAllProducts() {
        return productDAO.findAllProducts();
    }

    ;
    
    public ArrayList<ProductTO> listProductsBetweenPrices(double start, double end) {
        return productDAO.findProductsBetweenPrices(start, end);
    }

    ;
    
    public boolean processExcel(File excel, JTable tbl_products) {
        Workbook workbook;
        DefaultTableModel tableModel = new DefaultTableModel();
        tbl_products.setModel(tableModel);
        try {
            workbook = WorkbookFactory.create(new FileInputStream(excel));
            Sheet hoja = workbook.getSheetAt(0);
            Iterator iteFila = hoja.rowIterator();
            int indiceFila = -1;
            while (iteFila.hasNext()) {
                indiceFila++;
                Row fila = (Row) iteFila.next();
                Iterator iteColumna = fila.cellIterator();
                Object[] listaColumna = new Object[5];
                int indiceColumna = -1;
                while (iteColumna.hasNext()) {
                    indiceColumna++;
                    Cell celda = (Cell) iteColumna.next();
                    if (indiceFila == 0) {
                        tableModel.addColumn(celda.getStringCellValue());
                    } else {
                        if (celda != null) {
                            switch (celda.getCellType()) {
                                case Cell.CELL_TYPE_NUMERIC:
                                    listaColumna[indiceColumna] = celda.getNumericCellValue();
                                    break;
                                case Cell.CELL_TYPE_STRING:
                                    listaColumna[indiceColumna] = celda.getStringCellValue();
                                    break;
                                default:
                                    listaColumna[indiceColumna] = celda.getDateCellValue();
                            }
                        }
                    }
                }
                if (indiceFila != 0) {
                    tableModel.addRow(listaColumna);
                }
            }
        } catch (Exception e) {
            System.out.println("EROR PAPUP UP UP UP U PU P UP U");
            return false;
        }
        return true;
    }

    public boolean importExcel(JTable tbl_products) {
        int rows = tbl_products.getRowCount();
        ArrayList<ProductTO> products = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            ProductTO product = new ProductTO();
            product.setProductId((int) (double) tbl_products.getValueAt(row, 0));
            product.setProductName((String) tbl_products.getValueAt(row, 1));
            product.setProductPrice((double) tbl_products.getValueAt(row, 2));
            product.setProductUnits((String) tbl_products.getValueAt(row, 3));
            product.setProductStock((int) (double) tbl_products.getValueAt(row, 4));
            products.add(product);
        }
        return productDAO.importProducts(products);
    }
}
