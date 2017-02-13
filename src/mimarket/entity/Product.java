package mimarket.entity;

public class Product {
    
    private int productId;
    private String productName;
    private String productUnits;
    private int productStock;
    private double productPrice;
    private int productQuantity;

    public Product() {
    }

    public Product(int productId, String productName, String productUnits, int productStock, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productUnits = productUnits;
        this.productStock = productStock;
        this.productPrice = productPrice;
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
        return "Producto: " + productName + "   Cantidad: " + productQuantity + "    Precio: " + productPrice + "    Subtotal: " + productPrice*productQuantity;
    }
    
}
