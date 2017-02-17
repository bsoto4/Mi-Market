package mimarket.entity;

import java.sql.Date;

public class SaleTO {
    
    private int userId;
    private int saleId;
    private double saleTotal;
    private Date saleDate;

    public SaleTO() {
    }

    public SaleTO(int userId, int saleId, double saleTotal, Date saleDate) {
        this.userId = userId;
        this.saleId = saleId;
        this.saleTotal = saleTotal;
        this.saleDate = saleDate;
    }

    public SaleTO(int userId, double saleTotal) {
        this.userId = userId;
        this.saleTotal = saleTotal;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public double getSaleTotal() {
        return saleTotal;
    }

    public void setSaleTotal(double saleTotal) {
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
        return "SaleTO{" + "userId=" + userId + ", saleId=" + saleId + ", saleTotal=" + saleTotal + ", saleDate=" + saleDate + '}';
    }
    
}
