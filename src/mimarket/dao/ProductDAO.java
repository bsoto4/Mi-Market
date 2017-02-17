package mimarket.dao;

import java.io.File;
import java.util.ArrayList;
import mimarket.entity.ProductTO;


public interface ProductDAO {
    
    public boolean insertProduct(ProductTO productTO);
    public boolean updateProduct(ProductTO productTO);
    public boolean deleteProduct(int productId);
    public ArrayList<ProductTO> findAllProducts();
    public ArrayList<ProductTO> findProductsBetweenPrices(double start, double end);
    public boolean importProducts(ArrayList<ProductTO> products);

}
