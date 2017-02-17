package mimarket.services;

import java.sql.Date;

public class SaleBO {
    private int userId;
    private String username;
    private int saleId;
    private Double saleTotal;
    private Date saleDate;

    public SaleBO() {
    }

    public SaleBO(int userId, String username, int saleId, Double saleTotal, Date saleDate) {
        this.userId = userId;
        this.username = username;
        this.saleId = saleId;
        this.saleTotal = saleTotal;
        this.saleDate = saleDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public Double getSaleTotal() {
        return saleTotal;
    }

    public void setSaleTotal(Double saleTotal) {
        this.saleTotal = saleTotal;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    @Override
    public String toString() {
        return "SaleBO{" + "userId=" + userId + ", username=" + username + ", saleId=" + saleId + ", saleTotal=" + saleTotal + ", saleDate=" + saleDate + '}';
    }
    
    
}
