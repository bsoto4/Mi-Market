package mimarket.services;

public class ProductBO {
    private int saleId;
    private int productId;
    private int productQuantiy;
    private double productPrice;

    public ProductBO() {
    }

    public ProductBO(int saleId, int productId, int productQuantiy, double productPrice) {
        this.saleId = saleId;
        this.productId = productId;
        this.productQuantiy = productQuantiy;
        this.productPrice = productPrice;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductQuantiy() {
        return productQuantiy;
    }

    public void setProductQuantiy(int productQuantiy) {
        this.productQuantiy = productQuantiy;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "ProductBO{" + "saleId=" + saleId + ", productId=" + productId + ", productQuantiy=" + productQuantiy + ", productPrice=" + productPrice + '}';
    }
    
}
