package com.br.bdprojeto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OrderDetails")
public class OrderDetailsModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int OrderID;
    @Column
    private double Discount;
    @Column
    private int ProductID;
    @Column
    private int Quantity;
    @Column
    private double UnitPrice;
    
    public double getDiscount() {
        return Discount;
    }
    
    public void setDiscount(double discount) {
        Discount = discount;
    }
    
    public int getProductID() {
        return ProductID;
    }
    
    public void setProductID(int productID) {
        ProductID = productID;
    }
    
    public int getQuantity() {
        return Quantity;
    }
    
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
    
    public double getUnitPrice() {
        return UnitPrice;
    }
    
    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }    
}
