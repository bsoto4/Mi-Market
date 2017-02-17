package mimarket.entity;

public class ProductTO {
    
    private int saleId;
    private int productId;
    private String productName;
    private String productUnits;
    private int productStock;
    private double productPrice;
    private int productQuantity;

    public ProductTO() {
    }

    public ProductTO(int saleId, int productId, String productName, String productUnits, int productStock, double productPrice) {
        this.saleId = saleId;
        this.productId = productId;
        this.productName = productName;
        this.productUnits = productUnits;
        this.productStock = productStock;
        this.productPrice = productPrice;
    }

    public ProductTO(String productName, String productUnits, int productStock, double productPrice) {
        this.productName = productName;
        this.productUnits = productUnits;
        this.productStock = productStock;
        this.productPrice = productPrice;
    }

    public ProductTO(int productId, String productName, String productUnits, int productStock, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productUnits = productUnits;
        this.productStock = productStock;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductUnits() {
        return productUnits;
    }

    public void setProductUnits(String productUnits) {
        this.productUnits = productUnits;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity(){
        return productQuantity;
    }
    
    public void setProductQuantity(int productQuantity){
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return "ProductTO{" + "saleId=" + saleId + ", productId=" + productId + ", productName=" + productName + ", productUnits=" + productUnits + ", productStock=" + productStock + ", productPrice=" + productPrice + ", productQuantity=" + productQuantity + '}';
    }
    
    
}
