package com.br.bdprojeto.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Orders")
public class OrderModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int OrderID;
    @Column
    private String CustomerID;
    @Column
    private int EmployeeID;
    @Column
    private LocalDateTime OrderDate;
    @Column
    private LocalDateTime RequiredDate;
    @Column
    private LocalDateTime ShippedDate;
    @Column
    private int ShipVia;
    @Column
    private double Freight;
    @Column
    private String ShipName; 
    @Column
    private String ShipAddress;
    @Column
    private String ShipCity;
    @Column
    private String ShipRegion;
    @Column
    private String ShipPostalCode;
    @Column
    private String ShipCountry;
    @OneToMany(targetEntity = OrderDetailsModel.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk", referencedColumnName = "OrderID")
    private List<OrderDetailsModel> detalhes = new ArrayList<>();
    
    
    
    public int getOrderID() {
        return OrderID;
    }
    public void setOrderID(int orderID) {
        OrderID = orderID;
    }
    public String getCustomerID() {
        return CustomerID;
    }
    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }
    public int getEmployeeID() {
        return EmployeeID;
    }
    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }
    public LocalDateTime getOrderDate() {
        return OrderDate;
    }
    public void setOrderDate(LocalDateTime orderDate) {
        OrderDate = orderDate;
    }
    public LocalDateTime getRequiredDate() {
        return RequiredDate;
    }
    public void setRequiredDate(LocalDateTime requiredDate) {
        RequiredDate = requiredDate;
    }
    public LocalDateTime getShippedDate() {
        return ShippedDate;
    }
    public void setShippedDate(LocalDateTime shippedDate) {
        ShippedDate = shippedDate;
    }
    public int getShipVia() {
        return ShipVia;
    }
    public void setShipVia(int shipVia) {
        ShipVia = shipVia;
    }
    public double getFreight() {
        return Freight;
    }
    public void setFreight(double freight) {
        Freight = freight;
    }
    public String getShipName() {
        return ShipName;
    }
    public void setShipName(String shipName) {
        ShipName = shipName;
    }
    public String getShipAddress() {
        return ShipAddress;
    }
    public void setShipAddress(String shipAddress) {
        ShipAddress = shipAddress;
    }
    public String getShipCity() {
        return ShipCity;
    }
    public void setShipCity(String shipCity) {
        ShipCity = shipCity;
    }
    public String getShipRegion() {
        return ShipRegion;
    }
    public void setShipRegion(String shipRegion) {
        ShipRegion = shipRegion;
    }
    public String getShipPostalCode() {
        return ShipPostalCode;
    }
    public void setShipPostalCode(String shipPostalCode) {
        ShipPostalCode = shipPostalCode;
    }
    public String getShipCountry() {
        return ShipCountry;
    }
    public void setShipCountry(String shipCountry) {
        ShipCountry = shipCountry;
    }

    
}
